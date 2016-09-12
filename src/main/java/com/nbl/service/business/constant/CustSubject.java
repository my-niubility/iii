package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :二级科目
 */
public enum CustSubject {
	
	//客户份额
	BEIFUJIN( "2011", "投资者持有的份额" ),

	HLWJR_BEIFUJIN( "2011101", "互联网金融业务备付金" ),

	FUND_BEIFUJIN( "2011201", "基金业务备付金" ),
	

	//中间账户
	PAYABLES("2241","其他应付款"),
	
	HLWJR_PAYABLES( "2241101", "互联网金融业务其他应付款" ),

	FUND_PAYABLES( "2241201", "基金业务其他应付款" ),
	
	
	//资管人份额
	CCY_DEP( "1002", "资管人持有的份额" ),
	
	HLWJR_CCY_DEP( "1002100", "互联网金融业务资产" ),
	
	FUND_CCY_DEP( "1002200", "基金业务资产" ),
	
	;
	
	private String value;
	private final String displayName;
	
	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	private CustSubject(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
	
	

}
