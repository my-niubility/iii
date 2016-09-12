package com.nbl.service.user.constant;
/**
 * @author gcs
 * @createdate 2016年8月3日	
 * @version 1.0
 * 渠道类型
 */

public enum ChannelType {
	
	UNIONPAY("01","银联"),DIRECT("02","直连");
	
	private String value;
	private final String displayName;
	
	ChannelType(String value, String displayName) {
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

	public static ChannelType parseOf( String value ){
		
		for ( ChannelType item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
	
	
	
	
}
