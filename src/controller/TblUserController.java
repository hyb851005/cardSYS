package controller;

import dao.TblUserDao;

public class TblUserController {
//	专门做用户管理的业务逻辑处理
	
	public void deleteUser() {
		
//		查询数据库，获取待删除的用户记录(调用dao层中的查询用户记录的方法)
		
//		更新tbl_account表中的对应的账户记录（user_flag 设置为 N）（调用DAO中更新账户记录的方法）
		
//		删除本条用户记录（）
		TblUserDao userDao = new TblUserDao();
		userDao.delete();
	}

}
