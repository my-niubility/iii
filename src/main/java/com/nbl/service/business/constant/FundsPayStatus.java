package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :
 */
public enum FundsPayStatus {

	FINISH( "01", "支付完成" ),
	
	PAYING( "02", "支付中" ),
	
	NONPAYMENT("03", "未支付");
	

	private String value;
	private final String displayName;
	
	FundsPayStatus( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static FundsPayStatus parseOf( String value ){
		
		for ( FundsPayStatus item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
