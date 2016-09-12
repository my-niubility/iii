package com.nbl.service.user.dto.res;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author maxinwei
 * @createdate 2016年4月11日
 * @version 1.0
 * @description :提現订单查询结果
 */
public class WthdrQryResultDto implements Serializable {

	private static final long serialVersionUID = -7125637425081456898L;
	
	private List<WthdrQryRltItemDto> wthdrQryRltItemDtos;

	public WthdrQryResultDto() {
		super();
		this.wthdrQryRltItemDtos = new ArrayList<WthdrQryRltItemDto>();
	}

	public WthdrQryResultDto(List<WthdrQryRltItemDto> WthdryQryRltItemDtos) {
		super();
		this.wthdrQryRltItemDtos = new ArrayList<WthdrQryRltItemDto>();
		this.wthdrQryRltItemDtos.addAll(WthdryQryRltItemDtos);
	}

	public List<WthdrQryRltItemDto> getWthdryQryRltItemDto() {
		return wthdrQryRltItemDtos;
	}

	public void setWthdryQryRltItemDto(List<WthdrQryRltItemDto> wthdryQryRltItemDto) {
		this.wthdrQryRltItemDtos = wthdryQryRltItemDto;
	}

	@Override
	public String toString() {
		return "RchgQryResultDto [WthdryQryRltItemDto=" + wthdrQryRltItemDtos + "]";
	}

}
