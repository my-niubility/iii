package com.nbl.service.business.dto.req;

import java.io.Serializable;

public class CanlTrdOrdDto implements Serializable {

	private static final long serialVersionUID = -1433209127156149190L;

	/**
	 * 客户编号
	 */
	private String custId;

	/**
	 * 交易订单号
	 */
	private String tradeOrderId;

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getTradeOrderId() {
		return tradeOrderId;
	}

	public void setTradeOrderId(String tradeOrderId) {
		this.tradeOrderId = tradeOrderId;
	}

	@Override
	public String toString() {
		return "CanlTrdOrdDto [custId=" + custId + ", tradeOrderId=" + tradeOrderId + "]";
	}

}
