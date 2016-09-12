package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :收益完成状态
 */
public enum IncomeIsFinish {

	NOTFINISH( "0", "未完成" ),
	
	FINISH( "1", "已完成" );
	
	private String value;
	private final String displayName;
	
	IncomeIsFinish( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static IncomeIsFinish parseOf( String value ){
		
		for ( IncomeIsFinish item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
