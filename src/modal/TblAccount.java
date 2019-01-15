package modal;

import java.util.Date;

import javax.xml.crypto.Data;

public class TblAccount {

	    private String aId;
		private Date createTime;
	    private Date updateTime;
	    private String createUser;
	    private String accountNo;
	    private String accountName;
	    private String accountPassword;
	    private String cId;//卡户ID
		private String userFlag;
	    private String accountType;
	    private String accountFerozenChoose;//账户是否冻结
	    private String cancelType;//销户状态
	    private String cancelAccountAuditOpinion;//销户审核意见
	    private String cancelAccountAuditPerson;//销户审核人
	    private Date cancelAccountAuditTime;
	    private String openAccountType;//开户状态
	    private String openAccountAuditOpinoin;//开户审核意见
	    private String openAccountAuditPerson;
	    private Date openAccountAuditTime;
	    
	    
	   
	    public Date getCancelAccountAuditTime() {
			return cancelAccountAuditTime;
		}
		public void setCancelAccountAuditTime(Date cancelAccountAuditTime) {
			this.cancelAccountAuditTime = cancelAccountAuditTime;
		}
		public Date getOpenAccountAuditTime() {
			return openAccountAuditTime;
		}
		public void setOpenAccountAuditTime(Date openAccountAuditTime) {
			this.openAccountAuditTime = openAccountAuditTime;
		}
		public String getcId() {
			return cId;
		}
		public void setcId(String cId) {
			this.cId = cId;
		}
		public String getUserFlag() {
			return userFlag;
		}
		public void setUserFlag(String userFlag) {
			this.userFlag = userFlag;
		}
		public String getAccountType() {
			return accountType;
		}
		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}
		public String getAccountFerozenChoose() {
			return accountFerozenChoose;
		}
		public void setAccountFerozenChoose(String accountFerozenChoose) {
			this.accountFerozenChoose = accountFerozenChoose;
		}
		public String getCancelType() {
			return cancelType;
		}
		public void setCancelType(String cancelType) {
			this.cancelType = cancelType;
		}
		public String getCancelAccountAuditOpinion() {
			return cancelAccountAuditOpinion;
		}
		public void setCancelAccountAuditOpinion(String cancelAccountAuditOpinion) {
			this.cancelAccountAuditOpinion = cancelAccountAuditOpinion;
		}
		public String getCancelAccountAuditPerson() {
			return cancelAccountAuditPerson;
		}
		public void setCancelAccountAuditPerson(String cancelAccountAuditPerson) {
			this.cancelAccountAuditPerson = cancelAccountAuditPerson;
		}
		public String getOpenAccountType() {
			return openAccountType;
		}
		public void setOpenAccountType(String openAccountType) {
			this.openAccountType = openAccountType;
		}
		public String getOpenAccountAuditOpinoin() {
			return openAccountAuditOpinoin;
		}
		public void setOpenAccountAuditOpinoin(String openAccountAuditOpinoin) {
			this.openAccountAuditOpinoin = openAccountAuditOpinoin;
		}
		public String getOpenAccountAuditPerson() {
			return openAccountAuditPerson;
		}
		public void setOpenAccountAuditPerson(String openAccountAuditPerson) {
			this.openAccountAuditPerson = openAccountAuditPerson;
		}
		
	    public String getaId() {
			return aId;
		}
		public void setaId(String aId) {
			this.aId = aId;
		}
	    public void setCreateTime(Date createTime) {
	    	
	    	this.createTime=createTime;
	    }
	    public Date getCreateTime() {
	    	
	    	return this.createTime;
	    }
        public void setUpdateTime(Date updateTime) {
        	
	    	this.updateTime=updateTime;
	    	
	    }
        public Date getUpdateTime() {
	    	
	    	return this.updateTime;
	    }
        public void setCreateUser(String createUser) {
 	
        	this.createUser=createUser;
 }
        public String getCreateUser() {
        	
        	return this.createUser;
        }
         public void setAccountNo(String accountNo) {
        	 
        	 this.accountNo=accountNo;
 	
 }
         public String getAccountNo() {
        	 
        	 
			return this.accountName;
        	 
        	 
         }
         public void setAccountName(String accountName) {
 	
        	 this.accountName=accountName;
 }
          public String getAccountName() {
			return accountName;
		}
         public void setAccountPassword(String accountPassword) {
 	
        	 this.accountPassword=accountPassword;
 }
         public String getAccountPassword() {
			return this.accountPassword;
        	 
         }
	    
}
