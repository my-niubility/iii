package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :提现枚举类
 */
public enum WithdrawStatus {

	WAITING( "00", "处理中" ),
	
	SUCCESSFUL( "01", "提现成功" ),
	
	FAILURE ("02", "提现失败"),
	
	ACCEPTED("03", "已受理" );
	
	
	private String value;
	private final String displayName;
	
	WithdrawStatus( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static WithdrawStatus parseOf( String value ){
		
		for ( WithdrawStatus item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
