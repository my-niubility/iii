package com.nbl.service.business.constant;

/**
 * @author AlanMa
 * @createdate 2016年5月9日
 * @version 1.0
 * @description :认证状态
 */
public enum RegChannelCode {
	
	PORTAL("001", "门户网站"),
	IOS("002", "iOS手机客户端"),
	ANDROID("003", "Android手机客户端"),
	WE_CHAT("004", "微信"),
	WEI_BO("005", "微博"),
	OTHER("006", "其他");

	private String value;
	private final String displayName;

	RegChannelCode(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public static RegChannelCode parseOf(String value) {

		for (RegChannelCode item : values())
			if (item.getValue().equals(value))
				return item;

		return null;
	}
}
