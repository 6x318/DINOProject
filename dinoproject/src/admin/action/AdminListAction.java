package admin.action;

import javax.servlet.http.*;
import java.util.*;
import admin.svc.*;
import vo.*;

public class AdminListAction implements action.Action {
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ArrayList<AdminInfo> adminList = new ArrayList<AdminInfo>();
		// ��ǰ ����� ������ ArrayList��ü�� PdtInfo�� �ν��Ͻ��� ������

		ActionForward forward = new ActionForward();
		forward.setPath("/admin/ctrl.jsp");
		return forward;
	}
}
