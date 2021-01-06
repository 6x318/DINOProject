package admin.action;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import admin.svc.*;
import vo.*;

public class AdminInProcAction implements action.Action {
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		AdminInProcSvc adminInProcSvc = new AdminInProcSvc();
		request.setCharacterEncoding("utf-8");

		AdminInfo adminInfo = new AdminInfo();
		adminInfo.setAl_id(request.getAttribute("al_id"));		
		adminInfo.setAl_pwd(request.getAttribute("al_pwd"));	
		adminInfo.setAl_grade(request.getAttribute("al_id"));	
		adminInfo.setAl_name(request.getAttribute("al_id"));	
		adminInfo.setAl_addr1(request.getAttribute("al_id"));	
		adminInfo.setAl_addr2(request.getAttribute("al_id"));	
		adminInfo.setAl_phone(request.getAttribute("al_id"));	
		adminInfo.setAl_email(request.getAttribute("al_id"));	
		adminInfo.setAl_status(request.getAttribute("al_id"));	
		adminInfo.setAl_idx(Integer.parseInt("al_idx"));	
		
		boolean isSuccess = adminInProcSvc.pdtInsert(adminInfo);
		if (!isSuccess) {	// 상품등록에 실패했으면
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('상품 등록이 실패했습니다.');");
			out.println("history.back();");
			out.println("</script>");
			out.close();
		}

		forward.setPath("admin_list.ctrl");
		forward.setRedirect(true);
		return forward;
	}
}
