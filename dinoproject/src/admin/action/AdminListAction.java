package admin.action;

import javax.servlet.http.*;
import java.util.*;
import admin.svc.*;
import vo.*;

public class AdminListAction implements action.Action {
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ArrayList<AdminInfo> adminList = new ArrayList<AdminInfo>();
		// 상품 목록을 저장할 ArrayList객체로 PdtInfo형 인스턴스만 저장함

		ActionForward forward = new ActionForward();
		forward.setPath("/admin/ctrl.jsp");
		return forward;
	}
}
