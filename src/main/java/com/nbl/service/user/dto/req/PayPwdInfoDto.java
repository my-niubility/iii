package com.nbl.service.user.dto.req;

import java.io.Serializable;

public class PayPwdInfoDto implements Serializable {

	private static final long serialVersionUID = 3122095286580857780L;

	/**
	 * 设置类型：1-设置交易密码、2-修改交易密码、3-设置新交易密码（忘记密码）
	 */
	private String setType;
	/**
	 * 原交易密码
	 */
	private String orgPayPwd;
	/**
	 * 新交易密码
	 */
	private String newPayPwd;
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

	public String getOrgPayPwd() {
		return orgPayPwd;
	}

	public void setOrgPayPwd(String orgPayPwd) {
		this.orgPayPwd = orgPayPwd;
	}

	public String getNewPayPwd() {
		return newPayPwd;
	}

	public void setNewPayPwd(String newPayPwd) {
		this.newPayPwd = newPayPwd;
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
		return "PayPwdInfoDto [setType=" + setType + ", orgPayPwd=" + orgPayPwd + ", newPayPwd=" + newPayPwd
				+ ", msgIdenCode=" + msgIdenCode + ", custId=" + custId + ", phoneNum=" + phoneNum + "]";
	}

}
