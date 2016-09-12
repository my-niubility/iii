package com.nbl.service.business.dto.res;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author maxinwei
 * @createdate 2016年4月11日
 * @version 1.0
 * @description :产品索引项
 */
public class PrdIdxItem implements Serializable {

	private static final long serialVersionUID = -5700236468753506592L;
	private String productId;

	private String productName;

	private String productType;

	private BigDecimal expectEarnRate;

	private Long unitCost;

	private String lockPeriod;

	private String repayRentType;

	private Long financePortion;

	private Long financeScale;

	private String projectId;

	private String projectName;

	private String projectIntro;

	private String projectBenefit;

	private String projectStMes;

	private String rentRights;

	private Date createTime;

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

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public BigDecimal getExpectEarnRate() {
		return expectEarnRate;
	}

	public void setExpectEarnRate(BigDecimal expectEarnRate) {
		this.expectEarnRate = expectEarnRate;
	}

	public Long getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(Long unitCost) {
		this.unitCost = unitCost;
	}

	public String getLockPeriod() {
		return lockPeriod;
	}

	public void setLockPeriod(String lockPeriod) {
		this.lockPeriod = lockPeriod;
	}

	public String getRepayRentType() {
		return repayRentType;
	}

	public void setRepayRentType(String repayRentType) {
		this.repayRentType = repayRentType;
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

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "PrdIdxItem [productId=" + productId + ", productName=" + productName + ", productType=" + productType
				+ ", expectEarnRate=" + expectEarnRate + ", unitCost=" + unitCost + ", lockPeriod=" + lockPeriod
				+ ", repayRentType=" + repayRentType + ", financePortion=" + financePortion + ", financeScale="
				+ financeScale + ", projectId=" + projectId + ", projectName=" + projectName + ", projectIntro="
				+ projectIntro + ", projectBenefit=" + projectBenefit + ", projectStMes=" + projectStMes
				+ ", rentRights=" + rentRights + ", createTime=" + createTime + "]";
	}

}
