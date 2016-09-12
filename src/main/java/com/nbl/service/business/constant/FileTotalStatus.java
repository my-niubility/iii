package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :上传状态
 */
public enum FileTotalStatus {

	FILE_TOTAL_STATUS_00( "00", "初始 " ),
	
	FILE_TOTAL_STATUS_01( "01", "上传成功"),
	
	FILE_TOTAL_STATUS_02 ("02", "上传失败"),

	FILE_TOTAL_STATUS_03 ("03", "受理成功"),

	FILE_TOTAL_STATUS_04 ("04", "受理失败");
	

	private String value;
	private final String displayName;
	
	FileTotalStatus( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static FileTotalStatus parseOf( String value ){
		
		for ( FileTotalStatus item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
