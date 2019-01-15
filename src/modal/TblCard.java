package modal;

import java.util.Date;

public class TblCard {
	
	private String cId;
	private Date createTime;
	private Date updateTime;
	private String createUser;
	private String cardNo;
	private String cardPassword;
	private String cardState;
	private String cardType;//卡的状态
	private float currentBalance;
	private String bak;
	private String aId;
	private Date cardReportLossTime;//挂失时间
	private Date cardJieguaTime;//解挂时间
	private String card_report_loss_type;//挂失状态
	private String auditOpinoin;//审核意见
	private String auditPerson;//审核人
	private Date auditTime;//审核时间
	
	
	
	public String getaId() {
		return aId;
	}
	public void setaId(String aId) {
		this.aId = aId;
	}
	public Date getCardReportLossTime() {
		return cardReportLossTime;
	}
	public void setCardReportLossTime(Date cardReportLossTime) {
		this.cardReportLossTime = cardReportLossTime;
	}
	public Date getCardJieguaTime() {
		return cardJieguaTime;
	}
	public void setCardJieguaTime(Date cardJieguaTime) {
		this.cardJieguaTime = cardJieguaTime;
	}
	public String getCard_report_loss_type() {
		return card_report_loss_type;
	}
	public void setCard_report_loss_type(String card_report_loss_type) {
		this.card_report_loss_type = card_report_loss_type;
	}
	public String getAuditOpinoin() {
		return auditOpinoin;
	}
	public void setAuditOpinoin(String auditOpinoin) {
		this.auditOpinoin = auditOpinoin;
	}
	public String getAuditPerson() {
		return auditPerson;
	}
	public void setAuditPerson(String auditPerson) {
		this.auditPerson = auditPerson;
	}
	public Date getAuditTime() {
		return auditTime;
	}
	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}
	public String getcId() {
		return cId;
	}
	public void setcId(String cId) {
		this.cId = cId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardPassword() {
		return cardPassword;
	}
	public void setCardPassword(String cardPassword) {
		this.cardPassword = cardPassword;
	}
	public String getCardState() {
		return cardState;
	}
	public void setCardState(String cardState) {
		this.cardState = cardState;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public float getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(float currentBalance) {
		this.currentBalance = currentBalance;
	}
	public String getBak() {
		return bak;
	}
	public void setBak(String bak) {
		this.bak = bak;
	}

}
