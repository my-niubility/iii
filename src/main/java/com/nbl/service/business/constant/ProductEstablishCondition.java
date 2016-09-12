package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :产品成立标识
 */
public enum ProductEstablishCondition {

	BLOWLINE( "0", "下线" ),
	
	RATIO( "1", "比例" );


	private String value;
	private final String displayName;
	
	ProductEstablishCondition( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static ProductEstablishCondition parseOf( String value ){
		
		for ( ProductEstablishCondition item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
