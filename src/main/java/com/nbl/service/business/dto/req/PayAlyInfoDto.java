package com.nbl.service.business.dto.req;

import java.io.Serializable;

public class PayAlyInfoDto implements Serializable {

	private static final long serialVersionUID = 3838751691828855646L;
	/**
	 * 支付流水号（第三方）
	 */
	private String paymentSerialNum;
	/**
	 * 支付订单号（互金）
	 */
	private String paymentId;
	/**
	 * 付款人账号（证联支付账号）
	 */
	private String payAccount;
	/**
	 * 交易订单号
	 */
	private String tradeOrderId;
	/**
	 * 批量交易流水号
	 */
	private String batchId;
	/**
	 * 支付类型（01：划款、02：资产管理人还款 03：资产管理人退款 04：融资人还款 05：担保人还款06：投资购买 07：转让购买
	 * 08：补贴发放）
	 */
	private String fundsType;
	/**
	 * 实际金额
	 */
	private Long tradeAmt;

	/**
	 * 付款人客户编号
	 */
	private String payCustId;

	/**
	 * 付款人客户名称
	 */
	private String payCustName;

	/**
	 * 付款银行行别（用于快捷、网关支付）
	 */
	private String payBankType;

	/**
	 * 付款银行卡卡号（用于快捷支付）
	 */
	private String payBankCardNo;
	/**
	 * 支付方式（001：余额支付 002：网银支付 003：快捷支付 004：组合支付）
	 */
	private String paymentType;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 交易总额
	 */
	private Long tradeTalAmt;
	/**
	 * 红包抵扣金额
	 */
	private Long redEnvAmt;
	/**
	 * 产品编号
	 */
	private String productId;
	
	
	/**
	 * 产品名称
	 */
	private String productNane;
	
	/**
	 * 购买份额数
	 */
	private Long purchasePortion;
	
	/**
	 * 支付渠道编码
	 */
	private String channelCode;
	
	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId == null ? null : batchId.trim();
	}

	public String getFundsType() {
		return fundsType;
	}

	public void setFundsType(String fundsType) {
		this.fundsType = fundsType == null ? null : fundsType.trim();
	}

	public Long getTradeAmt() {
		return tradeAmt;
	}

	public void setTradeAmt(Long tradeAmt) {
		this.tradeAmt = tradeAmt;
	}

	public String getPayCustId() {
		return payCustId;
	}

	public void setPayCustId(String payCustId) {
		this.payCustId = payCustId == null ? null : payCustId.trim();
	}

	public String getPayCustName() {
		return payCustName;
	}

	public void setPayCustName(String payCustName) {
		this.payCustName = payCustName == null ? null : payCustName.trim();
	}

	public String getPayBankType() {
		return payBankType;
	}

	public void setPayBankType(String payBankType) {
		this.payBankType = payBankType == null ? null : payBankType.trim();
	}

	public String getPayBankCardNo() {
		return payBankCardNo;
	}

	public void setPayBankCardNo(String payBankCardNo) {
		this.payBankCardNo = payBankCardNo == null ? null : payBankCardNo.trim();
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType == null ? null : paymentType.trim();
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}

	public Long getTradeTalAmt() {
		return tradeTalAmt;
	}

	public void setTradeTalAmt(Long tradeTalAmt) {
		this.tradeTalAmt = tradeTalAmt;
	}

	public Long getRedEnvAmt() {
		return redEnvAmt;
	}

	public void setRedEnvAmt(Long redEnvAmt) {
		this.redEnvAmt = redEnvAmt;
	}

	public String getTradeOrderId() {
		return tradeOrderId;
	}

	public void setTradeOrderId(String tradeOrderId) {
		this.tradeOrderId = tradeOrderId;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getPayAccount() {
		return payAccount;
	}

	public void setPayAccount(String payAccount) {
		this.payAccount = payAccount;
	}

	public String getPaymentSerialNum() {
		return paymentSerialNum;
	}

	public void setPaymentSerialNum(String paymentSerialNum) {
		this.paymentSerialNum = paymentSerialNum;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductNane() {
		return productNane;
	}

	public void setProductNane(String productNane) {
		this.productNane = productNane;
	}

	public Long getPurchasePortion() {
		return purchasePortion;
	}

	public void setPurchasePortion(Long purchasePortion) {
		this.purchasePortion = purchasePortion;
	}

	public String getChannelCode() {
		return channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	@Override
	public String toString() {
		return "PayAlyInfoDto [paymentSerialNum=" + paymentSerialNum + ", paymentId=" + paymentId + ", payAccount=" + payAccount + ", tradeOrderId=" + tradeOrderId + ", batchId=" + batchId
				+ ", fundsType=" + fundsType + ", tradeAmt=" + tradeAmt + ", payCustId=" + payCustId + ", payCustName=" + payCustName + ", payBankType=" + payBankType + ", payBankCardNo="
				+ payBankCardNo + ", paymentType=" + paymentType + ", remark=" + remark + ", tradeTalAmt=" + tradeTalAmt + ", redEnvAmt=" + redEnvAmt + ", productId=" + productId + ", productNane="
				+ productNane + ", purchasePortion=" + purchasePortion + ", channelCode=" + channelCode + "]";
	}

}
