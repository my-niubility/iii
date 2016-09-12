package com.nbl.service.user.dto.req;

import java.io.Serializable;

public class TrdOrdDtlQryDto implements Serializable {

	private static final long serialVersionUID = 1813171548359187090L;

	/**
	 * 交易订单号
	 */
	private String tradeOrderId;

	public String getTradeOrderId() {
		return tradeOrderId;
	}

	public void setTradeOrderId(String tradeOrderId) {
		this.tradeOrderId = tradeOrderId;
	}

	@Override
	public String toString() {
		return "TrdOrdDtlQryDto [tradeOrderId=" + tradeOrderId + "]";
	}


}
