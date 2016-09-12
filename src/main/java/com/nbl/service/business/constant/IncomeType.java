package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :收益类型
 */
public enum IncomeType {

	INVEST( "00", "投资 " ),
	
	TRANSFER_OUT( "01", "转出"),
	
	TRANSFER ("02", "协议转让"),

	COLLECT_TERM_INTEREST("03", "募集期利息");

	private String value;
	private final String displayName;
	
	IncomeType( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static IncomeType parseOf( String value ){
		
		for ( IncomeType item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
