package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :日、月标识
 */
public enum MonthDayFlag {

	MONTH( "00", "月" ),
	
	DAY( "01", "日" );
	
	private String value;
	private final String displayName;
	
	MonthDayFlag( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static MonthDayFlag parseOf( String value ){
		
		for ( MonthDayFlag item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
