package com.nbl.service.business.dto.req;

import java.io.Serializable;

public class InvHisDto implements Serializable {

	private static final long serialVersionUID = 7047561905241094397L;
	/**
	 * 客户编号
	 */
	private String custId;

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	@Override
	public String toString() {
		return "InvestHistoryInfo [custId=" + custId + "]";
	}

}
