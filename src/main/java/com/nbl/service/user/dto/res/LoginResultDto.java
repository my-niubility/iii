package com.nbl.service.user.dto.res;

import java.io.Serializable;

/**
 * @author maxinwei
 * @createdate 2016年4月11日
 * @version 1.0
 * @description :用户注册返回结果
 */
public class LoginResultDto implements Serializable {

	private static final long serialVersionUID = -6158359802434345834L;

	private String periodStart;
	private String periodEnd;
	private UserInfo userInfo;
	private String lastLoginTime;

	public LoginResultDto() {
		super();
	}

	public LoginResultDto(String periodStart, String periodEnd, String lastLoginTime) {
		super();
		this.periodStart = periodStart;
		this.periodEnd = periodEnd;
		this.lastLoginTime = lastLoginTime;
	}

	public String getPeriodStart() {
		return periodStart;
	}

	public void setPeriodStart(String periodStart) {
		this.periodStart = periodStart;
	}

	public String getPeriodEnd() {
		return periodEnd;
	}

	public void setPeriodEnd(String periodEnd) {
		this.periodEnd = periodEnd;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public String getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	@Override
	public String toString() {
		return "LoginResultDto [periodStart=" + periodStart + ", periodEnd=" + periodEnd + ", userInfo=" + userInfo + ", lastLoginTime=" + lastLoginTime + "]";
	}

}
