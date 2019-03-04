package view;

import java.io.Console;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;

import controller.TblUserController;
import modal.TblUser;

public class AppView {
	
	private String userIdCurr;   //存储当前登录的用户ID
	
//	绘制主界面，通过不同的功能选择，进行分发到不同的*View类里面
	public void mainProcess() throws Exception{
//	    System.out.println(">>>>>application start");	
	    
		System.out.println("**********欢迎使用XXX银行ATM系统**************");
	    Scanner sc = new Scanner(System.in);

	    do {
            
	    	System.out.println("请输入您的银行卡号");
	    	String loginName = sc.nextLine();
	    	sc.reset();
	    	System.out.println("请输入您的登录密码：");
	    	String passWord = sc.nextLine();
	    	sc.reset();
//	    	System.out.println("loginName:passWord>>>>"+loginName+":"+passWord);

		    TblUserController uc = new TblUserController();
		    try {
		        TblUser tUser = uc.login(loginName, passWord);
		        if(tUser.getuId() != null && tUser.getuId() != "") {
		        	this.mainView();
		        	break;
		        }else {
		        	System.out.println("账号或密码错误，登录失败，请重新登录!");
		        	Thread.sleep(2000);
//		        	System.out.println("\n\n\n\n\n\n");
		        }
		    }catch(Exception ex) {
		    	throw ex;
		    }
	    }while(true);
	}
	
	public void mainView() throws Exception {
		do {
			
			
		}while(true);
	}

}
