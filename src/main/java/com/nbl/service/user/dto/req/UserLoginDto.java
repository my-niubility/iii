package com.nbl.service.user.dto.req;

import java.io.Serializable;

/**
 * @author maxinwei
 * @createdate 2016年4月11日
 * @version 1.0
 * @description :用户登录信息
 */
public class UserLoginDto implements Serializable {

	private static final long serialVersionUID = 9082413651316250594L;

	/**
	 * 登录密码
	 */
	private String password;
	/**
	 * 手机号码
	 */
	private String mobile;
	/**
	 * IP地址
	 */
	private String ip;
	/**
	 * 回话ID
	 */
	private String sessionId;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	@Override
	public String toString() {
		return "UserLoginDto [password=" + password + ", mobile=" + mobile + ", ip=" + ip + ", sessionId=" + sessionId
				+ "]";
	}

}
