package com.nbl.service.user.dto.res;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author maxinwei
 * @createdate 2016年4月11日
 * @version 1.0
 * @description :交易订单详情查询结果（光伏系列）
 */
public class PrdSolarInfoRsltDto implements Serializable {

	private static final long serialVersionUID = 881576231800296242L;

	public PrdSolarInfoRsltDto() {
		super();
	}

	private String contractId;

	private String productId;

	private String productNane;
	// Product信息

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

	private Long subsidySumAmt;

	private BigDecimal subsidyRate;

	private Long investMax;

	private String financeId;

	private String financeName;

	private String financeIntro;

	private String productStatus;

	private String remark1;

	private String remark2;

	private String checkInfo;
	private Date productCreateTime;
	// Project信息
	private String projectName;

	private String projectIntro;

	private String projectBenefit;

	private String projectStMes;

	private String rentRights;

	private String rentTrack;

	private String rentOperate;

	private String projectRemark1;

	private String projectRemark2;

	private String projectRemark3;

	private String projectRemark4;

	private Date projectCreateTime;

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

	public Long getSubsidySumAmt() {
		return subsidySumAmt;
	}

	public void setSubsidySumAmt(Long subsidySumAmt) {
		this.subsidySumAmt = subsidySumAmt;
	}

	public BigDecimal getSubsidyRate() {
		return subsidyRate;
	}

	public void setSubsidyRate(BigDecimal subsidyRate) {
		this.subsidyRate = subsidyRate;
	}

	public Long getInvestMax() {
		return investMax;
	}

	public void setInvestMax(Long investMax) {
		this.investMax = investMax;
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

	public String getFinanceIntro() {
		return financeIntro;
	}

	public void setFinanceIntro(String financeIntro) {
		this.financeIntro = financeIntro;
	}

	public String getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getRemark1() {
		return remark1;
	}

	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}

	public String getRemark2() {
		return remark2;
	}

	public void setRemark2(String remark2) {
		this.remark2 = remark2;
	}

	public String getCheckInfo() {
		return checkInfo;
	}

	public void setCheckInfo(String checkInfo) {
		this.checkInfo = checkInfo;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectIntro() {
		return projectIntro;
	}

	public void setProjectIntro(String projectIntro) {
		this.projectIntro = projectIntro;
	}

	public String getProjectBenefit() {
		return projectBenefit;
	}

	public void setProjectBenefit(String projectBenefit) {
		this.projectBenefit = projectBenefit;
	}

	public String getProjectStMes() {
		return projectStMes;
	}

	public void setProjectStMes(String projectStMes) {
		this.projectStMes = projectStMes;
	}

	public String getRentRights() {
		return rentRights;
	}

	public void setRentRights(String rentRights) {
		this.rentRights = rentRights;
	}

	public String getRentTrack() {
		return rentTrack;
	}

	public void setRentTrack(String rentTrack) {
		this.rentTrack = rentTrack;
	}

	public String getRentOperate() {
		return rentOperate;
	}

	public void setRentOperate(String rentOperate) {
		this.rentOperate = rentOperate;
	}

	public String getProjectRemark1() {
		return projectRemark1;
	}

	public void setProjectRemark1(String projectRemark1) {
		this.projectRemark1 = projectRemark1;
	}

	public String getProjectRemark2() {
		return projectRemark2;
	}

	public void setProjectRemark2(String projectRemark2) {
		this.projectRemark2 = projectRemark2;
	}

	public String getProjectRemark3() {
		return projectRemark3;
	}

	public void setProjectRemark3(String projectRemark3) {
		this.projectRemark3 = projectRemark3;
	}

	public String getProjectRemark4() {
		return projectRemark4;
	}

	public void setProjectRemark4(String projectRemark4) {
		this.projectRemark4 = projectRemark4;
	}

	public Date getProjectCreateTime() {
		return projectCreateTime;
	}

	public void setProjectCreateTime(Date projectCreateTime) {
		this.projectCreateTime = projectCreateTime;
	}

	public String getProductNane() {
		return productNane;
	}

	public void setProductNane(String productNane) {
		this.productNane = productNane;
	}

	public Date getProductCreateTime() {
		return productCreateTime;
	}

	public void setProductCreateTime(Date productCreateTime) {
		this.productCreateTime = productCreateTime;
	}

	@Override
	public String toString() {
		return "PrdSolarInfoRsltDto [contractId=" + contractId + ", productId=" + productId + ", productNane="
				+ productNane + ", productName=" + productName + ", projectId=" + projectId + ", assetId=" + assetId
				+ ", assetName=" + assetName + ", productType=" + productType + ", collectStartDt=" + collectStartDt
				+ ", collectEndDt=" + collectEndDt + ", projectStep=" + projectStep + ", projectScale=" + projectScale
				+ ", projectAddr=" + projectAddr + ", projectCarbon=" + projectCarbon + ", holdPeriod=" + holdPeriod
				+ ", rentType=" + rentType + ", repayRentType=" + repayRentType + ", repayRentDt=" + repayRentDt
				+ ", lockPeriod=" + lockPeriod + ", nonmBackDt=" + nonmBackDt + ", contractDt=" + contractDt
				+ ", breBackCheck=" + breBackCheck + ", breBackDt=" + breBackDt + ", transfers=" + transfers
				+ ", financePortion=" + financePortion + ", financeScale=" + financeScale + ", unitCost=" + unitCost
				+ ", lockScale=" + lockScale + ", dayFinanceAmt=" + dayFinanceAmt + ", confFinanceAmt=" + confFinanceAmt
				+ ", realFinanceAmt=" + realFinanceAmt + ", establishCondition=" + establishCondition
				+ ", establishRatio=" + establishRatio + ", establishMinimum=" + establishMinimum + ", establishDate="
				+ establishDate + ", expectEarnRate=" + expectEarnRate + ", subsidySumAmt=" + subsidySumAmt
				+ ", subsidyRate=" + subsidyRate + ", investMax=" + investMax + ", financeId=" + financeId
				+ ", financeName=" + financeName + ", financeIntro=" + financeIntro + ", productStatus=" + productStatus
				+ ", remark1=" + remark1 + ", remark2=" + remark2 + ", checkInfo=" + checkInfo + ", productCreateTime="
				+ productCreateTime + ", projectName=" + projectName + ", projectIntro=" + projectIntro
				+ ", projectBenefit=" + projectBenefit + ", projectStMes=" + projectStMes + ", rentRights=" + rentRights
				+ ", rentTrack=" + rentTrack + ", rentOperate=" + rentOperate + ", projectRemark1=" + projectRemark1
				+ ", projectRemark2=" + projectRemark2 + ", projectRemark3=" + projectRemark3 + ", projectRemark4="
				+ projectRemark4 + ", projectCreateTime=" + projectCreateTime + "]";
	}

}
