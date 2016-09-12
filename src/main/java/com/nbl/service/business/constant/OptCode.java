package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :记账业务类型
 */
public enum OptCode {
	
	
	OPT_CODE_101("101", "投资购买申请"),
	OPT_CODE_102("102", "投资购买成功"),
	OPT_CODE_103("103", "投资购买失败"),
	OPT_CODE_104("104", "基金申购请求"),
	OPT_CODE_105("105", "基金申购成功"),
	OPT_CODE_106("106", "基金申购失败"),
	OPT_CODE_107("107", "投资退款申请"),
	OPT_CODE_108("108", "投资退款成功"),
	OPT_CODE_109("109", "基金赎回申请"),
	OPT_CODE_110("110", "基金赎回成功"),
	OPT_CODE_111("111", "投资还款申请"),
	OPT_CODE_112("112", "投资还款成功"),
	;
	
	private String value;
	private final String displayName;
	
	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	private OptCode(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

}
