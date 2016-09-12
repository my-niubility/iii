package com.nbl.service.business.dto.res;

import java.io.Serializable;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0
 * @description :
 */
public class RateCountResponseDto implements Serializable {

	private static final long serialVersionUID = 7174717417742944888L;
	// 产品募集结束日期（输出格式为 yyyyMMdd）
	private String collectEndDate;
	// 产品计划融资规模（输出以元为单位）
	private long financeScale;
	// 产品实际融资规模（输出以元为单位）
	private long investScale;

	public String getCollectEndDate() {
		return collectEndDate;
	}

	public void setCollectEndDate(String collectEndDate) {
		this.collectEndDate = collectEndDate;
	}

	public long getFinanceScale() {
		return financeScale;
	}

	public void setFinanceScale(long financeScale) {
		this.financeScale = financeScale;
	}

	public long getInvestScale() {
		return investScale;
	}

	public void setInvestScale(long investScale) {
		this.investScale = investScale;
	}

}
