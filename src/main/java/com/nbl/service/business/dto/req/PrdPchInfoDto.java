package com.nbl.service.business.dto.req;

import java.io.Serializable;

public class PrdPchInfoDto implements Serializable {

	private static final long serialVersionUID = -3248366059564238154L;

	/**
	 * 合同号
	 */
	private String contractId;
	/**
	 * 产品编号
	 */
	private String productId;
	/**
	 * 产品名称
	 */
	private String productName;
	/**
	 * 资产管理人客户号
	 */
	private String assetCustId;
	/**
	 * 资产管理人名称
	 */
	private String assetCustName;

	/**
	 * 投资方客户号
	 */
	private String purchaseCustId;

	/**
	 * 投资方客户名称
	 */
	private String purchaseCustName;

	/**
	 * 转让方客户号
	 */
	private String transferCustId;

	/**
	 * 转让方客户名称
	 */
	private String transferCustName;

	/**
	 * 订单类别:0:投资 ,1:协议转让 ,2:划款 ,3:融资人还款 ,4:资管人还款 ,5:资管人退款 ,6:补贴发放
	 */
	private String invenstType;

	/**
	 * 交易金额（分）
	 */
	private Long amt;

	/**
	 * 利息（用于还款）
	 */
	private Long interest;

	/**
	 * 本金
	 */
	private Long principal;

	/**
	 * 购买单位数
	 */
	private Long purchasePortion;

	/**
	 * 期次（用于还款付息）
	 */
	private Long repayTerm;

	/**
	 * 支付交易流水号【关联支付订单表】
	 */
	private String payOrderNo;

	/**
	 * 转让ID（关联转让表）
	 */
	private String transferId;

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
	 * 业务编码
	 */
	private String optCode;
	/**
	 * 步骤key
	 */
	private String stepKey;
	/**
	 * 购买渠道编码
	 */
	private String channelCode;

	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId == null ? null : contractId.trim();
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId == null ? null : productId.trim();
	}

	public String getProductNane() {
		return productName;
	}

	public void setProductNane(String productNane) {
		this.productName = productNane == null ? null : productNane.trim();
	}

	public String getPurchaseCustId() {
		return purchaseCustId;
	}

	public void setPurchaseCustId(String purchaseCustId) {
		this.purchaseCustId = purchaseCustId == null ? null : purchaseCustId.trim();
	}

	public String getPurchaseCustName() {
		return purchaseCustName;
	}

	public void setPurchaseCustName(String purchaseCustName) {
		this.purchaseCustName = purchaseCustName == null ? null : purchaseCustName.trim();
	}

	public String getTransferCustId() {
		return transferCustId;
	}

	public void setTransferCustId(String transferCustId) {
		this.transferCustId = transferCustId == null ? null : transferCustId.trim();
	}

	public String getTransferCustName() {
		return transferCustName;
	}

	public void setTransferCustName(String transferCustName) {
		this.transferCustName = transferCustName == null ? null : transferCustName.trim();
	}

	public String getInvenstType() {
		return invenstType;
	}

	public void setInvenstType(String invenstType) {
		this.invenstType = invenstType;
	}

	public Long getAmt() {
		return amt;
	}

	public void setAmt(Long amt) {
		this.amt = amt;
	}

	public Long getInterest() {
		return interest;
	}

	public void setInterest(Long interest) {
		this.interest = interest;
	}

	public Long getPrincipal() {
		return principal;
	}

	public void setPrincipal(Long principal) {
		this.principal = principal;
	}

	public Long getPurchasePortion() {
		return purchasePortion;
	}

	public void setPurchasePortion(Long purchasePortion) {
		this.purchasePortion = purchasePortion;
	}

	public Long getRepayTerm() {
		return repayTerm;
	}

	public void setRepayTerm(Long repayTerm) {
		this.repayTerm = repayTerm;
	}

	public String getPayOrderNo() {
		return payOrderNo;
	}

	public void setPayOrderNo(String payOrderNo) {
		this.payOrderNo = payOrderNo == null ? null : payOrderNo.trim();
	}

	public String getTransferId() {
		return transferId;
	}

	public void setTransferId(String transferId) {
		this.transferId = transferId == null ? null : transferId.trim();
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

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getAssetCustId() {
		return assetCustId;
	}

	public void setAssetCustId(String assetCustId) {
		this.assetCustId = assetCustId;
	}

	public String getAssetCustName() {
		return assetCustName;
	}

	public void setAssetCustName(String assetCustName) {
		this.assetCustName = assetCustName;
	}

	public String getOptCode() {
		return optCode;
	}

	public void setOptCode(String optCode) {
		this.optCode = optCode;
	}

	public String getStepKey() {
		return stepKey;
	}

	public void setStepKey(String stepKey) {
		this.stepKey = stepKey;
	}

	public String getChannelCode() {
		return channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	@Override
	public String toString() {
		return "PrdPchInfoDto [contractId=" + contractId + ", productId=" + productId + ", productName=" + productName + ", assetCustId=" + assetCustId + ", assetCustName=" + assetCustName
				+ ", purchaseCustId=" + purchaseCustId + ", purchaseCustName=" + purchaseCustName + ", transferCustId=" + transferCustId + ", transferCustName=" + transferCustName + ", invenstType="
				+ invenstType + ", amt=" + amt + ", interest=" + interest + ", principal=" + principal + ", purchasePortion=" + purchasePortion + ", repayTerm=" + repayTerm + ", payOrderNo="
				+ payOrderNo + ", transferId=" + transferId + ", remark=" + remark + ", tradeTalAmt=" + tradeTalAmt + ", redEnvAmt=" + redEnvAmt + ", optCode=" + optCode + ", stepKey=" + stepKey
				+ ", channelCode=" + channelCode + "]";
	}

}
