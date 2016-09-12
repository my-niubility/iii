package com.nbl.service.manager.dto;

import java.io.Serializable;

public class LoginAccountReqDto implements Serializable{

	private static final long serialVersionUID = 4509666778730274455L;

	private String accountId;
	
	private String accountName;
	
	private String partyId;
	
	private String roleId;
	
	private String mobile;
	
	private String lockStatus;
	
	private String enableStatus;
	
	private String realName;

	private String password;
	
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getPartyId() {
		return partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}


	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getLockStatus() {
		return lockStatus;
	}

	public void setLockStatus(String lockStatus) {
		this.lockStatus = lockStatus;
	}

	public String getEnableStatus() {
		return enableStatus;
	}

	public void setEnableStatus(String enableStatus) {
		this.enableStatus = enableStatus;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginAccountReqDto [accountId=" + accountId + ", accountName=" + accountName + ", partyId=" + partyId
				+ ", roleId=" + roleId + ", mobile=" + mobile + ", lockStatus=" + lockStatus + ", enableStatus="
				+ enableStatus + ", realName=" + realName + ", password=" + password + "]";
	}

	
}
