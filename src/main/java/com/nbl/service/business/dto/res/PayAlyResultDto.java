package com.nbl.service.business.dto.res;

import java.io.Serializable;

public class PayAlyResultDto implements Serializable {

	private static final long serialVersionUID = 1357133233576349965L;

	/**
	 * 支付流水号
	 */
	private String paymentSerialNum;

	/**
	 * 支付账号
	 */
	private String paymentAcc;
	
	/**
	 * 第三方支付订单号
	 */
	private String thdPayOrdId;

	/**
	 * 交易结果信息
	 */
	private String resultInfo;

	public PayAlyResultDto() {
		super();
	}

	public PayAlyResultDto(String paymentSerialNum, String paymentAcc) {
		this.paymentSerialNum = paymentSerialNum;
		this.paymentAcc = paymentAcc;
	}

	public String getPaymentSerialNum() {
		return paymentSerialNum;
	}

	public void setPaymentSerialNum(String paymentSerialNum) {
		this.paymentSerialNum = paymentSerialNum;
	}

	public String getPaymentAcc() {
		return paymentAcc;
	}

	public void setPaymentAcc(String paymentAcc) {
		this.paymentAcc = paymentAcc;
	}

	public String getResultInfo() {
		return resultInfo;
	}

	public void setResultInfo(String resultInfo) {
		this.resultInfo = resultInfo;
	}

	public String getThdPayOrdId() {
		return thdPayOrdId;
	}

	public void setThdPayOrdId(String thdPayOrdId) {
		this.thdPayOrdId = thdPayOrdId;
	}

	@Override
	public String toString() {
		return "PayAlyResultDto [paymentSerialNum=" + paymentSerialNum + ", paymentAcc=" + paymentAcc + ", thdPayOrdId=" + thdPayOrdId + ", resultInfo=" + resultInfo + "]";
	}

}
