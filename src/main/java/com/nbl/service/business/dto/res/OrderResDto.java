package com.nbl.service.business.dto.res;

import java.io.Serializable;
import java.util.List;

public class OrderResDto implements Serializable {

	private static final long serialVersionUID = -7504133476455761693L;

	private TradeOrderResDto to;
	private List<PayOrderResDto> pos;

	public OrderResDto(TradeOrderResDto to, List<PayOrderResDto> pos) {
		super();
		this.to = to;
		this.pos = pos;
	}

	public TradeOrderResDto getTo() {
		return to;
	}

	public void setTo(TradeOrderResDto to) {
		this.to = to;
	}

	public List<PayOrderResDto> getPos() {
		return pos;
	}

	public void setPos(List<PayOrderResDto> pos) {
		this.pos = pos;
	}

	@Override
	public String toString() {
		return "OrderResDto [to=" + to + ", pos=" + pos + "]";
	}



}
