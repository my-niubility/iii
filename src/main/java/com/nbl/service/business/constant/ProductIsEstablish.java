package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :项目是否成立枚举
 */
public enum ProductIsEstablish {

	ESTABLISH( "01", "成立" ),
	
	NOTESTABLISH( "00", "没有成立" );


	private String value;
	private final String displayName;
	
	ProductIsEstablish( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static ProductIsEstablish parseOf( String value ){
		
		for ( ProductIsEstablish item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
