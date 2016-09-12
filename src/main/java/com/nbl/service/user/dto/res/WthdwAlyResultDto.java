package com.nbl.service.user.dto.res;

import java.io.Serializable;
import java.util.Date;

public class WthdwAlyResultDto implements Serializable {

	private static final long serialVersionUID = 7886950850361914768L;
	/**
	 * 用户编号
	 */
	private String custId;
	/**
	 * 账户余额
	 */
	private String balance;
	/**
	 * 提现订单号
	 */
	private String id;
	/**
	 * 交易结果信息
	 */
	private String resultInfo;
	/**
	 * 提现订单号（证联）
	 */
	private String withdrawId;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 更新时间
	 */
	private String updateDateTime;

	public WthdwAlyResultDto() {
		super();
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getResultInfo() {
		return resultInfo;
	}

	public void setResultInfo(String resultInfo) {
		this.resultInfo = resultInfo;
	}

	public String getWithdrawId() {
		return withdrawId;
	}

	public void setWithdrawId(String withdrawId) {
		this.withdrawId = withdrawId;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public WthdwAlyResultDto(String custId, String balance, String id) {
		this.custId = custId;
		this.balance = balance;
		this.id = id;
	}

	public String getUpdateDateTime() {
		return updateDateTime;
	}

	public void setUpdateDateTime(String updateDateTime) {
		this.updateDateTime = updateDateTime;
	}

	@Override
	public String toString() {
		return "WthdwAlyResultDto [custId=" + custId + ", balance=" + balance + ", id=" + id + ", resultInfo="
				+ resultInfo + ", withdrawId=" + withdrawId + ", updateTime=" + updateTime + ", remark=" + remark
				+ ", updateDateTime=" + updateDateTime + "]";
	}

}
