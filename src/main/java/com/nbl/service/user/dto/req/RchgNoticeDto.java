package com.nbl.service.user.dto.req;

import java.io.Serializable;
import java.util.Date;

public class RchgNoticeDto implements Serializable {

	private static final long serialVersionUID = -5512234949178211910L;

	/**
	 * 返回类型成功、失败、未知
	 */
	private String returnType;
	/**
	 * 账户余额
	 */
	private String balance;
	/**
	 * 交易结果信息
	 */
	private String resultInfo;
	/**
	 * 充值订单号（证联）
	 */
	private String rechargeId;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 账户编号
	 */
	private String accountId;

	/**
	 * 充值流水号(互金)
	 */
	private String serailNum;

	/**
	 * 更新时间
	 */
	private Date updateTime;

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getSerailNum() {
		return serailNum;
	}

	public void setSerailNum(String serailNum) {
		this.serailNum = serailNum;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getReturnType() {
		return returnType;
	}

	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}

	@Override
	public String toString() {
		return "RchgNoticeDto [returnType=" + returnType + ", balance=" + balance + ", resultInfo=" + resultInfo
				+ ", rechargeId=" + rechargeId + ", remark=" + remark + ", accountId=" + accountId + ", serailNum="
				+ serailNum + ", updateTime=" + updateTime + "]";
	}

}
