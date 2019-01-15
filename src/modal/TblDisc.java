package modal;

import java.util.Date;

public class TblDisc {
	
	private String dId;
	private Date createTime;
	private Date updateTime;
	private String createUser;
	private String discNo;
	private String discNoName;
	private String discItem;
	private String discItemName;
	public String getDid() {
		return dId;
	}
	public void setId(String dId) {
		this.dId = dId;
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
	public String getDiscNo() {
		return discNo;
	}
	public void setDiscNo(String discNo) {
		this.discNo = discNo;
	}
	public String getDiscNoName() {
		return discNoName;
	}
	public void setDiscNoName(String discNoName) {
		this.discNoName = discNoName;
	}
	public String getDiscItem() {
		return discItem;
	}
	public void setDiscItem(String discItem) {
		this.discItem = discItem;
	}
	public String getDiscItemName() {
		return discItemName;
	}
	public void setDiscItemName(String discItemName) {
		this.discItemName = discItemName;
	}

}
