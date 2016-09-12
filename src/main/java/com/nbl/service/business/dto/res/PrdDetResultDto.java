package com.nbl.service.business.dto.res;

import java.io.Serializable;

public class PrdDetResultDto implements Serializable {

	private static final long serialVersionUID = -1683211923996399745L;
	private PrdExhResItemDto prdComm;
	private Object prdFeature;

	public PrdDetResultDto() {
		super();
	}

	public PrdDetResultDto(PrdExhResItemDto prdComm, Object prdFeature) {
		super();
		this.prdComm = prdComm;
		this.prdFeature = prdFeature;
	}

	public PrdExhResItemDto getPrdComm() {
		return prdComm;
	}

	public void setPrdComm(PrdExhResItemDto prdComm) {
		this.prdComm = prdComm;
	}

	public Object getPrdFeature() {
		return prdFeature;
	}

	public void setPrdFeature(Object prdFeature) {
		this.prdFeature = prdFeature;
	}

	@Override
	public String toString() {
		return "PrdDetResultDto [prdComm=" + prdComm + ", prdFeature=" + prdFeature + "]";
	}

}
