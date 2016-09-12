package com.nbl.service.user.dto.req;

import java.io.Serializable;

public class ChkWtDwInfoDto implements Serializable {

	private static final long serialVersionUID = 6168158050292733314L;
	
	/**
	 * 支付密码
	 */
	private String payPassword;
	/**
	 * 预留手机号
	 */
	private String phoneNum;
	private String bankType;

	private String bankCardNo;
	private String custName;
	
	private String custId;

	public String getPayPassword() {
		return payPassword;
	}

	public void setPayPassword(String payPassword) {
		this.payPassword = payPassword;
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

	public String getBankCardNo() {
		return bankCardNo;
	}

	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	@Override
	public String toString() {
		return "ChkWtDwInfoDto [payPassword=" + payPassword + ", phoneNum=" + phoneNum + ", bankType=" + bankType
				+ ", bankCardNo=" + bankCardNo + ", custName=" + custName + ", custId=" + custId + "]";
	}
	
}
