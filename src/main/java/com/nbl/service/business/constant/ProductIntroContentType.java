package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :项目简介内容类型枚举
 */
public enum ProductIntroContentType {

	TEXT( "00", "文本" ),
	
	FILE( "01", "文件" );


	private String value;
	private final String displayName;
	
	ProductIntroContentType( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static ProductIntroContentType parseOf( String value ){
		
		for ( ProductIntroContentType item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
