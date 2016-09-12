package com.nbl.service.business.constant;

import com.nbl.service.user.constant.CardType;

/**
 * @author gcs
 * @createdate 2016年8月4日	
 * @version 1.0
 * 黑白名单业务类型
 */

public enum BwFirmType {
	TYPE_1("1","基金"),
	TYPE_2("2","信托");
	
	private String value;
	private final String displayName;
	
	BwFirmType( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static BwFirmType parseOf( String value ){
		
		for ( BwFirmType item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
