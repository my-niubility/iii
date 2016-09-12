package com.nbl.service.business.constant;

/**
 * @author AlanMa
 * @createdate 2016年5月9日
 * @version 1.0
 * @description :主键编号前缀
 */
public enum IdPrefix {
	PAYMENT_ORDER("PO", "支付订单前缀"),
	RECHARGE_ORDER("RO", "充值订单前缀"),
	WITHDRAW_ORDER("WO", "提现订单前缀"),
	TRADE_ORDER("TO", "交易订单前缀");

	private String value;
	private final String displayName;

	IdPrefix(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public static IdPrefix parseOf(String value) {

		for (IdPrefix item : values())
			if (item.getValue().equals(value))
				return item;

		return null;
	}
}
