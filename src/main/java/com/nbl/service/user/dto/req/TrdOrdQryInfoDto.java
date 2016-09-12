package com.nbl.service.user.dto.req;

import java.io.Serializable;
import java.util.Date;

public class TrdOrdQryInfoDto implements Serializable {

	private static final long serialVersionUID = 1813171548359187090L;

	/**
	 * 用户编号（电话）
	 */
	private String userId;
	/**
	 * 客户编号
	 */
	private String custId;
	/**
	 * 起始日期
	 */
	private Date beginDate;
	/**
	 * 终止日期
	 */
	private Date endDate;
	/**
	 * 状态：00:等待付款、01:支付成功、02:支付失败、03:订单取消
	 */
	private String status;
	/**
	 * 第一条记录下标（从0开始）
	 */
	private int startIndex;
	/**
	 * 记录条数
	 */
	private int recordNum;
	/**
	 * 排序标识1-升序，0-降序
	 */
	private String orderFlag;
	/**
	 * 排序内容：1-订单号，2-购买时间，3-购买金额（如不传则默认按订单号倒序排列）
	 */
	private String orderColumn;
	/**
	 * 交易订单号（此值不为空时，优先做为查询条件，查询结果为1条记录）
	 */
	private String tradeOrderId;
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public int getRecordNum() {
		return recordNum;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public String getOrderFlag() {
		return orderFlag;
	}

	public void setOrderFlag(String orderFlag) {
		this.orderFlag = orderFlag;
	}

	public String getOrderColumn() {
		return orderColumn;
	}

	public void setOrderColumn(String orderColumn) {
		this.orderColumn = orderColumn;
	}

	public String getTradeOrderId() {
		return tradeOrderId;
	}

	public void setTradeOrderId(String tradeOrderId) {
		this.tradeOrderId = tradeOrderId;
	}

	@Override
	public String toString() {
		return "TrdOrdQryInfoDto [userId=" + userId + ", custId=" + custId + ", beginDate=" + beginDate + ", endDate="
				+ endDate + ", status=" + status + ", startIndex=" + startIndex + ", recordNum=" + recordNum
				+ ", orderFlag=" + orderFlag + ", orderColumn=" + orderColumn + ", tradeOrderId=" + tradeOrderId + "]";
	}

}
