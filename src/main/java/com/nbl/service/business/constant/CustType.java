package com.nbl.service.business.constant;

/**
 * @author AlanMa
 ** @createdate 2016年5月9日
 * @version 1.0
 * @description :账户类型
 */
public enum CustType {

	PERONAL("01", "个人客户 "),

	ENTERPRISE("02", "商户");

	private String value;
	private final String displayName;

	CustType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public static CustType parseOf(String value) {

		for (CustType item : values())
			if (item.getValue().equals(value))
				return item;

		return null;
	}

}
