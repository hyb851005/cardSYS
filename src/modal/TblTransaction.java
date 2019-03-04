package modal;

import java.util.Date;

public class TblTransaction {
	
	private String id;
	private Date createTime;
	private Date updateTime;
	private String createUser;
	private String typee;             //交易类型，10-存款，20-取款，30-转账
	private double moneyTran;         //交易金额
	private double moneySxf;          //交易手续费金额
	private String accOutId;          //转出账户ID
	private String accInId;           //存入账户ID
	private String statuss;           //交易状态，10-成功，20-失败
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getTypee() {
		return typee;
	}
	public void setTypee(String typee) {
		this.typee = typee;
	}
	public double getMoneyTran() {
		return moneyTran;
	}
	public void setMoneyTran(double moneyTran) {
		this.moneyTran = moneyTran;
	}
	public double getMoneySxf() {
		return moneySxf;
	}
	public void setMoneySxf(double moneySxf) {
		this.moneySxf = moneySxf;
	}
	public String getAccOutId() {
		return accOutId;
	}
	public void setAccOutId(String accOutId) {
		this.accOutId = accOutId;
	}
	public String getAccInId() {
		return accInId;
	}
	public void setAccInId(String accInId) {
		this.accInId = accInId;
	}
	public String getStatuss() {
		return statuss;
	}
	public void setStatuss(String statuss) {
		this.statuss = statuss;
	}
}
