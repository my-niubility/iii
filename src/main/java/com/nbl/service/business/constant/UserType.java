package com.nbl.service.business.constant;

/**
 * @author Alan
 * @createdate 2016年5月19日
 * @version 1.0
 * @description :协议类型
 */
public enum UserType {

	PERSONAL("CP", "个人"),
	BUSINESS("CB", "企业");

	private String value;
	private final String displayName;

	UserType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public static UserType parseOf(String value) {

		for (UserType item : values())
			if (item.getValue().equals(value))
				return item;

		return null;
	}
}
