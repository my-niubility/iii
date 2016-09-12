package com.nbl.service.business.constant;
/**
 * @author gcs
 * @createdate 2016年8月18日	
 * @version 1.0
 * 审核类型
 */

public enum ProductAuditType {
	
	RELEASE_AUDIT("01","发布审核"),
	
	RAISE_AUDIT("02","募集审核");
	
	private String value;
	private final String displayName;
	
	ProductAuditType( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static ProductAuditType parseOf( String value ){
		
		for ( ProductAuditType item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
