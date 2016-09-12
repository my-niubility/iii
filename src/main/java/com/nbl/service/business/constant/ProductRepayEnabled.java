package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :产品还款有效标识
 */
public enum ProductRepayEnabled {

	INVALID((short) 0, "无效" ),
	
	VALID((short) 1, "有效" );
	
	private Short value;
	private final String displayName;
	
	ProductRepayEnabled(Short value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public Short getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static ProductRepayEnabled parseOf(Short value ){
		
		for ( ProductRepayEnabled item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
