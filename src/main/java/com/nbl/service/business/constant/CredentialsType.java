package com.nbl.service.business.constant;

/**
 * @author Alan
 * @createdate 2016年5月19日
 * @version 1.0
 * @description :证件类型
 */
public enum CredentialsType {

	ID("P01", "居民身份证"),
	MILITARY("P04", "军人证"),
	PASSPORT("P31", "护照"),
	BL("C01", "营业执照"),
	OC("C09", "组织机构代码证");

	private String value;
	private final String displayName;

	CredentialsType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public static CredentialsType parseOf(String value) {

		for (CredentialsType item : values())
			if (item.getValue().equals(value))
				return item;

		return null;
	}
	
}
