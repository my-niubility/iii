package com.nbl.service.business.constant;


/**
 * 验证码场景(需要custId)
 * @author AlanMa
 *
 */
public enum CertBusCaseCI {
	
	CERT("02", "实名认证"),
	CARD("03", "绑卡"),
	RECH("04", "充值"),
	WITH("05", "提现"),
	RPAYP("06", "重置支付密码");

	private String value;
	private final String displayName;
	
	CertBusCaseCI( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static CertBusCaseCI parseOf( String value ){
		
		for ( CertBusCaseCI item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
