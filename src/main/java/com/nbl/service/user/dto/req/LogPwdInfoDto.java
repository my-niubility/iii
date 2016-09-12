package com.nbl.service.user.dto.req;

import java.io.Serializable;

public class LogPwdInfoDto implements Serializable {

	private static final long serialVersionUID = 3122095286580857780L;

	/**
	 * 设置类型：1-修改登录密码、2-设置新登录密码（忘记密码）
	 */
	private String setType;
	/**
	 * 原交易密码
	 */
	private String orgLoginPwd;
	/**
	 * 新交易密码
	 */
	private String newLoginPwd;
	/**
	 * 短信验证码
	 */
	private String msgIdenCode;
	/**
	 * 个人客户编号
	 */
	private String custId;
	/**
	 * 用户登录手机号
	 */
	private String phoneNum;

	public String getSetType() {
		return setType;
	}

	public void setSetType(String setType) {
		this.setType = setType;
	}

	public String getOrgLoginPwd() {
		return orgLoginPwd;
	}

	public void setOrgLoginPwd(String orgLoginPwd) {
		this.orgLoginPwd = orgLoginPwd;
	}

	public String getNewLoginPwd() {
		return newLoginPwd;
	}

	public void setNewLoginPwd(String newLoginPwd) {
		this.newLoginPwd = newLoginPwd;
	}

	public String getMsgIdenCode() {
		return msgIdenCode;
	}

	public void setMsgIdenCode(String msgIdenCode) {
		this.msgIdenCode = msgIdenCode;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return "LogPwdInfoDto [setType=" + setType + ", orgLoginPwd=" + orgLoginPwd + ", newLoginPwd=" + newLoginPwd + ", msgIdenCode=" + msgIdenCode + ", custId=" + custId + ", phoneNum=" + phoneNum
				+ "]";
	}

}
