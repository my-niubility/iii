package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0
 * @description :产品前缀
 */
public enum ProductPrefix {

	PD_SOLAR("pd_solar", "光伏系列"),

	PD_ELE("pd_ele", "电能系列"),

	PD_TRUST("pd_trust", "信托系列"),

	PD_FUND("pd_fund", "基金系列"),

	PD_ALLFUND("pd_allfund", "众筹系列");

	private String value;
	private final String displayName;

	ProductPrefix(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public static ProductPrefix parseOf(String value) {

		for (ProductPrefix item : values())
			if (item.getValue().equals(value))
				return item;

		return null;
	}
}
