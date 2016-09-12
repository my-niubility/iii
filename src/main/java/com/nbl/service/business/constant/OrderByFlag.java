package com.nbl.service.business.constant;

/**
 * @author AlanMa
 * @createdate 2016年5月9日
 * @version 1.0
 * @description :充值查询排序字段
 */
public enum OrderByFlag {

	ASC("1", "升序"), DESC("0", "降序");

	private String value;
	private final String displayName;

	OrderByFlag(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public static OrderByFlag parseOf(String value) {

		for (OrderByFlag item : values())
			if (item.getValue().equals(value))
				return item;

		return null;
	}
}
