package com.nbl.service.business.constant;

import com.nbl.common.constants.ConstantEnum;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :数据平台来源
 */
public enum RetreatSource  implements ConstantEnum {

	CUSTOMER("01", "客户"),
	PLATFORM("12", "平台");
	
	private String value;
	private final String displayName;
	
	RetreatSource( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static RetreatSource parseOf( String value ){
		
		for ( RetreatSource item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
