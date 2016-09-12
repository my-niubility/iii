package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :
 */
public enum FundsStatus {

	FINISH( "01", "完成" ),
	
	INITIAL( "02", "初始状态" );
	
	private String value;
	private final String displayName;
	
	FundsStatus( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static FundsStatus parseOf( String value ){
		
		for ( FundsStatus item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
