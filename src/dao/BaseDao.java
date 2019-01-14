package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BaseDao {
	
	public Statement _stmt;
	
//	获取数据库执行对象
	public void _getSTMT4extend() throws Exception {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://39.98.183.155:3306/atm", "root", "root");
			if(!con.isClosed()) {
				System.out.println("db con ok");
			}
			
		    this._stmt = con.createStatement();

		}catch(Exception ex) {
			throw new Exception(ex.getMessage());
		}
	}
	
//	获取数据库执行对象
	public Statement getSTMT() throws Exception {
		
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://39.98.183.155:3306/atm", "root", "root");
			if(!con.isClosed()) {
				System.out.println("db con ok");
			}
			
		    stmt = con.createStatement();

		}catch(Exception ex) {
			throw new Exception(ex.getMessage());
		}
		
		return stmt;

	}	
}
