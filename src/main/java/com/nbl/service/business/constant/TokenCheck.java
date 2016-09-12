package com.nbl.service.business.constant;

/**
 * @author AlanMa
 * @createdate 2016年5月9日
 * @version 1.0
 * @description :认证状态
 */
public enum TokenCheck {
	SUCCESS("1", "成功"), REPEAT("2", "重复请求"), FAIL("3", "校验失败"), EXCEPTION("4", "异常");

	private String value;
	private final String displayName;

	TokenCheck(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public static TokenCheck parseOf(String value) {

		for (TokenCheck item : values())
			if (item.getValue().equals(value))
				return item;

		return null;
	}
}
