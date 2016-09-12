package com.nbl.service.business.dto.req;

import java.io.Serializable;

public class PrdDtlInfoQryDto implements Serializable {

	private static final long serialVersionUID = 7763338248864599128L;

	/**
	 * 产品编号
	 */
	private String productId;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "PrdDetailInfo [productId=" + productId + "]";
	}
}
