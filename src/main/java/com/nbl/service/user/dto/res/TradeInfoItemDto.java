package com.nbl.service.user.dto.res;

import java.io.Serializable;

/**
 * @author maxinwei
 * @createdate 2016年4月11日
 * @version 1.0
 * @description :交易记录查询结果
 */
public class TradeInfoItemDto implements Serializable {
	private static final long serialVersionUID = 4504094593965904052L;
	private String id;
	private String productId;
	private String productNane;
	private String tradeTalAmt;
	private String purchasePortion;
	private String orderStatus;
	private String createTime;
	private String expectEarnRate;
	private String unitCost;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getPurchasePortion() {
		return purchasePortion;
	}

	public void setPurchasePortion(String purchasePortion) {
		this.purchasePortion = purchasePortion;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getExpectEarnRate() {
		return expectEarnRate;
	}

	public void setExpectEarnRate(String expectEarnRate) {
		this.expectEarnRate = expectEarnRate;
	}

	public String getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(String unitCost) {
		this.unitCost = unitCost;
	}

	public String getTradeTalAmt() {
		return tradeTalAmt;
	}

	public void setTradeTalAmt(String tradeTalAmt) {
		this.tradeTalAmt = tradeTalAmt;
	}

	@Override
	public String toString() {
		return "TradeInfoItemDto [id=" + id + ", productId=" + productId + ", productNane=" + productNane + ", tradeTalAmt=" + tradeTalAmt + ", purchasePortion=" + purchasePortion + ", orderStatus="
				+ orderStatus + ", createTime=" + createTime + ", expectEarnRate=" + expectEarnRate + ", unitCost=" + unitCost + "]";
	}

}
