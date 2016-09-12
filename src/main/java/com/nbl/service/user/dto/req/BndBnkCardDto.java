package com.nbl.service.user.dto.req;

import java.io.Serializable;

/**
 * @author maxinwei
 * @createdate 2016年4月11日
 * @version 1.0
 * @description :绑卡申请信息
 */
public class BndBnkCardDto implements Serializable {
	private static final long serialVersionUID = -2334554999836346627L;
	/**
	 * 用户编号
	 */
	private String custId;
	/**
	 * 账户编号
	 */
	private String accountId;
	/**
	 * 账户类型(01：客户 02：商户)
	 */
	private String custAccType;
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
	private String cardNo;
	/**
	 * 预留手机号
	 */
	private String phoneNum;
	/**
	 * 短信验证码
	 */
	private String msgIdenCode;
	/**
	 * 绑卡流水号
	 */
	private String bindSerialNum;

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getCustAccType() {
		return custAccType;
	}

	public void setCustAccType(String custAccType) {
		this.custAccType = custAccType;
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

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
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

	public String getBindSerialNum() {
		return bindSerialNum;
	}

	public void setBindSerialNum(String bindSerialNum) {
		this.bindSerialNum = bindSerialNum;
	}

	@Override
	public String toString() {
		return "BndBnkCardDto [custId=" + custId + ", accountId=" + accountId + ", custAccType=" + custAccType
				+ ", cardName=" + cardName + ", credentialsType=" + credentialsType + ", id=" + id + ", bankType="
				+ bankType + ", cardNo=" + cardNo + ", phoneNum=" + phoneNum + ", msgIdenCode=" + msgIdenCode
				+ ", bindSerialNum=" + bindSerialNum + "]";
	}

}
