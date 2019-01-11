package cardSYS;

import view.AppView;

public class Application {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		try {
			AppView av = new AppView();
			av.mainProcess();
		}catch(Exception ex) {
			throw ex;
		}
	}

}
