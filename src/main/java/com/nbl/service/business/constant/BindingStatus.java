package com.nbl.service.business.constant;

/**
 * @author AlanMa
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :绑卡状态
 */
public enum BindingStatus {

	BIND( "0", "绑卡" ),
	
	UN_BIND( "1", "解绑" ),
	
	FAIL_BIND( "2", "绑定失败");
	
	private String value;
	private final String displayName;
	
	BindingStatus( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static BindingStatus parseOf( String value ){
		
		for ( BindingStatus item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
