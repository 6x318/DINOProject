package action;

import javax.servlet.http.*;
import java.util.*;
import svc.*;
import vo.*;

public class PickUpViewAction implements Action {
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		
		ActionForward forward = new ActionForward();
		forward.setPath("/pickUp_view.jsp");
		return forward;
	}	
}
