package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :对账最终状态
 */
public enum LaCheckStatus {
	
	FAILURE( "00", "不平账" ),
	
	SUCCESS( "01", "平账" );
	
	private String value;
	private final String displayName;
	
	LaCheckStatus( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static LaCheckStatus parseOf( String value ){
		
		for ( LaCheckStatus item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}


}
