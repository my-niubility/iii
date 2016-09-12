package com.nbl.service.business.constant;

/**
 * @author AlanMa
 * @createdate 2016年5月9日
 * @version 1.0
 * @description :认证状态
 */
public enum YearDay {

	SLL("360", "360"),
	SLW("365", "365");

	private String value;
	private final String displayName;

	YearDay(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public static YearDay parseOf(String value) {

		for (YearDay item : values())
			if (item.getValue().equals(value))
				return item;

		return null;
	}
}
