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
    	// 사용자의 요청이 get이든 post이든 모두 처리하는 메소드
    		request.setCharacterEncoding("utf-8");
    		String requestUri = request.getRequestURI();
    		String contextPath = request.getContextPath();
    		String command = requestUri.substring(contextPath.length());

    		ActionForward forward = null;
    		action.Action action = null;

    		// 사용자의 요청 종류에 따라 각각 다른 action을 취함
    		switch (command) {
    			case "/admin_in_form.ctrl" :		// admin popup등록 폼
    				action = new AdminInFormAction();		break;
    			case "/admin_in_proc.ctrl" :		// admin popup등록 처리
    				action = new AdminInProcAction();		break;
    			case "/admin_list.ctrl" :			// /admin/ctrl.jsp 화면
    				action = new AdminListAction();		break;
    			case "/admin_view.ctrl" :			// admin popup보기 화면
    				action = new AdminViewAction();		break;
    			case "/admin_up_form.ctrl" :		// admin popup수정 폼
    				action = new AdminUpFormAction();		break;
    			case "/admin_up_proc.ctrl" :		// admin 수정 처리
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
