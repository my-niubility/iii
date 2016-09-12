package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :审核状态
 */
public enum BreakStatus {

	INITIAL( "00", "初始状态" ),
	
	AUDITCONFIRM( "01", "审核确认" ),
	
	AUDITDELETE ("02", "审核删除");
	
	private String value;
	private final String displayName;
	
	BreakStatus( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static BreakStatus parseOf( String value ){
		
		for ( BreakStatus item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
