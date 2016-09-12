package com.nbl.service.user.dto.req;

import java.io.Serializable;

/**
 * @author AlanMa
 * @createdate 2016年5月23日
 * @version 1.0
 * @description :银行卡信息查询
 */
public class QryBnkCrdDto implements Serializable {

	private static final long serialVersionUID = 8620415526506307919L;
	/**
	 * 用户编号
	 */
	private String custId;

	public QryBnkCrdDto() {
		super();
	}

	public QryBnkCrdDto(String custId) {
		super();
		this.custId = custId;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	@Override
	public String toString() {
		return "QryBnkCrdDto [custId=" + custId + "]";
	}

}
