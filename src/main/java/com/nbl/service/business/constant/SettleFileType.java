package com.nbl.service.business.constant;


/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :结算文件类型枚举
 */
public enum SettleFileType {

	INVEST("00","投资"),
	REPAYMENT("01","还款"),
	REFUND("02","退款"),
	SUBSIDY("03","补贴"),
	;
	
	private String value;
	private final String displayName;
	
	SettleFileType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
	
	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	/**
	 * 枚举转换
	 */
	public static SettleFileType parseOf(String value) {
		for (SettleFileType item : values())
			if (item.getValue().equals(value))
				return item;
		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}
}
