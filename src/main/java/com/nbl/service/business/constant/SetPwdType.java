package com.nbl.service.business.constant;
/**
 * @author AlanMa
 * @createdate 2016年5月9日
 * @version 1.0
 * @description :设置密码类型
 */
public enum SetPwdType {
	SET_PAY_PWD("1", "设置交易密码 "),

	MOD_PAY_PWD("2", "修改交易密码"),

	SET_NEW_PAY_PWD("3", "设置新交易密码（忘记密码）");

	private String value;
	private final String displayName;

	SetPwdType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public static SetPwdType parseOf(String value) {

		for (SetPwdType item : values())
			if (item.getValue().equals(value))
				return item;

		return null;
	}
}
