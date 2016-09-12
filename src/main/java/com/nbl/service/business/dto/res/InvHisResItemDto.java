package com.nbl.service.business.dto.res;

import java.io.Serializable;

/**
 * @author maxinwei
 * @createdate 2016年4月11日
 * @version 1.0
 * @description :客户最近投资记录
 */
public class InvHisResItemDto implements Serializable {

	private static final long serialVersionUID = 1807516276130018700L;

	/**
	 * 产品编号
	 */
	private String productId;
	/**
	 * 购买数量
	 */
	private String purchasePortion;
	/**
	 * 购买金额
	 */
	private String tradeTalAmt;
	/**
	 * 购买时间
	 */
	private String updateTime;
	/**
	 * 返租方式
	 */
	private String repayMode;

	public InvHisResItemDto() {
		super();
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getPurchasePortion() {
		return purchasePortion;
	}

	public void setPurchasePortion(String purchasePortion) {
		this.purchasePortion = purchasePortion;
	}

	public String getTradeTalAmt() {
		return tradeTalAmt;
	}

	public void setTradeTalAmt(String tradeTalAmt) {
		this.tradeTalAmt = tradeTalAmt;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getRepayMode() {
		return repayMode;
	}

	public void setRepayMode(String repayMode) {
		this.repayMode = repayMode;
	}

	@Override
	public String toString() {
		return "InvHisResItemDto [productId=" + productId + ", purchasePortion=" + purchasePortion + ", tradeTalAmt=" + tradeTalAmt + ", updateTime=" + updateTime + ", repayMode=" + repayMode + "]";
	}

}
