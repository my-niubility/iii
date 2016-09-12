package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0
 * @description :结算款到账标识
 */
public enum AccountFlag {

	ACCOUNT_FLAG_00("00", "未到 "),

	ACCOUNT_FLAG_02("02", "结算中 "),

	ACCOUNT_FLAG_01("01", "到账");

	private String value;
	private final String displayName;

	AccountFlag(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public static AccountFlag parseOf(String value) {

		for (AccountFlag item : values())
			if (item.getValue().equals(value))
				return item;

		return null;
	}
}
