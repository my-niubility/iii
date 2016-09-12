package com.nbl.service.user.constant;
/**
 * @author gcs
 * @createdate 2016年8月3日	
 * @version 1.0
 * 银行卡类别
 */

public enum CardType {
	
	DEBIT("1","借记卡"),CREDIT("2","贷记卡");

	private String value;
	private final String displayName;
	
	CardType( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static CardType parseOf( String value ){
		
		for ( CardType item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
	
}
