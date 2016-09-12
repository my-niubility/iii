package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :产品销售计量类型
 */
public enum ProductSaleType {
	
	PORTION( "01", "份额" ),
	
	AMOUNT( "02", "金额" );

	private String value;
	private final String displayName;
	
	ProductSaleType( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public static ProductSaleType parseOf( String value ){
		
		for ( ProductSaleType item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
	
	public String toString() {
		return this.getDisplayName();
	}
}
