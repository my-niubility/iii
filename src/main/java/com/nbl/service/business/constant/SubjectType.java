package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :资产负债标识
 */
public enum SubjectType {
	
	ASSETS("00","资产"),
	DEBT("01","负债");	
	
	private String value;
	private final String displayName;
	
	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	private SubjectType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
	

}
