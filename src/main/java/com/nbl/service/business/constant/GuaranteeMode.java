package com.nbl.service.business.constant;


public enum GuaranteeMode {

	COMPANY( "0", "担保公司" ),
	
	GUARANTY( "1", "抵押" ),
	
	PLEDGE( "2", "质押" );

	private String value;
	private final String displayName;
	
	
	GuaranteeMode( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static GuaranteeMode parseOf( String value ){
		
		for ( GuaranteeMode item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
