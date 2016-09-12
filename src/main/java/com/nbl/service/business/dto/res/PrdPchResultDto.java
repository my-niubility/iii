package com.nbl.service.business.dto.res;

import java.io.Serializable;

public class PrdPchResultDto  implements Serializable {

	private static final long serialVersionUID = 7263354385684277030L;

	/**
	 * 订单ID
	 */
	private String id;

	/**
	 * 订单状态
	 */
	private String orderStatus;
	
	/**
	 * 标记
	 */
	private String token;

	public PrdPchResultDto() {
		super();
	}

	public PrdPchResultDto(String id, String orderStatus) {
		this.id = id;
		this.orderStatus = orderStatus;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "PrdPchResultDto [id=" + id + ", orderStatus=" + orderStatus + "]";
	}

}
