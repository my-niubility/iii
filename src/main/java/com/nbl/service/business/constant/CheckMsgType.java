package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :对账不平的原因
 */
public enum CheckMsgType {
	
	ZTUN_ZLOK( "00", "直投未知证联成功" ),
	
	ZTNO_ZLOK( "01", "直投失败证联成功" ),
	
	ZTOK_ZLNO("02", "直投成功证联失败"),
	
	ZTUN_ZLNO("03", "直投未知证联失败"),
	
	AMOUTNOTSAME("04", "金额核对不一致"),
	
	ZTLITTLE_ZLMORE("05", "直投少证联多");

	private String value;
	private final String displayName;
	
	CheckMsgType( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static CheckMsgType parseOf( String value ){
		
		for ( CheckMsgType item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}

}
