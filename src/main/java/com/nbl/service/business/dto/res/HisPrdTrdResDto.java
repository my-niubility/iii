package com.nbl.service.business.dto.res;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class HisPrdTrdResDto implements Serializable {

	private static final long serialVersionUID = -4820871352164652599L;

	private List<HisPrdTrdResItemDto> hisPrdTrdResItemDtos;

	public HisPrdTrdResDto() {
		super();
		this.hisPrdTrdResItemDtos = new ArrayList<HisPrdTrdResItemDto>();
	}

	public HisPrdTrdResDto(List<HisPrdTrdResItemDto> hisPrdTrdResItemDtos) {
		super();
		this.hisPrdTrdResItemDtos = new ArrayList<HisPrdTrdResItemDto>();
		this.hisPrdTrdResItemDtos.addAll(hisPrdTrdResItemDtos);
	}

	public List<HisPrdTrdResItemDto> getSerFundQryRsltItemDto() {
		return hisPrdTrdResItemDtos;
	}

	public void setSerFundQryRsltItemDto(List<HisPrdTrdResItemDto> hisPrdTrdResItemDto) {
		this.hisPrdTrdResItemDtos = hisPrdTrdResItemDto;
	}

	public void addAll(List<HisPrdTrdResItemDto> hisPrdTrdResItemDto) {
		if (hisPrdTrdResItemDto != null)
			this.hisPrdTrdResItemDtos.addAll(hisPrdTrdResItemDto);
	}

	@Override
	public String toString() {
		return "HisPrdTrdResDto [hisPrdTrdResItemDtos=" + hisPrdTrdResItemDtos.toString() + "]";
	}
}
