package com.nbl.service.business.constant;

/**
 * @author Alan
 * @createdate 2016年5月19日
 * @version 1.0 
 * @description :协议类型
 */
public enum AgrtType {

	REGISTE_AGRT( "1", "注册协议" );
	
	private String value;
	private final String displayName;
	
	AgrtType( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static AgrtType parseOf( String value ){
		
		for ( AgrtType item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
