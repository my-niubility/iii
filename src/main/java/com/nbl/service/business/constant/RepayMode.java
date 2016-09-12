package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :利率偿还方式
 */
public enum RepayMode {

	EQUALINTEREST( "0", "等额本息还款" ),
	
	ONCE( "1", "一次还本付息" ),
	EQUALCAPITAL("2","等额本金"),
	MONTHINTERESTCAPITAL("3","每月还息到期还本"),
	MODEPERIODREPAYREALDAY("4","每月还息到期还本(天)");
	private String value;
	private final String displayName;
	
	RepayMode( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static RepayMode parseOf( String value ){
		
		for ( RepayMode item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
	
}
