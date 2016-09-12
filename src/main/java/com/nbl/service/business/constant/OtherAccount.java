package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :其他应付款类型
 */
public enum OtherAccount {
	
	OTHER_CUST_ID_001 ("CI99999999","互联网金融业务其他应付账户"),
	;
	
	private String value;
	private final String displayName;
	
	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	private OtherAccount(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}


}
