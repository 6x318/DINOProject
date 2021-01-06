package admin.action;

import javax.servlet.*;
import javax.servlet.http.*;	// �޾� �� request�� response�� ���� import
import java.io.PrintWriter;
import java.util.*;
import admin.svc.*;
import vo.*;

public class AdminInFormAction implements action.Action {
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		AdminInFormSvc adminInFormSvc = new AdminInFormSvc();
		ArrayList<AdminInfo> adminList= adminInFormSvc.getAdminList();			//Admin ���
	
		if (adminList != null ) {
			request.setAttribute("adminList", adminList);
		} else {
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('�߸��� ��η� �����̽��ϴ�.');");
			out.println("history.back();");
			out.println("</script>");
			out.close();
		}
	
		forward.setPath("/admin/admin_in_form.jsp");	// �̵��� URL ����
		return forward;
	}
}
