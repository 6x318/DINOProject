package admin.svc;

import static db.JdbcUtil.*;
import java.util.*;
import java.sql.*;
import admin.dao.*;
import vo.*;

public class AdminInFormSvc {
	public ArrayList<AdminInfo> getAdminList() {
		// 대분류 목록을 ArrayList 형 인스턴스로 리턴하는 메소드
			ArrayList<AdminInfo> adminList = null;
			Connection conn = getConnection();
			AdminCtrlDao adminCtrlDao= AdminCtrlDao.getInstance();
			adminCtrlDao.setConnection(conn);
			adminList = adminCtrlDao.getAdminList();
			close(conn);
			return adminList;
		}
}
