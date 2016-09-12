package com.nbl.service.user.dto.res;

import java.io.Serializable;

/**
 * @author maxinwei
 * @createdate 2016年4月11日
 * @version 1.0
 * @description :充值订单查询结果
 */
public class RchgQryRltItemDto implements Serializable {

	private static final long serialVersionUID = 3523571806287892289L;

	private String id;

	private String amt;

	private String status;

	private String resultInfo;

	private String custId;

	private String custName;

	private String createTime;

	private String rechargeId;

	private String settleString;

	private String bingingCardType;

	private String bankType;

	private String bankCardNo;

	private String rechargeType;

	private String rechargeCode;

	private String recBankType;

	private String remark;

	private String upStringTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAmt() {
		return amt;
	}

	public void setAmt(String amt) {
		this.amt = amt;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getResultInfo() {
		return resultInfo;
	}

	public void setResultInfo(String resultInfo) {
		this.resultInfo = resultInfo;
	}

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

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getRechargeId() {
		return rechargeId;
	}

	public void setRechargeId(String rechargeId) {
		this.rechargeId = rechargeId;
	}

	public String getSettleString() {
		return settleString;
	}

	public void setSettleString(String settleString) {
		this.settleString = settleString;
	}

	public String getBingingCardType() {
		return bingingCardType;
	}

	public void setBingingCardType(String bingingCardType) {
		this.bingingCardType = bingingCardType;
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

	public String getRecBankType() {
		return recBankType;
	}

	public void setRecBankType(String recBankType) {
		this.recBankType = recBankType;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getUpStringTime() {
		return upStringTime;
	}

	public void setUpStringTime(String upStringTime) {
		this.upStringTime = upStringTime;
	}

	@Override
	public String toString() {
		return "RchgQryResultDto [id=" + id + ", amt=" + amt + ", status=" + status + ", resultInfo=" + resultInfo + ", custId=" + custId + ", custName=" + custName + ", createTime=" + createTime
				+ ", rechargeId=" + rechargeId + ", settleString=" + settleString + ", bingingCardType=" + bingingCardType + ", bankType=" + bankType + ", bankCardNo=" + bankCardNo + ", rechargeType="
				+ rechargeType + ", rechargeCode=" + rechargeCode + ", recBankType=" + recBankType + ", remark=" + remark + ", upStringTime=" + upStringTime + "]";
	}

}
