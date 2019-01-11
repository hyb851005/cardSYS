package view;

import java.util.Scanner;

import controller.TblUserController;
import modal.TblUser;

public class AppView {
//	绘制主界面
//	通过不同的功能选择，进行分发到不同的*View类里面
	
	public void mainView() throws Exception{
	    System.out.println(">>>>>application start");	
	    
	    Scanner sc = new Scanner(System.in);
	    
//	    do {
	    	System.out.println("**********欢迎使用XXX银行ATM系统**************");
	    	System.out.println("请输入您的登录账号：例如用户名/银行卡号/银行账号/身份证号");
	    	String loginName = sc.nextLine();
	    	sc.reset();
	    	System.out.println("请输入您的登录密码：");
	    	String passWord = sc.nextLine();
	    	sc.reset();
	    	
	    	System.out.println("loginName:passWord>>>>"+loginName+":"+passWord);
	    	
		    TblUserController uc = new TblUserController();
		    try {
		        TblUser tUser = uc.login(loginName, passWord);
		        if(tUser.getuId() != null && tUser.getuId() != "") {
		        	System.out.println("logined succeeded!");
		        }
		    }catch(Exception ex) {
		    	throw ex;
		    }
//	    	
//	    	System.out.println();
//	    	
//	    	int flag = sc.nextInt();
//	    	switch(flag) {
//	    		case 1:
//	    			adminView();
//	    		    break;
//	    		case 2:
//	    		    break;
//	    		case 3:
//	    		    break;
//	    		case 9:
//	    			break;
//	    		default:
//	    			;
//	    	}
//	    	
//	    }while(true);
	}
	
	public void adminView() {
		System.out.println("请输入");
	}

}
