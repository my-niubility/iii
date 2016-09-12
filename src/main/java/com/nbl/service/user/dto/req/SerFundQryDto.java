package com.nbl.service.user.dto.req;

import java.io.Serializable;
import java.util.Date;

public class SerFundQryDto implements Serializable {

	private static final long serialVersionUID = 1813171548359187090L;
	/**
	 * 类型（01-充值 02-购买 03-提现 04-收益 05-赎回）
	 */
	private String type;
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
	 * 第一条记录下标（从0开始）
	 */
	private int startIndex;
	/**
	 * 记录条数
	 */
	private int recordNum;
	/**
	 * 支付方式（00：账户支付 01：网关支付  02：快捷支付  03：银行账户转账 04：银行收账）
	 */
	private String paymentType;
	

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "SerFundQryDto [type=" + type + ", userId=" + userId + ", custId=" + custId + ", beginDate=" + beginDate
				+ ", endDate=" + endDate + ", startIndex=" + startIndex + ", recordNum=" + recordNum + ", paymentType="
				+ paymentType + "]";
	}



}
