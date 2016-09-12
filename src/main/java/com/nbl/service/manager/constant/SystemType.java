package com.nbl.service.manager.constant;

public enum SystemType {
	
	MANAGER("MM","管理平台" ),
	PORTAL("PP","门户系统");

	private String value;
	private final String displayName;
	
	SystemType( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}
	
	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static SystemType parseOf( String value ){
		for ( SystemType item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		return null;
	}
}
