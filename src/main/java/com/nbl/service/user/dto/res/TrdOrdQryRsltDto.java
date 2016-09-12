package com.nbl.service.user.dto.res;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author maxinwei
 * @createdate 2016年4月11日
 * @version 1.0
 * @description :交易订单查询结果
 */
public class TrdOrdQryRsltDto implements Serializable {

	private static final long serialVersionUID = -9078326733805970671L;
	
	private List<TradeInfoItemDto> tradeInfoItemDtos;

	public TrdOrdQryRsltDto(List<TradeInfoItemDto> tradeInfoItemDtos) {
		super();
		this.tradeInfoItemDtos = tradeInfoItemDtos;
	}

	public List<TradeInfoItemDto> getTradeInfoItemDtos() {
		return tradeInfoItemDtos;
	}

	public void setTradeInfoItemDtos(List<TradeInfoItemDto> tradeInfoItemDtos) {
		this.tradeInfoItemDtos = tradeInfoItemDtos;
	}

	@Override
	public String toString() {
		return "TrdOrdQryRsltDto [tradeInfoItemDtos=" + tradeInfoItemDtos + "]";
	}

}
