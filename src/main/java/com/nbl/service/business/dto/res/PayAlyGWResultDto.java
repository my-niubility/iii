package com.nbl.service.business.dto.res;

import java.io.Serializable;

public class PayAlyGWResultDto implements Serializable {

	private static final long serialVersionUID = 8442047466073222384L;

	/**
	 * 支付流水号
	 */
	private String paymentSerialNum;

	/**
	 * 第三方地址
	 */
	private String thdUrl;

	public PayAlyGWResultDto() {
		super();
	}

	public PayAlyGWResultDto(String paymentSerialNum, String thdUrl) {
		this.paymentSerialNum = paymentSerialNum;
		this.thdUrl = thdUrl;
	}

	public String getPaymentSerialNum() {
		return paymentSerialNum;
	}

	public void setPaymentSerialNum(String paymentSerialNum) {
		this.paymentSerialNum = paymentSerialNum;
	}

	public String getThdUrl() {
		return thdUrl;
	}

	public void setThdUrl(String thdUrl) {
		this.thdUrl = thdUrl;
	}

	@Override
	public String toString() {
		return "PayAlyGWResultDto [paymentSerialNum=" + paymentSerialNum + ", thdUrl=" + thdUrl + "]";
	}

}
