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
		// ������ ���̵� �ش��ϴ� ��ǰ�� �������� PdtInfo�� �ν��Ͻ��� �޾� ��
		request.setAttribute("pdtInfo", pdtInfo);

		ActionForward forward = new ActionForward();
		forward.setPath("/admin/ctrl.jsp");

		return forward;
	}
}
