package com.nbl.service.user.dto.res;

import java.io.Serializable;

/**
 * @author maxinwei
 * @createdate 2016年4月11日
 * @version 1.0
 * @description :用户资金信息查询结果
 */
public class FundsInfoResultDto implements Serializable {

	private static final long serialVersionUID = 7701971895515002586L;
	/**
	 * 累计收益
	 */
	private String accIncome;
	/**
	 * 待收收益
	 */
	private String intrsCpnIncome;
	/**
	 * 在途资金
	 */
	private String frozenFund;

	public FundsInfoResultDto(String accIncome, String intrsCpnIncome, String frozenFund) {
		super();
		this.accIncome = accIncome;
		this.intrsCpnIncome = intrsCpnIncome;
		this.frozenFund = frozenFund;
	}

	public FundsInfoResultDto() {
		super();
	}

	public String getAccIncome() {
		return accIncome;
	}

	public void setAccIncome(String accIncome) {
		this.accIncome = accIncome;
	}

	public String getIntrsCpnIncome() {
		return intrsCpnIncome;
	}

	public void setIntrsCpnIncome(String intrsCpnIncome) {
		this.intrsCpnIncome = intrsCpnIncome;
	}

	public String getFrozenFund() {
		return frozenFund;
	}

	public void setFrozenFund(String frozenFund) {
		this.frozenFund = frozenFund;
	}

	@Override
	public String toString() {
		return "FundsInfoResultDto [accIncome=" + accIncome + ", intrsCpnIncome=" + intrsCpnIncome + ", frozenFund="
				+ frozenFund + "]";
	}

}
