package com.nbl.service.user.dto.res;

import java.io.Serializable;

/**
 * @author maxinwei
 * @createdate 2016年4月11日
 * @version 1.0
 * @description :用户基本信息查询结果
 */
public class BalanceInfoResultDto implements Serializable {
	private static final long serialVersionUID = -736192657776552891L;
	/**
	 * 可用余额
	 */
	private String usableBalance;

	public BalanceInfoResultDto() {
		super();
	}

	public BalanceInfoResultDto(String usableBalance) {
		super();
		this.usableBalance = usableBalance;
	}

	public String getUsableBalance() {
		return usableBalance;
	}

	public void setUsableBalance(String usableBalance) {
		this.usableBalance = usableBalance;
	}

	@Override
	public String toString() {
		return "BalanceInfoResultDto [usableBalance=" + usableBalance + "]";
	}
}
