package com.nbl.service.user.dto.req;

import java.io.Serializable;

public class ChkCertInfoDto implements Serializable {

	private static final long serialVersionUID = -1540690713274155597L;
	
	/**
	 * 用户编号
	 */
	private String custId;
	/**
	 * 预留手机号
	 */
	private String phoneNum;
	/**
	 * 银行编码
	 */
	private String bankType;
	
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
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	@Override
	public String toString() {
		return "ChkCertInfoDto [custId=" + custId + ", phoneNum=" + phoneNum + ", bankCode=" + bankType + "]";
	}
}
