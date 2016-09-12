package com.nbl.service.user.dto.res;

import java.io.Serializable;

/**
 * @author maxinwei
 * @createdate 2016年4月11日
 * @version 1.0
 * @description :用户注册返回结果
 */
public class LoginResJsonDto implements Serializable {

	private static final long serialVersionUID = -6158359802434345834L;

	private String periodStart;
	private String periodEnd;
	private String custId;
	private String lastLoginTime;

	public LoginResJsonDto() {
		super();
	}

	public String getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(String lastLoginTime) {
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

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	@Override
	public String toString() {
		return "LoginResJsonDto [periodStart=" + periodStart + ", periodEnd=" + periodEnd + ", custId=" + custId + ", lastLoginTime=" + lastLoginTime + "]";
	}

}
