package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :产品类型
 */
public enum ProductLittleType {
	
    MONEY( "201", "货币型基金 " ),
	
	BOND( "202", "债券型基金"),
	
	STOCK("203", "股票型基金"),
	
	FINANCIAL("204", "理财型基金");

	private String value;
	private final String displayName;
	
	ProductLittleType( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static ProductLittleType parseOf( String value ){
		
		for ( ProductLittleType item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}

}
