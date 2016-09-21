package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :货架内产品状态（上架、下架）
 */
public enum ProductShelfStatus {
	
	PRODUCT_SHELF_STATUS0( "0", "下架" ),
	
	PRODUCT_SHELF_STATUS1( "1", "展示" );
	
	private String value;
	private final String displayName;
	
	ProductShelfStatus( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	

	public static ProductShelfStatus parseOf( String value ){
		
		for ( ProductShelfStatus item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}

}
