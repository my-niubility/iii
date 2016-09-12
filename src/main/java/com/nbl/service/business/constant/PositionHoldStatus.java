package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :账户持仓状态
 */
public enum PositionHoldStatus {

	HOLD( "00", "持有" ),
	
	TRANSFERING( "01", "转让中" ),
	
	TRANSFERINGWAITING( "02", "转让等待中" ),
	
	ALREADYTRANSFER( "03", "已转让" ),
	
	ALREADYREFUND( "04", "已退款" ),
	
	ALREADYREPAYMENT( "05", "已还款" ),
	
	ONTHEWAY("06", "持仓在途"),
	
	WAITINGREFUND("07", "待退款");

	private String value;
	private final String displayName;
	
	
	PositionHoldStatus( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static PositionHoldStatus parseOf( String value ){
		
		for ( PositionHoldStatus item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
