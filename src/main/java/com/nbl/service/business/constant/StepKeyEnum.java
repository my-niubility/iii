package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :业务步骤代码枚举类
 */
public enum StepKeyEnum {
	
	INVEST_PURCHASE_REQ("INVEST_PURCHASE_REQ", "投资购买申请"),
	INVEST_PURCHASE_SUC("INVEST_PURCHASE_SUC", "投资购买成功"),
	INVEST_PURCHASE_FAI("INVEST_PURCHASE_FAI", "投资购买失败"),
	INVEST_REFUND_REQ("INVEST_REFUND_REQ", "投资退款申请"),
	INVEST_REFUND_SUC("INVEST_REFUND_SUC", "投资退款成功"),
	INVEST_REPAY_REQ("INVEST_REPAY_REQ", "投资还款申请"),
	INVEST_REPAY_SUC("INVEST_REPAY_SUC", "投资还款成功"),
	;
	
	private String value;
	private final String displayName;
	
	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	private StepKeyEnum(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

}
