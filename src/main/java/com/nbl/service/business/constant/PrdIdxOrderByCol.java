package com.nbl.service.business.constant;

/**
 * @author AlanMa
 * @createdate 2016年5月9日
 * @version 1.0
 * @description :充值查询排序字段
 */
public enum PrdIdxOrderByCol {

	CREATE_TIME("1", "创建时间"), EXPECT_EARN_RATE("2", "年化收益率"), UNIT_COST("3", "产品单价"), HOLD_PERIOD("4", "可持有天数");

	private String value;
	private final String displayName;

	PrdIdxOrderByCol(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public static PrdIdxOrderByCol parseOf(String value) {

		for (PrdIdxOrderByCol item : values())
			if (item.getValue().equals(value))
				return item;

		return null;
	}
}
