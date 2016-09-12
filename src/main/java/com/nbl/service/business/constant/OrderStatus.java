package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :订单状态
 */
public enum OrderStatus {

	TO_PAY( "00", "等待付款" ),
	
	PAY_SUCCESS( "01", "支付成功" ),
	
	PAY_FAIL("02", "支付失败"),
	
	ORDER_CANCEL("03", "订单取消"),
	
	ORDER_HOLD("04", "处理中");

	private String value;
	private final String displayName;
	
	OrderStatus( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static OrderStatus parseOf( String value ){
		
		for ( OrderStatus item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println(OrderStatus.parseOf("01").getDisplayName());
	}
}
