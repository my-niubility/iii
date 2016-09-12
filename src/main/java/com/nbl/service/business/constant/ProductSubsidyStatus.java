package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :产品补贴发放状态
 */
public enum ProductSubsidyStatus {

	INITIAL( "00", "未支付" ),
	
	PAYING( "01", "支付中 " ),
	
	FINISH ("02", "支付成功");
	
	
	private String value;
	private final String displayName;
	
	ProductSubsidyStatus( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static ProductSubsidyStatus parseOf( String value ){
		
		for ( ProductSubsidyStatus item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
