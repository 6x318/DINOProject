package admin.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import admin.action.*;
import vo.*;

@WebServlet("*.ctrl")
public class AdminCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public AdminCtrl() {
        super();
    }
    
    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// ������� ��û�� get�̵� post�̵� ��� ó���ϴ� �޼ҵ�
    		request.setCharacterEncoding("utf-8");
    		String requestUri = request.getRequestURI();
    		String contextPath = request.getContextPath();
    		String command = requestUri.substring(contextPath.length());

    		ActionForward forward = null;
    		action.Action action = null;

    		// ������� ��û ������ ���� ���� �ٸ� action�� ����
    		switch (command) {
    			case "/admin_in_form.ctrl" :		// admin popup��� ��
    				action = new AdminInFormAction();		break;
    			case "/admin_in_proc.ctrl" :		// admin popup��� ó��
    				action = new AdminInProcAction();		break;
    			case "/admin_list.ctrl" :			// /admin/ctrl.jsp ȭ��
    				action = new AdminListAction();		break;
    			case "/admin_view.ctrl" :			// admin popup���� ȭ��
    				action = new AdminViewAction();		break;
    			case "/admin_up_form.ctrl" :		// admin popup���� ��
    				action = new AdminUpFormAction();		break;
    			case "/admin_up_proc.ctrl" :		// admin ���� ó��
    				action = new AdminUpProcAction();		break;
    		}

    		try {
    			forward = action.execute(request, response);
    		} catch (Exception e) {
    			e.printStackTrace();
    		}

    		if (forward != null) {
    			if (forward.isRedirect()) {
    				response.sendRedirect(forward.getPath());
    			} else {
    				RequestDispatcher dispatcher = 
    					request.getRequestDispatcher(forward.getPath());
    				dispatcher.forward(request, response);
    			}
    		}
    	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}	

}
