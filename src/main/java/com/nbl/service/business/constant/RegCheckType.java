package com.nbl.service.business.constant;

/**
 * @author AlanMa
 * @createdate 2016年5月9日
 * @version 1.0
 */
public enum RegCheckType {
	IS_REGISTED("1", "手机号是否已注册");

	private String value;
	private final String displayName;

	RegCheckType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public static RegCheckType parseOf(String value) {

		for (RegCheckType item : values())
			if (item.getValue().equals(value))
				return item;

		return null;
	}
}
