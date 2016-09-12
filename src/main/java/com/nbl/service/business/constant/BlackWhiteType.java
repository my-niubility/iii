package com.nbl.service.business.constant;
/**
 * @author gcs
 * @createdate 2016年8月4日	
 * @version 1.0
 * 黑白名单类型
 */

public enum BlackWhiteType {
	
	BLACK("BLACK","黑名单"),
	WHITE("WHITE","白名单");
	
	private String value;
	private final String displayName;
	BlackWhiteType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getDisplayName() {
		return displayName;
	}
	public static BlackWhiteType parseOf(String value) {

		for (BlackWhiteType item : values())
			if (item.getValue().equals(value))
				return item;

		return null;
	}
}
