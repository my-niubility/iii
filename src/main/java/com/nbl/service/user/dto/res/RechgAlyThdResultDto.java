package com.nbl.service.user.dto.res;

import java.io.Serializable;
import java.util.Date;

public class RechgAlyThdResultDto implements Serializable {

	private static final long serialVersionUID = 7394721002091197362L;

	/**
	 * 用户编号
	 */
	private String accountId;
	/**
	 * 账户余额
	 */
	private String balance;
	/**
	 * 充值流水号(互金)
	 */
	private String serailNum;
	/**
	 * 交易结果信息
	 */
	private String resultInfo;
	/**
	 * 充值订单号（证联）
	 */
	private String rechargeId;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 备注
	 */
	private String remark;

	public RechgAlyThdResultDto() {
		super();
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getSerailNum() {
		return serailNum;
	}

	public void setSerailNum(String serailNum) {
		this.serailNum = serailNum;
	}

	public String getResultInfo() {
		return resultInfo;
	}

	public void setResultInfo(String resultInfo) {
		this.resultInfo = resultInfo;
	}

	public String getRechargeId() {
		return rechargeId;
	}

	public void setRechargeId(String rechargeId) {
		this.rechargeId = rechargeId;
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

	@Override
	public String toString() {
		return "RechgAlyThdResultDto [accountId=" + accountId + ", balance=" + balance + ", serailNum=" + serailNum
				+ ", resultInfo=" + resultInfo + ", rechargeId=" + rechargeId + ", updateTime=" + updateTime
				+ ", remark=" + remark + "]";
	}
}
