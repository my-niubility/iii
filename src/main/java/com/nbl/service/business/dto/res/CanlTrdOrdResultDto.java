package com.nbl.service.business.dto.res;

import java.io.Serializable;

public class CanlTrdOrdResultDto implements Serializable {

	private static final long serialVersionUID = 7235624233594782941L;

	/**
	 * 更新条数
	 */
	private String num;

	public CanlTrdOrdResultDto() {
		super();
	}

	public CanlTrdOrdResultDto(String num) {
		super();
		this.num = num;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "CanlTrdOrdResultDto [num=" + num + "]";
	}

}
