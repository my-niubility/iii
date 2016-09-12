package com.nbl.service.business.constant;

/**
 * @author AlanMa
 * @createdate 2016年5月9日
 * @version 1.0
 * @description :生效标识
 */
public enum VALIDFlag {

	INVALID("0", "无效"),

	VALID("1", "有效");

	private String value;
	private final String displayName;

	VALIDFlag(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public static VALIDFlag parseOf(String value) {

		for (VALIDFlag item : values())
			if (item.getValue().equals(value))
				return item;

		return null;
	}
}
