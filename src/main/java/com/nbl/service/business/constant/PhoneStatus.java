package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0
 * @description :手机是否可用
 */
public enum PhoneStatus {

	USABLE((short) 1, "可用 "),

	UNUSABLE((short) 0, "不可用");

	private Short value;
	private final String displayName;

	PhoneStatus(Short value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	public Short getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public static PhoneStatus parseOf(String value) {

		for (PhoneStatus item : values())
			if (item.getValue().equals(value))
				return item;

		return null;
	}
}
