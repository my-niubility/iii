package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :对账状态
 */
public enum CheckStatus {

	FAILURE( "00", "对账失败" ),
	
	SUCCESS( "01", "对账成功" ),
	
	NOT("02", "未对账"),
	
	ING("03", "对账中"),
	
	NOT_BANLANCE("00", "不平账"),
	
	BANLANCE("01", "平账");
	
	private String value;
	private final String displayName;
	
	CheckStatus( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static CheckStatus parseOf( String value ){
		
		for ( CheckStatus item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
