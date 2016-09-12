package com.nbl.service.user.dto.res;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author maxinwei
 * @createdate 2016年4月11日
 * @version 1.0
 * @description :资金流水查询结果
 */
public class SerialFundQryRsltDto implements Serializable {

	private static final long serialVersionUID = -1089660453829814086L;

	private List<SerFundQryRsltItemDto> serFundQryRsltItemDtos;

	public SerialFundQryRsltDto() {
		super();
		this.serFundQryRsltItemDtos = new ArrayList<SerFundQryRsltItemDto>();
	}

	public SerialFundQryRsltDto(List<SerFundQryRsltItemDto> serFundQryRsltItemDtos) {
		super();
		this.serFundQryRsltItemDtos = new ArrayList<SerFundQryRsltItemDto>();
		this.serFundQryRsltItemDtos.addAll(serFundQryRsltItemDtos);
	}

	public List<SerFundQryRsltItemDto> getSerFundQryRsltItemDto() {
		return serFundQryRsltItemDtos;
	}

	public void setSerFundQryRsltItemDto(List<SerFundQryRsltItemDto> serFundQryRsltItemDto) {
		this.serFundQryRsltItemDtos = serFundQryRsltItemDto;
	}

	public void addAll(List<SerFundQryRsltItemDto> serFundQryRsltItemDto) {
		if (serFundQryRsltItemDto != null)
			this.serFundQryRsltItemDtos.addAll(serFundQryRsltItemDto);
	}

	@Override
	public String toString() {
		return "SerialFundQryRsltDto [serFundQryRsltItemDtos=" + serFundQryRsltItemDtos.toString() + "]";
	}

}
