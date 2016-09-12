package com.nbl.service.business.constant;


/**
 * 验证码场景（需要tradeOrderId)
 * @author AlanMa
 *
 */
public enum CertBusCaseTO {
	
	QUICP("08", "快捷支付"),
	BALAP("09", "余额支付");

	private String value;
	private final String displayName;
	
	CertBusCaseTO( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static CertBusCaseTO parseOf( String value ){
		
		for ( CertBusCaseTO item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
