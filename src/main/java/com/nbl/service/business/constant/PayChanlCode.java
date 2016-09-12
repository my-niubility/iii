package com.nbl.service.business.constant;

/**
 * @author AlanMa
 * @createdate 2016年5月9日
 * @version 1.0
 * @description :支付渠道编码
 */
public enum PayChanlCode {

	ZLZB("1","证联资本");

	private String value;
	private final String displayName;

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	private PayChanlCode(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
}
