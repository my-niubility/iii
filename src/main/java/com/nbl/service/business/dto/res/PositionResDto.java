package com.nbl.service.business.dto.res;

import java.io.Serializable;
import java.math.BigDecimal;

public class PositionResDto implements Serializable {

	private static final long serialVersionUID = 7263354385684277030L;

	private String productId;

	private String productName;

	private String projectId;

	private String assetId;

	private String assetName;

	private String productType;

	private String collectStartDt;

	private String collectEndDt;

	private String projectStep;

	private String projectScale;

	private String projectAddr;

	private String projectCarbon;

	private String holdPeriod;

	private String rentType;

	private String repayRentType;

	private String repayRentDt;

	private String lockPeriod;

	private String nonmBackDt;

	private String contractDt;

	private String breBackCheck;

	private String breBackDt;

	private String transfers;

	private Long financePortion;

	private Long financeScale;

	private Long unitCost;

	private Long lockScale;

	private Long dayFinanceAmt;

	private Long confFinanceAmt;

	private Long realFinanceAmt;

	private String establishCondition;

	private Long establishRatio;

	private Long establishMinimum;

	private String establishDate;

	private BigDecimal expectEarnRate;

	public PositionResDto() {
		super();
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getAssetId() {
		return assetId;
	}

	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getCollectStartDt() {
		return collectStartDt;
	}

	public void setCollectStartDt(String collectStartDt) {
		this.collectStartDt = collectStartDt;
	}

	public String getCollectEndDt() {
		return collectEndDt;
	}

	public void setCollectEndDt(String collectEndDt) {
		this.collectEndDt = collectEndDt;
	}

	public String getProjectStep() {
		return projectStep;
	}

	public void setProjectStep(String projectStep) {
		this.projectStep = projectStep;
	}

	public String getProjectScale() {
		return projectScale;
	}

	public void setProjectScale(String projectScale) {
		this.projectScale = projectScale;
	}

	public String getProjectAddr() {
		return projectAddr;
	}

	public void setProjectAddr(String projectAddr) {
		this.projectAddr = projectAddr;
	}

	public String getProjectCarbon() {
		return projectCarbon;
	}

	public void setProjectCarbon(String projectCarbon) {
		this.projectCarbon = projectCarbon;
	}

	public String getHoldPeriod() {
		return holdPeriod;
	}

	public void setHoldPeriod(String holdPeriod) {
		this.holdPeriod = holdPeriod;
	}

	public String getRentType() {
		return rentType;
	}

	public void setRentType(String rentType) {
		this.rentType = rentType;
	}

	public String getRepayRentType() {
		return repayRentType;
	}

	public void setRepayRentType(String repayRentType) {
		this.repayRentType = repayRentType;
	}

	public String getRepayRentDt() {
		return repayRentDt;
	}

	public void setRepayRentDt(String repayRentDt) {
		this.repayRentDt = repayRentDt;
	}

	public String getLockPeriod() {
		return lockPeriod;
	}

	public void setLockPeriod(String lockPeriod) {
		this.lockPeriod = lockPeriod;
	}

	public String getNonmBackDt() {
		return nonmBackDt;
	}

	public void setNonmBackDt(String nonmBackDt) {
		this.nonmBackDt = nonmBackDt;
	}

	public String getContractDt() {
		return contractDt;
	}

	public void setContractDt(String contractDt) {
		this.contractDt = contractDt;
	}

	public String getBreBackCheck() {
		return breBackCheck;
	}

	public void setBreBackCheck(String breBackCheck) {
		this.breBackCheck = breBackCheck;
	}

	public String getBreBackDt() {
		return breBackDt;
	}

	public void setBreBackDt(String breBackDt) {
		this.breBackDt = breBackDt;
	}

	public String getTransfers() {
		return transfers;
	}

	public void setTransfers(String transfers) {
		this.transfers = transfers;
	}

	public Long getFinancePortion() {
		return financePortion;
	}

	public void setFinancePortion(Long financePortion) {
		this.financePortion = financePortion;
	}

	public Long getFinanceScale() {
		return financeScale;
	}

	public void setFinanceScale(Long financeScale) {
		this.financeScale = financeScale;
	}

	public Long getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(Long unitCost) {
		this.unitCost = unitCost;
	}

	public Long getLockScale() {
		return lockScale;
	}

	public void setLockScale(Long lockScale) {
		this.lockScale = lockScale;
	}

	public Long getDayFinanceAmt() {
		return dayFinanceAmt;
	}

	public void setDayFinanceAmt(Long dayFinanceAmt) {
		this.dayFinanceAmt = dayFinanceAmt;
	}

	public Long getConfFinanceAmt() {
		return confFinanceAmt;
	}

	public void setConfFinanceAmt(Long confFinanceAmt) {
		this.confFinanceAmt = confFinanceAmt;
	}

	public Long getRealFinanceAmt() {
		return realFinanceAmt;
	}

	public void setRealFinanceAmt(Long realFinanceAmt) {
		this.realFinanceAmt = realFinanceAmt;
	}

	public String getEstablishCondition() {
		return establishCondition;
	}

	public void setEstablishCondition(String establishCondition) {
		this.establishCondition = establishCondition;
	}

	public Long getEstablishRatio() {
		return establishRatio;
	}

	public void setEstablishRatio(Long establishRatio) {
		this.establishRatio = establishRatio;
	}

	public Long getEstablishMinimum() {
		return establishMinimum;
	}

	public void setEstablishMinimum(Long establishMinimum) {
		this.establishMinimum = establishMinimum;
	}

	public String getEstablishDate() {
		return establishDate;
	}

	public void setEstablishDate(String establishDate) {
		this.establishDate = establishDate;
	}

	public BigDecimal getExpectEarnRate() {
		return expectEarnRate;
	}

	public void setExpectEarnRate(BigDecimal expectEarnRate) {
		this.expectEarnRate = expectEarnRate;
	}

	@Override
	public String toString() {
		return "PrdCheckResDto [productId=" + productId + ", productName=" + productName + ", projectId=" + projectId
				+ ", assetId=" + assetId + ", assetName=" + assetName + ", productType=" + productType
				+ ", collectStartDt=" + collectStartDt + ", collectEndDt=" + collectEndDt + ", projectStep="
				+ projectStep + ", projectScale=" + projectScale + ", projectAddr=" + projectAddr + ", projectCarbon="
				+ projectCarbon + ", holdPeriod=" + holdPeriod + ", rentType=" + rentType + ", repayRentType="
				+ repayRentType + ", repayRentDt=" + repayRentDt + ", lockPeriod=" + lockPeriod + ", nonmBackDt="
				+ nonmBackDt + ", contractDt=" + contractDt + ", breBackCheck=" + breBackCheck + ", breBackDt="
				+ breBackDt + ", transfers=" + transfers + ", financePortion=" + financePortion + ", financeScale="
				+ financeScale + ", unitCost=" + unitCost + ", lockScale=" + lockScale + ", dayFinanceAmt="
				+ dayFinanceAmt + ", confFinanceAmt=" + confFinanceAmt + ", realFinanceAmt=" + realFinanceAmt
				+ ", establishCondition=" + establishCondition + ", establishRatio=" + establishRatio
				+ ", establishMinimum=" + establishMinimum + ", establishDate=" + establishDate + ", expectEarnRate="
				+ expectEarnRate + "]";
	}

}
