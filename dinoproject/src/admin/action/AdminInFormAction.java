package admin.action;

import javax.servlet.*;
import javax.servlet.http.*;	// 받아 온 request와 response를 위해 import
import java.io.PrintWriter;
import java.util.*;
import admin.svc.*;
import vo.*;

public class AdminInFormAction implements action.Action {
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		AdminInFormSvc adminInFormSvc = new AdminInFormSvc();
		ArrayList<AdminInfo> adminList= adminInFormSvc.getAdminList();			//Admin 목록
	
		if (adminList != null ) {
			request.setAttribute("adminList", adminList);
		} else {
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('잘못된 경로로 들어오셨습니다.');");
			out.println("history.back();");
			out.println("</script>");
			out.close();
		}
	
		forward.setPath("/admin/admin_in_form.jsp");	// 이동할 URL 지정
		return forward;
	}
}
