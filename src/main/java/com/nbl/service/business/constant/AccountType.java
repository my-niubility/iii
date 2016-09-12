package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :记账类型
 */
public enum AccountType {

	ACCOUNT_TYPE_00( "00", "业务记账 " ),
	
	ACCOUNT_TYPE_01( "01", "其他");
	
	private String value;
	private final String displayName;
	
	AccountType( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static AccountType parseOf( String value ){
		
		for ( AccountType item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
