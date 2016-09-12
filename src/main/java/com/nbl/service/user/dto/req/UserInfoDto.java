package com.nbl.service.user.dto.req;

import java.io.Serializable;

/**
 * @author maxinwei
 * @createdate 2016年4月11日
 * @version 1.0
 * @description :用户注册信息
 */
public class UserInfoDto implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * 登录名称
	 */
	private String loginName;
	/**
	 * 登录密码
	 */
	private String password;
	/**
	 * 手机号码
	 */
	private String mobile;
	/**
	 * 用户类型 CP：个人 CB：企业
	 */
	private String custType;
	/**
	 * 注册渠道编码
	 */
	private String regChanCode;
	/**
	 *IP
	 */
	private String ip;

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

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

	public String getCustType() {
		return custType;
	}

	public void setCustType(String custType) {
		this.custType = custType;
	}

	public String getRegChanCode() {
		return regChanCode;
	}

	public void setRegChanCode(String regChanCode) {
		this.regChanCode = regChanCode;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Override
	public String toString() {
		return "UserInfoDto [loginName=" + loginName + ", password=" + password + ", mobile=" + mobile + ", custType=" + custType + ", regChanCode=" + regChanCode + ", ip=" + ip + "]";
	}

}
