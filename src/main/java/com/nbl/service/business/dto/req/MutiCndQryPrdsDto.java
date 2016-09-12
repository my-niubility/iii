package com.nbl.service.business.dto.req;

import java.io.Serializable;

public class MutiCndQryPrdsDto implements Serializable {

	private static final long serialVersionUID = -7006339549810208493L;

	/**
	 * 产品类型：000-光伏、001-电能、002-基金、003-信托、004-众筹
	 */
	private String productType;
	/**
	 * 产品类型子类:201：货币型基金 202：债券型基 203：股票型基金 204：理财型基金
	 */
	private String productLittleType;
	/**
	 * 最小产品单价
	 */
	private Long unitCostMin;
	/**
	 * 最大产品单价
	 */
	private Long unitCostMax;
	/**
	 * 最小年化收益
	 */
	private String expectEarnRateMin;
	/**
	 * 最大年化收益
	 */
	private String expectEarnRateMax;
	/**
	 * 最小锁定期限
	 */
	private Long lockPeriodMin;
	/**
	 * 最大锁定期限
	 */
	private Long lockPeriodMax;
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
	 * 排序内容：1-创建时间，2-年化收益率，3-产品单价，4-锁定期（如不传则默认按订产品编号倒序排列）
	 */
	private String orderColumn;
	/**
	 * 产品状态01：待审核 02：募集中 03：募集结束04：待还款 05：待退款 06：发布撤销 07：审核失败08：已结束
	 */
	private String productStatus;

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public Long getUnitCostMin() {
		return unitCostMin;
	}

	public void setUnitCostMin(Long unitCostMin) {
		this.unitCostMin = unitCostMin;
	}

	public Long getUnitCostMax() {
		return unitCostMax;
	}

	public void setUnitCostMax(Long unitCostMax) {
		this.unitCostMax = unitCostMax;
	}

	public String getExpectEarnRateMin() {
		return expectEarnRateMin;
	}

	public void setExpectEarnRateMin(String expectEarnRateMin) {
		this.expectEarnRateMin = expectEarnRateMin;
	}

	public String getExpectEarnRateMax() {
		return expectEarnRateMax;
	}

	public void setExpectEarnRateMax(String expectEarnRateMax) {
		this.expectEarnRateMax = expectEarnRateMax;
	}

	public Long getLockPeriodMin() {
		return lockPeriodMin;
	}

	public void setLockPeriodMin(Long lockPeriodMin) {
		this.lockPeriodMin = lockPeriodMin;
	}

	public Long getLockPeriodMax() {
		return lockPeriodMax;
	}

	public void setLockPeriodMax(Long lockPeriodMax) {
		this.lockPeriodMax = lockPeriodMax;
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

	public String getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}
	
	public String getProductLittleType() {
		return productLittleType;
	}

	public void setProductLittleType(String productLittleType) {
		this.productLittleType = productLittleType;
	}

	@Override
	public String toString() {
		return "MutiCndQryPrdsDto [productType=" + productType +",productLittleType=" + productLittleType + ", unitCostMin=" + unitCostMin + ", unitCostMax="
				+ unitCostMax + ", expectEarnRateMin=" + expectEarnRateMin + ", expectEarnRateMax=" + expectEarnRateMax
				+ ", lockPeriodMin=" + lockPeriodMin + ", lockPeriodMax=" + lockPeriodMax + ", startIndex=" + startIndex
				+ ", recordNum=" + recordNum + ", orderFlag=" + orderFlag + ", orderColumn=" + orderColumn
				+ ", productStatus=" + productStatus + "]";
	}

}
