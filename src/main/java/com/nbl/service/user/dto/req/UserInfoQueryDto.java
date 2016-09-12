package com.nbl.service.user.dto.req;

import java.io.Serializable;

public class UserInfoQueryDto implements Serializable {

	private static final long serialVersionUID = 1832367125055240797L;

	/**
	 * 用户编号（电话）
	 */
	private String userId;
	/**
	 * 客户编号
	 */
	private String custId;

	public UserInfoQueryDto() {
		super();
	}

	public UserInfoQueryDto(String userId, String custId) {
		super();
		this.userId = userId;
		this.custId = custId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	@Override
	public String toString() {
		return "UserInfoQueryDto [userId=" + userId + ", custId=" + custId + "]";
	}

}
