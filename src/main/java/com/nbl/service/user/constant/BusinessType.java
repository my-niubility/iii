package com.nbl.service.user.constant;

/**
 * @author gcs
 * @createdate 2016年8月3日	
 * @version 1.0
 * 交易类型枚举类
 */

public enum BusinessType {
	RECHARGE("01","充值"), DRAW("02","提现"),PAY("03","支付");

	private String value;
	private final String displayName;
	
	BusinessType( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static BusinessType parseOf( String value ){
		
		for ( BusinessType item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
	
}
