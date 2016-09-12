package com.nbl.service.business.constant;

/**
 * @author AlanMa
 * @createdate 2016年5月9日
 * @version 1.0
 * @description :设置密码类型
 */
public enum SessionKeys {
	
	USER_INFO("userInfo", "用户信息缓存"),
	CERT_CODE_PHO("certCodePhone", "获取验证码的手机号"),
	MSG_CERT_CODE("msgCertCode", "短信校验码"),
	TOKEN_CASE("tokenCase", "短信校验码"),
	PIC_CERT_CODE("picCertCode", "图片校验码");

	private String value;
	private final String displayName;

	SessionKeys(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public static SessionKeys parseOf(String value) {

		for (SessionKeys item : values())
			if (item.getValue().equals(value))
				return item;

		return null;
	}
}
