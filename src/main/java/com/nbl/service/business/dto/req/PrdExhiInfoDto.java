package com.nbl.service.business.dto.req;

import java.io.Serializable;

public class PrdExhiInfoDto implements Serializable {

	private static final long serialVersionUID = -6589881410138552379L;

	/**
	 * 展示类型：01-首页-产品列表、02-新品中心-产品推荐、03-我的资产-为您推荐
	 */
	private String exhType;

	public String getExhType() {
		return exhType;
	}

	public void setExhType(String exhType) {
		this.exhType = exhType;
	}

	@Override
	public String toString() {
		return "PrdExhiInfoDto [exhType=" + exhType + "]";
	}

}
