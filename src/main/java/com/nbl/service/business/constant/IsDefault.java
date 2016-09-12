package com.nbl.service.business.constant;

/**
 * @author AlanMa
 * @createdate 2016年5月9日
 * @version 1.0
 * @description :是否为默认银行卡
 */
public enum IsDefault {

	YES("1", "默认卡"),

	NO("0", "非默认卡");

	private String value;
	private final String displayName;

	IsDefault(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public static IsDefault parseOf(String value) {

		for (IsDefault item : values())
			if (item.getValue().equals(value))
				return item;

		return null;
	}
}
