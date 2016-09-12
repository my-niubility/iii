package com.nbl.service.business.constant;

/**
 * @author AlanMa
 * @createdate 2016年5月9日
 * @version 1.0
 * @description :充值类型
 */
public enum RechargeType {
	E_BANK("00", "网银充值"),

	SHORTCUT("01", "快捷充值"),

	OFFLINE("02", "线下转账");
	
	private String value;
	private final String displayName;

	RechargeType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public static RechargeType parseOf(String value) {

		for (RechargeType item : values())
			if (item.getValue().equals(value))
				return item;

		return null;
	}
}
