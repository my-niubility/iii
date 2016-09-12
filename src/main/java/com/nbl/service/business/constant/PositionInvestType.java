package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :投资类别
 */
public enum PositionInvestType {

	INVEST( "00", "投资" ),
	
	ART_TRANS("01", "协议转让用于持仓人类型为投资");
	
	private String value;
	private final String displayName;
	
	PositionInvestType( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static PositionInvestType parseOf( String value ){
		
		for ( PositionInvestType item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
