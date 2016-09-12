package com.nbl.service.business.constant;

/**
 * @author AlanMa
 * @createdate 2016年5月9日
 * @version 1.0
 * @description :注册类型
 */
public enum RegisteredType {

	GATEWAY("GATEWAY", "网关"),

	PROTAL("PROTAL", "门户");

	private String value;
	private final String displayName;

	RegisteredType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public static RegisteredType parseOf(String value) {

		for (RegisteredType item : values())
			if (item.getValue().equals(value))
				return item;

		return null;
	}
}
