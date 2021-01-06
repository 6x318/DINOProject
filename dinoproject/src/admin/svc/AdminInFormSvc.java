package admin.svc;

import static db.JdbcUtil.*;
import java.util.*;
import java.sql.*;
import admin.dao.*;
import vo.*;

public class AdminInFormSvc {
	public ArrayList<AdminInfo> getAdminList() {
		// ��з� ����� ArrayList �� �ν��Ͻ��� �����ϴ� �޼ҵ�
			ArrayList<AdminInfo> adminList = null;
			Connection conn = getConnection();
			AdminCtrlDao adminCtrlDao= AdminCtrlDao.getInstance();
			adminCtrlDao.setConnection(conn);
			adminList = adminCtrlDao.getAdminList();
			close(conn);
			return adminList;
		}
}
