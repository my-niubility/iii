package com.nbl.service.user.dto.res;

import java.io.Serializable;

/**
 * @author maxinwei
 * @createdate 2016年4月11日
 * @version 1.0
 * @description :资金流水查询结果
 */
public class SerFundQryRsltItemDto implements Serializable {

	private static final long serialVersionUID = -3450071671678173157L;

	/**
	 * 交易时间
	 */
	private String tradeTime;

	/**
	 * 说明
	 */
	private String remark;

	/**
	 * 订单号
	 */
	private String orderId;

	/**
	 * 收入
	 */
	private String benefit;

	/**
	 * 支出
	 */
	private String expend;

	/**
	 * 状态
	 */
	private String status;

	public String getTradeTime() {
		return tradeTime;
	}

	public void setTradeTime(String tradeTime) {
		this.tradeTime = tradeTime;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getBenefit() {
		return benefit;
	}

	public void setBenefit(String benefit) {
		this.benefit = benefit;
	}

	public String getExpend() {
		return expend;
	}

	public void setExpend(String expend) {
		this.expend = expend;
	}

	@Override
	public String toString() {
		return "SerFundQryRsltItemDto [tradeTime=" + tradeTime + ", remark=" + remark
				+ ", orderId=" + orderId + ", benefit=" + benefit + ", expend=" + expend + ", status=" + status + "]";
	}

}
