package com.nbl.service.business.constant;

/**
 * @author AlanMa
 * @createdate 2016年5月9日
 * @version 1.0
 * @description :Token业务场景编码
 */
public enum BusCase {

	PAYMENT("01", "支付场景");

	private String value;
	private final String displayName;

	BusCase(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public static BusCase parseOf(String value) {

		for (BusCase item : values())
			if (item.getValue() == value)
				return item;

		return null;
	}
}
