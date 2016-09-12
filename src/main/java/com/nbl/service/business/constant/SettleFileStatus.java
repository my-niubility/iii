package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :结算成功状态
 */
public enum SettleFileStatus {

	SETTLE_FILE_STATUS_00( "00", "成功 " ),
	
	SETTLE_FILE_STATUS_01( "01", "失败");

	private String value;
	private final String displayName;
	
	SettleFileStatus( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static SettleFileStatus parseOf( String value ){
		
		for ( SettleFileStatus item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
