package com.nbl.service.business.constant;

/**
 * @author AlanMa
 * @createdate 2016年5月9日
 * @version 1.0
 * @description :发送监管行
 */
public enum SendSB {

	NOT_SEND("0", "未发送"),

	SEND("1", "发送");

	private String value;
	private final String displayName;

	SendSB(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public static SendSB parseOf(String value) {

		for (SendSB item : values())
			if (item.getValue().equals(value))
				return item;

		return null;
	}
}
