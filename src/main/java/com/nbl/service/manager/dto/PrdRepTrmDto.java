package com.nbl.service.manager.dto;

import java.io.Serializable;
import java.util.List;

public class PrdRepTrmDto implements Serializable {

	private static final long serialVersionUID = -8673228036080720286L;

	private String id;

	private String productId;

	private String productName;

	private String repayCustId;

	private String repayCustName;

	private Long repayTerm;

	private String repayEndDate;

	private String repayInterestStr;

	private String amtStr;

	private String repayAmtStr;

	private Short enabled;

	private List<Short> isFinishCond;

	private String repayType;

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

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getRepayCustId() {
		return repayCustId;
	}

	public void setRepayCustId(String repayCustId) {
		this.repayCustId = repayCustId;
	}

	public String getRepayCustName() {
		return repayCustName;
	}

	public void setRepayCustName(String repayCustName) {
		this.repayCustName = repayCustName;
	}

	public Long getRepayTerm() {
		return repayTerm;
	}

	public void setRepayTerm(Long repayTerm) {
		this.repayTerm = repayTerm;
	}

	public String getRepayEndDate() {
		return repayEndDate;
	}

	public void setRepayEndDate(String repayEndDate) {
		this.repayEndDate = repayEndDate;
	}

	public String getRepayInterestStr() {
		return repayInterestStr;
	}

	public void setRepayInterestStr(String repayInterestStr) {
		this.repayInterestStr = repayInterestStr;
	}

	public String getAmtStr() {
		return amtStr;
	}

	public void setAmtStr(String amtStr) {
		this.amtStr = amtStr;
	}

	public String getRepayAmtStr() {
		return repayAmtStr;
	}

	public void setRepayAmtStr(String repayAmtStr) {
		this.repayAmtStr = repayAmtStr;
	}

	public Short getEnabled() {
		return enabled;
	}

	public void setEnabled(Short enabled) {
		this.enabled = enabled;
	}

	public List<Short> getIsFinishCond() {
		return isFinishCond;
	}

	public void setIsFinishCond(List<Short> isFinishCond) {
		this.isFinishCond = isFinishCond;
	}

	public String getRepayType() {
		return repayType;
	}

	public void setRepayType(String repayType) {
		this.repayType = repayType;
	}

	@Override
	public String toString() {
		return "PrdRepTrmDto [id=" + id + ", productId=" + productId + ", productName=" + productName + ", repayCustId=" + repayCustId + ", repayCustName=" + repayCustName + ", repayTerm=" + repayTerm
				+ ", repayEndDate=" + repayEndDate + ", repayInterestStr=" + repayInterestStr + ", amtStr=" + amtStr + ", repayAmtStr=" + repayAmtStr + ", enabled=" + enabled + ", isFinishCond="
				+ isFinishCond + ", repayType=" + repayType + "]";
	}

}
