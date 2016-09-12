package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :产品还款类型
 */
public enum ProductRepayType {

	ASSET( "01", "资管人还款" ),
	
	FINANCE( "02", "融资人还款" ),
	
	GUARANTEE("03", "担保人还款");
	
	private String value;
	private final String displayName;
	
	ProductRepayType( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static ProductRepayType parseOf( String value ){
		
		for ( ProductRepayType item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
