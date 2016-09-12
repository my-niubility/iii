package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :支付状态
 */
public enum PaymentStatus {
	
	WAING( "00", "等待支付" ),
	
	SUCCESSFUL( "01", "支付成功" ),
	
	FAILURE("02", "支付失败"),
	
	OBOSLETE("03", "支付作废");

	private String value;
	private final String displayName;
	
	PaymentStatus( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static PaymentStatus parseOf( String value ){
		
		for ( PaymentStatus item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}

	
}
