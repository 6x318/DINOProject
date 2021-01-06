package admin.action;

import javax.servlet.http.*;
import java.io.PrintWriter;
import java.util.*;
import svc.*;
import vo.*;

public class AdminViewAction implements action.Action {
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		AdminViewSvc adminViewSvc = new AdminViewSvc();
		String id = request.getParameter("id");
		PdtInfo pdtInfo = pdtViewSvc.getPdtInfo(id);
		// 지정한 아이디에 해당하는 상품의 정보들을 PdtInfo형 인스턴스로 받아 옴
		request.setAttribute("pdtInfo", pdtInfo);

		ActionForward forward = new ActionForward();
		forward.setPath("/admin/ctrl.jsp");

		return forward;
	}
}
