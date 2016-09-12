package com.nbl.service.user.dto.req;

import java.io.Serializable;

public class WthdwAlyInfoDto implements Serializable {

	private static final long serialVersionUID = 4957843139867456792L;

	/**
	 * 预留手机号
	 */
	private String phoneNum;

	private Long amt;

	private String withdrawType;

	private String custId;

	private String custName;

	private String bankType;

	private String bankCardNo;

	private String remark;
	private String channelCode;
	
	public Long getAmt() {
		return amt;
	}

	public void setAmt(Long amt) {
		this.amt = amt;
	}

	public String getWithdrawType() {
		return withdrawType;
	}

	public void setWithdrawType(String withdrawType) {
		this.withdrawType = withdrawType == null ? null : withdrawType.trim();
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId == null ? null : custId.trim();
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName == null ? null : custName.trim();
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType == null ? null : bankType.trim();
	}

	public String getBankCardNo() {
		return bankCardNo;
	}

	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo == null ? null : bankCardNo.trim();
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getChannelCode() {
		return channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	@Override
	public String toString() {
		return "WthdwAlyInfoDto [phoneNum=" + phoneNum + ", amt=" + amt + ", withdrawType=" + withdrawType + ", custId=" + custId + ", custName=" + custName + ", bankType=" + bankType
				+ ", bankCardNo=" + bankCardNo + ", remark=" + remark + ", channelCode=" + channelCode + "]";
	}


}
