package com.nbl.service.business.constant;

/**
 * @author AlanMa
 * @createdate 2016年5月9日
 * @version 1.0
 * @description :代扣协议签约标识
 */
public enum ProtocolFlag {

	WITHOUT_WH_AGRT("0", "没签代扣协议"),

	WITH_WH_AGRT("1", "签代扣协议");

	private String value;
	private final String displayName;

	ProtocolFlag(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public static ProtocolFlag parseOf(String value) {

		for (ProtocolFlag item : values())
			if (item.getValue().equals(value))
				return item;

		return null;
	}
}
