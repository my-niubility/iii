package com.nbl.service.business.dto.res;

import java.io.Serializable;

/**
 * @author maxinwei
 * @createdate 2016年4月11日
 * @version 1.0
 * @description :交易订单产品索引查询结果
 */
public class HisPrdTrdResItemDto implements Serializable {

	private static final long serialVersionUID = -3450071671678173157L;

	/**
	 * 产品类型
	 */
	private String productType;
	/**
	 * 产品编号
	 */
	private String productId;
	/**
	 * 据当前时n天前
	 */
	private String distanceTime;
	/**
	 * 产品单价
	 */
	private String unitCost;

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getDistanceTime() {
		return distanceTime;
	}

	public void setDistanceTime(String distanceTime) {
		this.distanceTime = distanceTime;
	}

	public String getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(String unitCost) {
		this.unitCost = unitCost;
	}

	@Override
	public String toString() {
		return "HisPrdTrdResItemDto [productType=" + productType + ", productId=" + productId + ", distanceTime="
				+ distanceTime + ", unitCost=" + unitCost + "]";
	}

}
