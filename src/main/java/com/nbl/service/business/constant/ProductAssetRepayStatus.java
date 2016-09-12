package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :产品投资还款状态
 */
public enum ProductAssetRepayStatus {

	INITIAL( "00", "未支付" ),
	
	PAYING( "01", "支付中 " ),
	
	FINISH ("02", "支付完成");
	
	
	private String value;
	private final String displayName;
	
	ProductAssetRepayStatus( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static ProductAssetRepayStatus parseOf( String value ){
		
		for ( ProductAssetRepayStatus item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
