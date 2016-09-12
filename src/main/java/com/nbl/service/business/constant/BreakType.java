package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :违约类型枚举
 */
public enum BreakType {

	FINANCEREPAY( "01", "融资人还款" ),
	
	ASSETREPAY( "02", "资产管理人还款" ),
	
	GUARANTEEREPAY ("03", "担保人还款");
	
	private String value;
	private final String displayName;
	
	BreakType( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static BreakType parseOf( String value ){
		
		for ( BreakType item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
