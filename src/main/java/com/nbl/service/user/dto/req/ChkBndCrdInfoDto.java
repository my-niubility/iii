package com.nbl.service.user.dto.req;

import java.io.Serializable;

public class ChkBndCrdInfoDto implements Serializable{

	private static final long serialVersionUID = 4237332847394324137L;
	
	/**
	 * 用户编号
	 */
	private String custId;
	/**
	 * 账户类型(01：客户 02：商户)
	 */
	private String custType;
	/**
	 * 姓名
	 */
	private String cardName;
	/**
	 * 证件类型
	 */
	private String credentialsType;
	/**
	 * 证件编号
	 */
	private String id;
	/**
	 * 银行编码
	 */
	private String bankType;
	/**
	 * 卡号
	 */
	private String cardNum;
	/**
	 * 预留手机号
	 */
	private String phoneNum;
	/**
	 * 短信验证码
	 */
	private String msgIdenCode;
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getCustType() {
		return custType;
	}
	public void setCustType(String custType) {
		this.custType = custType;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCredentialsType() {
		return credentialsType;
	}
	public void setCredentialsType(String credentialsType) {
		this.credentialsType = credentialsType;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getMsgIdenCode() {
		return msgIdenCode;
	}
	public void setMsgIdenCode(String msgIdenCode) {
		this.msgIdenCode = msgIdenCode;
	}
	@Override
	public String toString() {
		return "BndBnkCrdInfo [custId=" + custId + ", custType=" + custType + ", cardName=" + cardName
				+ ", credentialsType=" + credentialsType + ", id=" + id + ", bankType=" + bankType + ", cardNum="
				+ cardNum + ", phoneNum=" + phoneNum + ", msgIdenCode=" + msgIdenCode + "]";
	}

}
