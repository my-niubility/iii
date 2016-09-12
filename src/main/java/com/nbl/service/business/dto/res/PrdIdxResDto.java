package com.nbl.service.business.dto.res;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PrdIdxResDto implements Serializable {

	private static final long serialVersionUID = 8767529363079965927L;

	private List<PrdIdxItem> PrdIdxItems;

	public PrdIdxResDto() {
		super();
		this.PrdIdxItems = new ArrayList<PrdIdxItem>();
	}

	public PrdIdxResDto(List<PrdIdxItem> PrdIdxItem) {
		super();
		this.PrdIdxItems = new ArrayList<PrdIdxItem>();
		this.PrdIdxItems.addAll(PrdIdxItem);
	}

	public List<PrdIdxItem> getTrdOrdQryRltItemDtos() {
		return PrdIdxItems;
	}

	public void setTrdOrdQryRltItemDtos(List<PrdIdxItem> PrdIdxItem) {
		this.PrdIdxItems = PrdIdxItem;
	}

	public void addTrdOrdQryRltItemDtos(List<PrdIdxItem> PrdIdxItem) {
		this.PrdIdxItems.addAll(PrdIdxItem);
	}

	@Override
	public String toString() {
		return "PrdIdxResDto [PrdIdxItems=" + PrdIdxItems + "]";
	}
}
