package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modal.TblUser;

public class TblUserDao {
	
//	create by huyibo 20190101
	public List<TblUser> getList4Login(String loginName, String passWord) throws Exception{
		List<TblUser> userList = new ArrayList<TblUser>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://39.98.183.155:3306/atm", "root", "root");
			if(!con.isClosed()) {
				System.out.println("db con ok");
			}
			Statement stmt = con.createStatement();
			
			String sqlStr = "select *from tbl_user where user_name='"+loginName+"' and user_password = '"+passWord+"';";
			System.out.println(sqlStr);
			ResultSet rs = stmt.executeQuery(sqlStr);
			
			while(rs.next()) {
				TblUser tUser = new TblUser();
				tUser.setuId(rs.getString("u_id"));
				tUser.setCreateTime(rs.getDate("create_time"));
				tUser.setUpdateTime(rs.getDate("update_time"));
				tUser.setCreateUser(rs.getString("create_user"));
				tUser.setUserName(rs.getString("user_name"));
				tUser.setUserPassword(rs.getString("user_password"));
				tUser.setaId(rs.getString("a_id"));
				tUser.setUserType(rs.getString("user_type"));
				userList.add(tUser);
			}
			
			System.out.println("db con ok>>>>");
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		
		return userList;
	}
	
//	写具体的SQL语句
	public void delete() {
//		写删除用户记录的SQL语句
	}

}
