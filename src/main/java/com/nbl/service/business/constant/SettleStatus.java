package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :
 */
public enum SettleStatus {
	
    SUCCESS("00","成功"),
    FAILURE("01","失败"),
    INIT("02", "初始"),
    ACCEPTED("03", "受理成功"),
    ACCEPTED_FAILURE("04", "受理失败"),
    CHECK_CONSISTENCY("05", "核对一致"),
    CHECK_INCONSISTENCY("06", "核对不一致"),
    WITHHOLD_SUCCESS("07", "扣款成功"),
    WITHHOLD_FAILURE("09", "扣款失败"),
    ;
    
	private String value;
	private final String displayName;
	
	
	
	public String getValue() {
		return value;
	}


	public String getDisplayName() {
		return displayName;
	}


	SettleStatus(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
	
	
	public static SettleStatus parseOf(String value) {
		for (SettleStatus item : values())
			if (item.getValue().equals(value))
				return item;
		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}
}
