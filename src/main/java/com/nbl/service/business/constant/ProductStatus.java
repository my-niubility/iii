package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :产品状态
 */
public enum ProductStatus {
	//01：发布待审核 02：待上架 03：募集中 04：募结待审核 05：待还款 06：待退款 07：发布撤销 08：审核失败 09：已结束 
	PRODUCT_STATUS01( "01", "发布待审核" ),
	
	PRODUCT_STATUS02( "02", "待上架" ),
	
	PRODUCT_STATUS03( "03", "募集中" ),
	
	PRODUCT_STATUS04( "04", "募结待审核" ),
	
	PRODUCT_STATUS05( "05", "待还款" ),
	
	PRODUCT_STATUS06( "06", "待退款" ),
	
	PRODUCT_STATUS07( "07", "发布撤销" ),
	
	PRODUCT_STATUS08( "08", "审核失败" ),
	
	PRODUCT_STATUS09( "09", "已结束" ),
	
	PRODUCT_STATUS10( "10", "募集中强制结束" );	

	private String value;
	private final String displayName;
	
	ProductStatus( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	

	public static ProductStatus parseOf( String value ){
		
		for ( ProductStatus item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}

}
