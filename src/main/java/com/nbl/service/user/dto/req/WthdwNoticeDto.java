package com.nbl.service.user.dto.req;

import java.io.Serializable;
import java.util.Date;

public class WthdwNoticeDto implements Serializable {

	private static final long serialVersionUID = -272093018156244995L;

	/**
	 * 用户编号
	 */
	private String custId;
	/**
	 * 返回类型成功、失败、未知
	 */
	private String returnType;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getReturnType() {
		return returnType;
	}

	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}

	@Override
	public String toString() {
		return "WthdwNoticeDto [custId=" + custId + ", returnType=" + returnType + ", balance=" + balance + ", id=" + id
				+ ", resultInfo=" + resultInfo + ", withdrawId=" + withdrawId + ", updateTime=" + updateTime
				+ ", remark=" + remark + "]";
	}

}
