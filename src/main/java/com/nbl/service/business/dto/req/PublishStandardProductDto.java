package com.nbl.service.business.dto.req;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Donald
 * @createdate 2016年7月20日
 * @version 1.0 
 * @description :发布标准产品
 */
public class PublishStandardProductDto implements Serializable {
	
	private static final long serialVersionUID = -6767759979866726602L;

	private String productName;
	
	private String startdt;
	
	private String enddt;
	
	private String scale;
	
	private String unitcost;
	
	private String rate;
	
	private String scaleLimitFlag;
	
	private String scaleLimit;
	
	private String rentMode;
	
	private String holdday;
	
	private String blockday;
	
	private String transferFlag;
	
	private String tlockday;
	
	private String rentType;
	
	private String backday;
	
	private String nonbackday;
	
	private String contrday;
	
	private String establish;
	
	private String xxEstabValue;
	
	private String blEstabValue;
	
	private String subsidyFlag;
	
	private String subsidyRate;
	
	private String subsidyDay;
	
	private String financeId;
	
	private String financeName;
	
	private String productType;
	
	private String productTittleType;
	
	private Date startTime;
	
	private Long investMin;
	
	private Long remainTerms;
	
	private Date endTime;
	
	private Long financePortion;//融资总额

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getStartdt() {
		return startdt;
	}

	public void setStartdt(String startdt) {
		this.startdt = startdt;
	}

	public String getEnddt() {
		return enddt;
	}

	public void setEnddt(String enddt) {
		this.enddt = enddt;
	}

	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

	public String getUnitcost() {
		return unitcost;
	}

	public void setUnitcost(String unitcost) {
		this.unitcost = unitcost;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getScaleLimitFlag() {
		return scaleLimitFlag;
	}

	public void setScaleLimitFlag(String scaleLimitFlag) {
		this.scaleLimitFlag = scaleLimitFlag;
	}

	public String getScaleLimit() {
		return scaleLimit;
	}

	public void setScaleLimit(String scaleLimit) {
		this.scaleLimit = scaleLimit;
	}

	public String getRentMode() {
		return rentMode;
	}

	public void setRentMode(String rentMode) {
		this.rentMode = rentMode;
	}

	public String getHoldday() {
		return holdday;
	}

	public void setHoldday(String holdday) {
		this.holdday = holdday;
	}

	public String getBlockday() {
		return blockday;
	}

	public void setBlockday(String blockday) {
		this.blockday = blockday;
	}

	public String getTransferFlag() {
		return transferFlag;
	}

	public void setTransferFlag(String transferFlag) {
		this.transferFlag = transferFlag;
	}

	public String getTlockday() {
		return tlockday;
	}

	public void setTlockday(String tlockday) {
		this.tlockday = tlockday;
	}

	public String getRentType() {
		return rentType;
	}

	public void setRentType(String rentType) {
		this.rentType = rentType;
	}

	public String getBackday() {
		return backday;
	}

	public void setBackday(String backday) {
		this.backday = backday;
	}

	public String getNonbackday() {
		return nonbackday;
	}

	public void setNonbackday(String nonbackday) {
		this.nonbackday = nonbackday;
	}

	public String getContrday() {
		return contrday;
	}

	public void setContrday(String contrday) {
		this.contrday = contrday;
	}

	public String getEstablish() {
		return establish;
	}

	public void setEstablish(String establish) {
		this.establish = establish;
	}

	public String getXxEstabValue() {
		return xxEstabValue;
	}

	public void setXxEstabValue(String xxEstabValue) {
		this.xxEstabValue = xxEstabValue;
	}

	public String getBlEstabValue() {
		return blEstabValue;
	}

	public void setBlEstabValue(String blEstabValue) {
		this.blEstabValue = blEstabValue;
	}

	public String getSubsidyFlag() {
		return subsidyFlag;
	}

	public void setSubsidyFlag(String subsidyFlag) {
		this.subsidyFlag = subsidyFlag;
	}

	public String getSubsidyRate() {
		return subsidyRate;
	}

	public void setSubsidyRate(String subsidyRate) {
		this.subsidyRate = subsidyRate;
	}

	public String getSubsidyDay() {
		return subsidyDay;
	}

	public void setSubsidyDay(String subsidyDay) {
		this.subsidyDay = subsidyDay;
	}

	public String getFinanceId() {
		return financeId;
	}

	public void setFinanceId(String financeId) {
		this.financeId = financeId;
	}

	public String getFinanceName() {
		return financeName;
	}

	public void setFinanceName(String financeName) {
		this.financeName = financeName;
	}

	public String getProductTittleType() {
		return productTittleType;
	}

	public void setProductTittleType(String productTittleType) {
		this.productTittleType = productTittleType;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Long getInvestMin() {
		return investMin;
	}

	public void setInvestMin(Long investMin) {
		this.investMin = investMin;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}
	
	public Long getRemainTerms() {
		return remainTerms;
	}

	public void setRemainTerms(Long remainTerms) {
		this.remainTerms = remainTerms;
	}
	
	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
	public Long getFinancePortion() {
		return financePortion;
	}

	public void setFinancePortion(Long financePortion) {
		this.financePortion = financePortion;
	}

	@Override
	public String toString() {
		return "PublishStandardProductDto [productName=" + productName + ", startdt=" + startdt + ", enddt=" + enddt
				+ ", scale=" + scale + ", unitcost=" + unitcost + ", rate=" + rate + ", scaleLimitFlag="
				+ scaleLimitFlag + ", scaleLimit=" + scaleLimit + ", rentMode=" + rentMode + ", holdday=" + holdday
				+ ", blockday=" + blockday + ", transferFlag=" + transferFlag + ", tlockday=" + tlockday + ", rentType="
				+ rentType + ", backday=" + backday + ", nonbackday=" + nonbackday + ", contrday=" + contrday
				+ ", establish=" + establish + ", xxEstabValue=" + xxEstabValue + ", blEstabValue=" + blEstabValue
				+ ", subsidyFlag=" + subsidyFlag + ", subsidyRate=" + subsidyRate + ", subsidyDay=" + subsidyDay
				+ ", financeId=" + financeId + ", financeName=" + financeName + ", productType=" + productType
				+ ", productTittleType=" + productTittleType + ", startTime=" + startTime + ", investMin=" + investMin
				+ ", remainTerms=" + remainTerms + ", endTime=" + endTime + ", financePortion=" + financePortion + "]";
	}

}
