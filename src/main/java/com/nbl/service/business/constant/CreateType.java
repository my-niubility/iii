package com.nbl.service.business.constant;

/**
 * @author AlanMa
 * @createdate 2016年5月9日
 * @version 1.0
 * @description :认证状态
 */
public enum CreateType {
	PORTAL("1", "门户创建 "),

	MS("2", "认证中");

	private String value;
	private final String displayName;

	CreateType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public static CreateType parseOf(String value) {

		for (CreateType item : values())
			if (item.getValue().equals(value))
				return item;

		return null;
	}
}
