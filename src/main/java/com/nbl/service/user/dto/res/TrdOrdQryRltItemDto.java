package com.nbl.service.user.dto.res;

import java.io.Serializable;

/**
 * @author maxinwei
 * @createdate 2016年4月11日
 * @version 1.0
 * @description :交易订单查询结果
 */
public class TrdOrdQryRltItemDto implements Serializable {

	private static final long serialVersionUID = 2827075825761521205L;

	private String id;

	private String contractId;

	private String productId;

	private String productNane;

	private String assetCustId;

	private String assetCustName;

	private String purchaseCustId;

	private String purchaseCustName;

	private String transferCustId;

	private String transferCustName;

	private String invenstType;

	private String amt;

	private String tradeTalAmt;

	private String redEnvAmt;

	private String interest;

	private String principal;

	private String purchasePortion;

	private String repayTerm;

	private String payOrderNo;

	private String tradeDate;

	private String orderStatus;

	private String transferId;

	private String remark;

	private String createTime;

	private String updateTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
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

	public String getPurchaseCustId() {
		return purchaseCustId;
	}

	public void setPurchaseCustId(String purchaseCustId) {
		this.purchaseCustId = purchaseCustId;
	}

	public String getPurchaseCustName() {
		return purchaseCustName;
	}

	public void setPurchaseCustName(String purchaseCustName) {
		this.purchaseCustName = purchaseCustName;
	}

	public String getTransferCustId() {
		return transferCustId;
	}

	public void setTransferCustId(String transferCustId) {
		this.transferCustId = transferCustId;
	}

	public String getTransferCustName() {
		return transferCustName;
	}

	public void setTransferCustName(String transferCustName) {
		this.transferCustName = transferCustName;
	}

	public String getInvenstType() {
		return invenstType;
	}

	public void setInvenstType(String invenstType) {
		this.invenstType = invenstType;
	}

	public String getAmt() {
		return amt;
	}

	public void setAmt(String amt) {
		this.amt = amt;
	}

	public String getTradeTalAmt() {
		return tradeTalAmt;
	}

	public void setTradeTalAmt(String tradeTalAmt) {
		this.tradeTalAmt = tradeTalAmt;
	}

	public String getRedEnvAmt() {
		return redEnvAmt;
	}

	public void setRedEnvAmt(String redEnvAmt) {
		this.redEnvAmt = redEnvAmt;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public String getPrincipal() {
		return principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public String getPurchasePortion() {
		return purchasePortion;
	}

	public void setPurchasePortion(String purchasePortion) {
		this.purchasePortion = purchasePortion;
	}

	public String getRepayTerm() {
		return repayTerm;
	}

	public void setRepayTerm(String repayTerm) {
		this.repayTerm = repayTerm;
	}

	public String getPayOrderNo() {
		return payOrderNo;
	}

	public void setPayOrderNo(String payOrderNo) {
		this.payOrderNo = payOrderNo;
	}

	public String getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getTransferId() {
		return transferId;
	}

	public void setTransferId(String transferId) {
		this.transferId = transferId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "TrdOrdQryRltItemDto [id=" + id + ", contractId=" + contractId + ", productId=" + productId
				+ ", productNane=" + productNane + ", assetCustId=" + assetCustId + ", assetCustName=" + assetCustName
				+ ", purchaseCustId=" + purchaseCustId + ", purchaseCustName=" + purchaseCustName + ", transferCustId="
				+ transferCustId + ", transferCustName=" + transferCustName + ", invenstType=" + invenstType + ", amt="
				+ amt + ", tradeTalAmt=" + tradeTalAmt + ", redEnvAmt=" + redEnvAmt + ", interest=" + interest
				+ ", principal=" + principal + ", purchasePortion=" + purchasePortion + ", repayTerm=" + repayTerm
				+ ", payOrderNo=" + payOrderNo + ", tradeDate=" + tradeDate + ", orderStatus=" + orderStatus
				+ ", transferId=" + transferId + ", remark=" + remark + ", createTime=" + createTime + ", updateTime="
				+ updateTime + "]";
	}

}
