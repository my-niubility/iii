package com.nbl.service.user.dto.req;

import java.io.Serializable;

public class RechgAlyInfoDto implements Serializable {

	private static final long serialVersionUID = -8882647439056691143L;
	/**
	 * 用户编号
	 */
	private String custId;
	/**
	 * 充值客户名称
	 */
	private String custName;
	/**
	 * 银行类别
	 */
	private String bankType;
	/**
	 * 金额
	 */
	private Long amt;
	/**
	 * 预留手机号
	 */
	private String phoneNum;
	/**
	 * 充值发起方式（01：绑卡充值，02：普通充值）【只针对线下转账】
	 */
	private String bingingCardType;
	/**
	 * 充值银行卡卡号
	 */
	private String bankCardNo;
	/**
	 * 充值方式：00：网银充值、01：快捷充值、02：线下转账、03：其他
	 */
	private String rechargeType;
	/**
	 * 充值码（用于线下转账）
	 */
	private String rechargeCode;
	/**
	 * 充值编号
	 */
	private String channelCode;
	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	public Long getAmt() {
		return amt;
	}

	public void setAmt(Long amt) {
		this.amt = amt;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getBingingCardType() {
		return bingingCardType;
	}

	public void setBingingCardType(String bingingCardType) {
		this.bingingCardType = bingingCardType;
	}

	public String getBankCardNo() {
		return bankCardNo;
	}

	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getRechargeType() {
		return rechargeType;
	}

	public void setRechargeType(String rechargeType) {
		this.rechargeType = rechargeType;
	}

	public String getRechargeCode() {
		return rechargeCode;
	}

	public void setRechargeCode(String rechargeCode) {
		this.rechargeCode = rechargeCode;
	}

	public String getChannelCode() {
		return channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	@Override
	public String toString() {
		return "RechgAlyInfoDto [custId=" + custId + ", custName=" + custName + ", bankType=" + bankType + ", amt=" + amt + ", phoneNum=" + phoneNum + ", bingingCardType=" + bingingCardType
				+ ", bankCardNo=" + bankCardNo + ", rechargeType=" + rechargeType + ", rechargeCode=" + rechargeCode + ", channelCode=" + channelCode + "]";
	}

}
