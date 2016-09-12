package com.nbl.service.user.dto.res;

import java.io.Serializable;

/**
 * @author maxinwei
 * @createString 2016年4月11日
 * @version 1.0
 * @description :提现订单查询结果
 */
public class WthdrQryRltItemDto implements Serializable {

	private static final long serialVersionUID = 7664567027800972220L;

	private String id;

	private String amt;

	private String status;

	private String withdrawType;

	private String resultInfo;

	private String custId;

	private String custName;

	private String withdrawId;

	private String settleDate;

	private String bankType;

	private String bankCardNo;

	private String remark;

	private String createTime;

	private String updateTime;

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

	public String getWithdrawType() {
		return withdrawType;
	}

	public void setWithdrawType(String withdrawType) {
		this.withdrawType = withdrawType;
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

	public String getWithdrawId() {
		return withdrawId;
	}

	public void setWithdrawId(String withdrawId) {
		this.withdrawId = withdrawId;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getSettleDate() {
		return settleDate;
	}

	public void setSettleDate(String settleDate) {
		this.settleDate = settleDate;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "WthdrQryRltItemDto [id=" + id + ", amt=" + amt + ", status=" + status + ", withdrawType=" + withdrawType
				+ ", resultInfo=" + resultInfo + ", custId=" + custId + ", custName=" + custName + ", withdrawId="
				+ withdrawId + ", settleDate=" + settleDate + ", bankType=" + bankType + ", bankCardNo=" + bankCardNo
				+ ", remark=" + remark + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}

	

}
