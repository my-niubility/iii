package com.nbl.service.business.constant;

/**
 * @author AlanMa
 * @createdate 2016年5月9日
 * @version 1.0
 * @description :资金流水查询类型
 */
public enum SerFundQryType {

	RECHARGE("01", "充值"),

	PURCHASE("02", "购买"),

	WITHDRAW("03", "提现"),

	BENEFIT("04", "收益"),

	REDEEM("05", "赎回");

	private String value;
	private final String displayName;

	SerFundQryType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public static SerFundQryType parseOf(String value) {

		for (SerFundQryType item : values())
			if (item.getValue().equals(value))
				return item;

		return null;
	}
}
