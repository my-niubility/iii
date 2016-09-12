package com.nbl.service.user.dto.res;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author maxinwei
 * @createdate 2016年4月11日
 * @version 1.0
 * @description :充值订单查询结果
 */
public class RchgQryResultDto implements Serializable {

	private static final long serialVersionUID = -3699377051583179281L;

	private List<RchgQryRltItemDto> rchgQryRltItemDtos;

	public RchgQryResultDto() {
		super();
		this.rchgQryRltItemDtos = new ArrayList<RchgQryRltItemDto>();
	}

	public RchgQryResultDto(List<RchgQryRltItemDto> rchgQryRltItemDtos) {
		super();
		this.rchgQryRltItemDtos = new ArrayList<RchgQryRltItemDto>();
		this.rchgQryRltItemDtos.addAll(rchgQryRltItemDtos);
	}

	public List<RchgQryRltItemDto> getRchgQryRltItemDto() {
		return rchgQryRltItemDtos;
	}

	public void setRchgQryRltItemDto(List<RchgQryRltItemDto> rchgQryRltItemDto) {
		this.rchgQryRltItemDtos = rchgQryRltItemDto;
	}

	@Override
	public String toString() {
		return "RchgQryResultDto [rchgQryRltItemDto=" + rchgQryRltItemDtos + "]";
	}

}
