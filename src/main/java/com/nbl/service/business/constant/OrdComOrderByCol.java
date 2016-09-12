package com.nbl.service.business.constant;

/**
 * @author AlanMa
 * @createdate 2016年5月9日
 * @version 1.0
 * @description :充值查询排序字段
 */
public enum OrdComOrderByCol {

	ID("1", "订单号"), CREATE_TIME("2", "创建时间"), AMT("3", "金额");

	private String value;
	private final String displayName;

	OrdComOrderByCol(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public static OrdComOrderByCol parseOf(String value) {

		for (OrdComOrderByCol item : values())
			if (item.getValue().equals(value))
				return item;

		return null;
	}
}
