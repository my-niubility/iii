package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :对账步骤枚举类
 */
public enum CheckStep {

	YUCHULI( "00", "对账预处理" ),
	
	DOWNCHECKFILE( "01", "下载对账文件" ),
	
	ZHNGHUGOUDUI("03", "账户勾兑中"),
	
	CHACUOCHULI("04", "差错处理中"),
	DUIZHANGWANC("05", "对账完成");
	
	private String value;
	private final String displayName;
	
	CheckStep( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static CheckStep parseOf( String value ){
		
		for ( CheckStep item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
