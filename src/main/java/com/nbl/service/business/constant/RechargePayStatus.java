package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :充值状态
 */
public enum RechargePayStatus {

	
	SUCCESS("1", "充值成功"),
	HANDLING("2", "处理中"),
	FAIL("3", "充值失败"),
	SUCCESS_OFFLINE("4", "受理成功（用于线下转账）"),
	CALLBACK_HANDLING("5", "处理中"),
	FAIL_REVERSE("6", "充值失败,已冲正"),
	FAIL_ADDITIONAL("7", "充值失败,已补录");
	
	private String value;
	private final String displayName;
	
	RechargePayStatus( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static RechargePayStatus parseOf( String value ){
		
		for ( RechargePayStatus item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println(RechargePayStatus.parseOf("y"));
	}
}
