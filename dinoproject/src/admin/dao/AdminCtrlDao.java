package admin.dao;

import static db.JdbcUtil.*;
import javax.servlet.http.*;
import java.sql.*;
import javax.sql.*;
import java.util.*;
import vo.*;

public class AdminCtrlDao {
	private static AdminCtrlDao adminCtrlDao;
	private Connection conn;

	private AdminCtrlDao() {}
	
	public static AdminCtrlDao getInstance() {
		if (adminCtrlDao == null) {
			adminCtrlDao = new AdminCtrlDao();
		}
		return adminCtrlDao;
	}
	
	public void setConnection(Connection conn) {
		this.conn = conn;
	}
	
	public ArrayList<AdminInfo> getAdminList() {
		System.out.println("getAdminList");
		ArrayList<AdminInfo> AdminList = new ArrayList<AdminInfo>();
		AdminInfo adminInfo = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			sql = "select * from t_admin_list";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				adminInfo = new AdminInfo();
			
				adminInfo.setAl_idx(rs.getInt("cb_idx"));
				adminInfo.setAl_id(rs.getString("al_id"));
				adminInfo.setAl_pwd(rs.getString("al_pwd"));
				adminInfo.setAl_grade(rs.getString("al_grade"));
				adminInfo.setAl_name(rs.getString("al_name"));
				adminInfo.setAl_addr1(rs.getString("al_addr1"));
				adminInfo.setAl_addr2(rs.getString("al_addr2"));
				adminInfo.setAl_phone(rs.getString("al_phone"));
				adminInfo.setAl_email(rs.getString("al_email"));
		
				AdminList.add(adminInfo);
				
			}
		} catch(Exception e) {
			System.out.println("getAdminList() ¿À·ù");
			e.printStackTrace();
		} finally {
			close(rs);	close(stmt);
		}

		return AdminList;
	}
}
