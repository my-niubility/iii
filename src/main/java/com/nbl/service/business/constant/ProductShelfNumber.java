package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年7月29日
 * @version 1.0 
 * @description :产品货架编号
 */
public enum ProductShelfNumber {
	
    PRODUCT_SHELF01( "shelf1", "货架编号1" ),
	
    PRODUCT_SHELF02( "shelf2", "货架编号2" ),
	
    PRODUCT_SHELF03( "shelf3", "货架编号3" ),
	
    PRODUCT_SHELF04( "shelf4", "货架编号4" ),
	
    PRODUCT_SHELF05( "shelf5", "货架编号5" ),
	
    PRODUCT_SHELF06( "shelf6", "货架编号6" ),
    
    PRODUCT_SHELF07( "shelf7", "货架编号7" ),
    
    SHELF01( "01", "货架编号1" ),
	
    SHELF02( "02", "货架编号2" ),
	
    SHELF03( "03", "货架编号3" ),
	
    SHELF04( "04", "货架编号4" ),
	
    SHELF05( "05", "货架编号5" ),
	
    SHELF06( "06", "货架编号6" ),
    
    SHELF07( "07", "货架编号7" );

	private String value;
	private final String displayName;
	
	ProductShelfNumber( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static ProductShelfNumber parseOf( String value ){
		
		for ( ProductShelfNumber item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}

}
