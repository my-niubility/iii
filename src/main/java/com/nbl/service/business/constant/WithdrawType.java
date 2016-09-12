package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :提现类型
 */
public enum WithdrawType {

	GENERAL( "01", "普通提现" ),
	
	QUICK( "02", "快速提现" );
	
	private String value;
	private final String displayName;
	
	WithdrawType( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static WithdrawType parseOf( String value ){
		
		for ( WithdrawType item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
