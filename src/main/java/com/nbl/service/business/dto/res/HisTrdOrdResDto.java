package com.nbl.service.business.dto.res;

import java.io.Serializable;

public class HisTrdOrdResDto implements Serializable {

	private static final long serialVersionUID = 2321055031880058347L;

	/**
	 * 历史成交订单数
	 */
	private String hisTrdOrdNum;
	/**
	 * 支昨日成交订单数
	 */
	private String yesTrdOrdNum;
	/**
	 * 已发放租金
	 */
	private String rent;

	public HisTrdOrdResDto() {
		super();
	}

	public HisTrdOrdResDto(String hisTrdOrdNum, String yesTrdOrdNum, String rent) {
		super();
		this.hisTrdOrdNum = hisTrdOrdNum;
		this.yesTrdOrdNum = yesTrdOrdNum;
		this.rent = rent;
	}

	public String getHisTrdOrdNum() {
		return hisTrdOrdNum;
	}

	public void setHisTrdOrdNum(String hisTrdOrdNum) {
		this.hisTrdOrdNum = hisTrdOrdNum;
	}

	public String getYesTrdOrdNum() {
		return yesTrdOrdNum;
	}

	public void setYesTrdOrdNum(String yesTrdOrdNum) {
		this.yesTrdOrdNum = yesTrdOrdNum;
	}

	public String getRent() {
		return rent;
	}

	public void setRent(String rent) {
		this.rent = rent;
	}

	@Override
	public String toString() {
		return "HisTrdOrdResDto [hisTrdOrdNum=" + hisTrdOrdNum + ", yesTrdOrdNum=" + yesTrdOrdNum + ", rent=" + rent
				+ "]";
	}

}
