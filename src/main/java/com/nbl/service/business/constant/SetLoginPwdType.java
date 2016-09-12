package com.nbl.service.business.constant;

/**
 * @author AlanMa
 * @createdate 2016年5月9日
 * @version 1.0
 * @description :设置密码类型
 */
public enum SetLoginPwdType {
	
	MOD_LOG_PWD("2", "修改登录密码 "),
	SET_NEW_LOG_PWD("3", "设置新登录密码（忘记密码）");

	private String value;
	private final String displayName;

	SetLoginPwdType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public static SetLoginPwdType parseOf(String value) {

		for (SetLoginPwdType item : values())
			if (item.getValue().equals(value))
				return item;

		return null;
	}
}
