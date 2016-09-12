package com.nbl.service.manager.constant;
/**
 * @author Donald
 * @createdate 2016年5月23日
 * @version 1.0 
 * @description :管理平台通用审核结果枚举类
 */
public enum AuditResultStatus {
	
	NEW("0","未审核"),
	AUDIT_FAILED("1","审核失败"),
	FIRST_AUDIT_PASSED("3","初审通过"),
	FIRST_AUDIT_REJECT("4","初审拒绝"),
	LAST_AUDIT_PASSED("5","终审通过"),
	LAST_AUDIT_REJECT("6","终审拒绝"),
	AUDIT_REJECT( "7","审核拒绝"),
	AUDIT_PASSED( "9","审核通过");
	
	private String value;
	
	private final String displayName;
	

	AuditResultStatus( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static AuditResultStatus parseOf( String value ){
		
		for ( AuditResultStatus item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
