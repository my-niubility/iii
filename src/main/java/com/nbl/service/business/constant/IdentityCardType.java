package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :身份证类型
 */
public enum IdentityCardType {
	
	SECOND_GENERATION_IDCARD("00","二代身份证"),
	TEMPORARY_IDCARD("01","临时身份证");
	
	private String value;
	private final String displayName;
	
	IdentityCardType( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}
	
	public static IdentityCardType parseOf( String value ){
		
		for ( IdentityCardType item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public String getDisplayName() {
		return displayName;
	}
}
