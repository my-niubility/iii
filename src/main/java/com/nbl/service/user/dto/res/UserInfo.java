package com.nbl.service.user.dto.res;

import java.io.Serializable;
import java.util.Date;

public class UserInfo implements Serializable {

	private static final long serialVersionUID = 5323312997152857162L;

	private String id;

	private String loginName;

	private String password;

	private String mobile;

	private String email;

	private String emailActivateCode;

	private Short enabled;

	private Date periodStart;

	private Date periodEnd;

	private Date createDate;

	private String custId;

	private String custType;

	private Date lastUpdatePasswordTime;

	private Date lastLoginLockTime;

	private String description;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName == null ? null : loginName.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile == null ? null : mobile.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public String getEmailActivateCode() {
		return emailActivateCode;
	}

	public void setEmailActivateCode(String emailActivateCode) {
		this.emailActivateCode = emailActivateCode == null ? null : emailActivateCode.trim();
	}

	public Short getEnabled() {
		return enabled;
	}

	public void setEnabled(Short enabled) {
		this.enabled = enabled;
	}

	public Date getPeriodStart() {
		return periodStart;
	}

	public void setPeriodStart(Date periodStart) {
		this.periodStart = periodStart;
	}

	public Date getPeriodEnd() {
		return periodEnd;
	}

	public void setPeriodEnd(Date periodEnd) {
		this.periodEnd = periodEnd;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId == null ? null : custId.trim();
	}

	public String getCustType() {
		return custType;
	}

	public void setCustType(String custType) {
		this.custType = custType == null ? null : custType.trim();
	}

	public Date getLastUpdatePasswordTime() {
		return lastUpdatePasswordTime;
	}

	public void setLastUpdatePasswordTime(Date lastUpdatePasswordTime) {
		this.lastUpdatePasswordTime = lastUpdatePasswordTime;
	}

	public Date getLastLoginLockTime() {
		return lastLoginLockTime;
	}

	public void setLastLoginLockTime(Date lastLoginLockTime) {
		this.lastLoginLockTime = lastLoginLockTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", loginName=" + loginName + ", password=" + password + ", mobile=" + mobile
				+ ", email=" + email + ", emailActivateCode=" + emailActivateCode + ", enabled=" + enabled
				+ ", periodStart=" + periodStart + ", periodEnd=" + periodEnd + ", createDate=" + createDate
				+ ", custId=" + custId + ", custType=" + custType + ", lastUpdatePasswordTime=" + lastUpdatePasswordTime
				+ ", lastLoginLockTime=" + lastLoginLockTime + ", description=" + description + "]";
	}

}
