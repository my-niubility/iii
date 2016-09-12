package com.nbl.service.business.dto.res;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class InvHisResDto implements Serializable {

	private static final long serialVersionUID = -584870993670350014L;
	
	private List<InvHisResItemDto> invHisResItemDtos;

	public InvHisResDto() {
		super();
		this.invHisResItemDtos = new ArrayList<InvHisResItemDto>();
	}

	public InvHisResDto(List<InvHisResItemDto> invHisResItemDtos) {
		super();
		this.invHisResItemDtos = new ArrayList<InvHisResItemDto>();
		this.invHisResItemDtos.addAll(invHisResItemDtos);
	}

	public List<InvHisResItemDto> getSerFundQryRsltItemDto() {
		return invHisResItemDtos;
	}

	public void setSerFundQryRsltItemDto(List<InvHisResItemDto> invHisResItemDtos) {
		this.invHisResItemDtos = invHisResItemDtos;
	}

	public void addAll(List<InvHisResItemDto> invHisResItemDtos) {
		if (invHisResItemDtos != null)
			this.invHisResItemDtos.addAll(invHisResItemDtos);
	}

	@Override
	public String toString() {
		return "HisPrdTrdResDto [invHisResItemDtos=" + invHisResItemDtos.toString() + "]";
	}
}
