package com.nbl.service.user.dto.req;

import java.io.Serializable;

public class BalanceInfoQueryDto implements Serializable {

	private static final long serialVersionUID = -3895947353314566193L;
	/**
	 * 客户编号
	 */
	private String custId;
	/**
	 * 支付渠道编码
	 */
	private String payChanlCode;

	public BalanceInfoQueryDto() {
		super();
	}

	public BalanceInfoQueryDto(String custId, String payChanlCode) {
		super();
		this.custId = custId;
		this.payChanlCode = payChanlCode;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getPayChanlCode() {
		return payChanlCode;
	}

	public void setPayChanlCode(String payChanlCode) {
		this.payChanlCode = payChanlCode;
	}

	@Override
	public String toString() {
		return "BalanceInfoQueryDto [custId=" + custId + ", payChanlCode=" + payChanlCode + "]";
	}

}
