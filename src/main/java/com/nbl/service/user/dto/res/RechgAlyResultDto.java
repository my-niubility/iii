package com.nbl.service.user.dto.res;

import java.io.Serializable;

public class RechgAlyResultDto implements Serializable {

	private static final long serialVersionUID = 7394721002091197362L;

	/**
	 * 用户编号
	 */
	private String custId;
	/**
	 * 账户余额
	 */
	private String balance;
	/**
	 * 充值订单号(互金)
	 */
	private String id;
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
	private String updateDateTime;
	/**
	 * 备注
	 */
	private String remark;

	public RechgAlyResultDto() {
		super();
	}

	public RechgAlyResultDto(String custId, String balance, String id) {
		this.custId = custId;
		this.balance = balance;
		this.id = id;
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

	public String getRechargeId() {
		return rechargeId;
	}

	public void setRechargeId(String rechargeId) {
		this.rechargeId = rechargeId;
	}

	public String getUpdateDateTime() {
		return updateDateTime;
	}

	public void setUpdateDateTime(String updateDateTime) {
		this.updateDateTime = updateDateTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "RechgAlyResultDto [custId=" + custId + ", balance=" + balance + ", id=" + id + ", resultInfo="
				+ resultInfo + ", rechargeId=" + rechargeId + ", updateDateTime=" + updateDateTime + ", remark="
				+ remark + "]";
	}

}
