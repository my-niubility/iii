package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :
 */
public enum FileType {

	FILE_TYPE_00( "00", "投资 " ),
	
	FILE_TYPE_01( "01", "还款"),
	
	FILE_TYPE_02 ("02", "退款"),
	
	FILE_TYPE_03 ("03", "补贴")
	
	;

	private String value;
	private final String displayName;
	
	FileType( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static FileType parseOf( String value ){
		
		for ( FileType item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
