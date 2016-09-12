package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0
 * @description :持仓账户类型
 */
public enum PositionCustType {

	ASSET("00", "资管"),

	MIDDLE("02", "其他应付"),

	INVENST("01", "投资");

	private String value;
	private final String displayName;

	PositionCustType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public static PositionCustType parseOf(String value) {

		for (PositionCustType item : values())
			if (item.getValue().equals(value))
				return item;

		return null;
	}
}
