package com.nbl.service.business.constant;


/**
 * 验证码场景
 * @author AlanMa
 *
 */
public enum CertBusCase {
	
	REG("01", "用户注册"), 
	CERT("02", "实名认证"),
	CARD("03", "绑卡"),
	RECH("04", "充值"),
	WITH("05", "提现"),
	RPAYP("06", "重置支付密码"),
	RLOGP("07", "重置登陆密码"),
	QUICP("08", "快捷支付"),
	BALAP("09", "余额支付");

	private String value;
	private final String displayName;
	
	CertBusCase( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static CertBusCase parseOf( String value ){
		
		for ( CertBusCase item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
