package com.nbl.service.business.dto.res;

import java.io.Serializable;
import java.util.List;

/**
 * @author AlanMa
 * @createdate 2016年5月9日
 * @version 1.0
 * @description :
 */
public class CalculatorResDto implements Serializable {

	private static final long serialVersionUID = -1109806653817120492L;
	// 总收入
	private String interest;
	// 各期本金、利息明细信息
	private List<RateCountMsgStrDto> rateCountMsgs;

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public List<RateCountMsgStrDto> getRateCountMsgs() {
		return rateCountMsgs;
	}

	public void setRateCountMsgs(List<RateCountMsgStrDto> rateCountMsgs) {
		this.rateCountMsgs = rateCountMsgs;
	}

	@Override
	public String toString() {
		return "CalculatorResDto [interest=" + interest + ", rateCountMsgs=" + rateCountMsgs + "]";
	}

}
