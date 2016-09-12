package com.nbl.service.business.constant;

/**
 * @author AlanMa
 * @createdate 2016年5月9日
 * @version 1.0
 * @description :账户状态
 */
public enum AccStatus {

	EFFECTIVE("EFFECTIVE", "有效的"),

	FROZEN("FROZEN", "冻结的");

	private String value;
	private final String displayName;

	AccStatus(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public static AccStatus parseOf(String value) {

		for (AccStatus item : values())
			if (item.getValue().equals(value))
				return item;

		return null;
	}
}
