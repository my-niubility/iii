package com.nbl.service.user.dto.res;

import java.io.Serializable;

public class ReLgnErrNumResultDto implements Serializable {

	private static final long serialVersionUID = 7235624233594782941L;

	/**
	 * 更新条数
	 */
	private String num;

	public ReLgnErrNumResultDto() {
		super();
	}

	public ReLgnErrNumResultDto(String num) {
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
		return "ReLgnErrNumResultDto [num=" + num + "]";
	}

}
