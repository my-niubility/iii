package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :产品类型
 */
public enum ProductType {
	
    SOLAR( "000", "光伏 " ),
	
	ELECT( "001", "电能"),
	
	FUND("002", "基金"),
	
	TRUST("003", "信托"),
	
	ALLFUND("004", "众筹"),
	
	STANDARD("005", "标准");

	private String value;
	private final String displayName;
	
	ProductType( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static ProductType parseOf( String value ){
		
		for ( ProductType item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}

}
