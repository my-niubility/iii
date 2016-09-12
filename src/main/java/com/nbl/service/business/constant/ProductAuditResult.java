package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :产品审核状态
 */
public enum ProductAuditResult {

	PASSED( "pass", "审核通过" ),
	
	NOTPASSED("noPass", "审核不通过" );
	
	
	private String value;
	private final String displayName;
	
	ProductAuditResult( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static ProductAuditResult parseOf( String value ){
		
		for ( ProductAuditResult item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
