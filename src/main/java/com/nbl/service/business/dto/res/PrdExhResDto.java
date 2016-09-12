package com.nbl.service.business.dto.res;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PrdExhResDto implements Serializable {

	private static final long serialVersionUID = -3622842488635388604L;

	private List<PrdExhResItemDto> prdExhResItemDtos;

	public PrdExhResDto() {
		super();
		this.prdExhResItemDtos = new ArrayList<PrdExhResItemDto>();
	}

	public PrdExhResDto(List<PrdExhResItemDto> prdExhResItemDto) {
		super();
		this.prdExhResItemDtos = new ArrayList<PrdExhResItemDto>();
		this.prdExhResItemDtos.addAll(prdExhResItemDto);
	}

	public List<PrdExhResItemDto> getPrdExhResItemDtos() {
		return prdExhResItemDtos;
	}

	public void setPrdExhResItemDtos(List<PrdExhResItemDto> prdExhResItemDto) {
		this.prdExhResItemDtos = prdExhResItemDto;
	}

	public void addPrdExhResItemDtos(List<PrdExhResItemDto> prdExhResItemDto) {
		this.prdExhResItemDtos.addAll(prdExhResItemDto);
	}

	@Override
	public String toString() {
		return "PrdExhResDto [prdExhResItemDtos=" + prdExhResItemDtos + "]";
	}

}
