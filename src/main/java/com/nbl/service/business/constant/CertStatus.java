package com.nbl.service.business.constant;

/**
 * @author AlanMa
 * @createdate 2016年5月9日
 * @version 1.0
 * @description :认证状态
 */
public enum CertStatus {
	NEW("0", "未认证 "),

	PASSED("1", "已认证通过"),

	CERTING("2", "认证中"),

	NOT_PASSED("3", "未认证通过");

	private String value;
	private final String displayName;

	CertStatus(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public static CertStatus parseOf(String value) {

		for (CertStatus item : values())
			if (item.getValue().equals(value))
				return item;

		return null;
	}
}
