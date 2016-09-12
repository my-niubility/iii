package com.nbl.service.user.dto.res;

import java.io.Serializable;

/**
 * @author maxinwei
 * @createdate 2016年4月11日
 * @version 1.0
 * @description :用户注册返回结果
 */
public class RegisteResultDto implements Serializable {

	private static final long serialVersionUID = -6158359802434345834L;

	private String custId;
	
	private UserInfo userInfo;

	public RegisteResultDto() {
		super();
	}

	public RegisteResultDto(String custId) {
		this.custId = custId;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	@Override
	public String toString() {
		return "RegisteResultDto [custId=" + custId + ", userInfo=" + userInfo + "]";
	}
	
}
