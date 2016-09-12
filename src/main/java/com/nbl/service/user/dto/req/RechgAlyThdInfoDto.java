package com.nbl.service.user.dto.req;

import java.io.Serializable;

public class RechgAlyThdInfoDto implements Serializable {

	private static final long serialVersionUID = -4203285133013492816L;
	/**
	 * 用户编号
	 */
	private String custId;
	/**
	 * 充值流水号
	 */
	private String serialNum;
	/**
	 * 用户账号
	 */
	private String accId;
	/**
	 * 充值流水号
	 */
	private String rechargeOrderId;
	/**
	 * 用户姓名
	 */
	private String custName;
	/**
	 * 银行类别
	 */
	private String bankType;
	/**
	 * 充值银行卡卡号
	 */
	private String bankCardNo;
	/**
	 * 金额
	 */
	private Long amt;
	/**
	 * 预留手机号
	 */
	private String phoneNum;

	public String getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}

	public String getAccId() {
		return accId;
	}

	public void setAccId(String accId) {
		this.accId = accId;
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

	public String getBankCardNo() {
		return bankCardNo;
	}

	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
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

	public String getRechargeOrderId() {
		return rechargeOrderId;
	}

	public void setRechargeOrderId(String rechargeOrderId) {
		this.rechargeOrderId = rechargeOrderId;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	@Override
	public String toString() {
		return "RechgAlyThdInfoDto [custId=" + custId + ", serialNum=" + serialNum + ", accId=" + accId
				+ ", rechargeOrderId=" + rechargeOrderId + ", custName=" + custName + ", bankType=" + bankType
				+ ", bankCardNo=" + bankCardNo + ", amt=" + amt + ", phoneNum=" + phoneNum + "]";
	}

}
