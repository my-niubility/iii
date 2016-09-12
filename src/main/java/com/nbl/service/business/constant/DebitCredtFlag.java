package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :借贷标识
 */
public enum DebitCredtFlag {

	FLAG_DR( "DR", "借 " ),
	
	FLAG_CR( "CR", "贷");
	
	private String value;
	private final String displayName;
	
	DebitCredtFlag( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static DebitCredtFlag parseOf( String value ){
		
		for ( DebitCredtFlag item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
