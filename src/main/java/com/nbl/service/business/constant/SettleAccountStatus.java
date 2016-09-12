package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :结算到账状态
 */
public enum SettleAccountStatus {
	
	NOACCOUNT("00","未到"),
	ACCOUNTED("01","到账");
	
	String value;
	String displayName;
	
	SettleAccountStatus(String value,String displayName){
		this.value = value;
		this.displayName = displayName;
	}
	
	public static SettleAccountStatus parseOf(String value){
		for(SettleAccountStatus settleAccountStatus : values()){
			if(settleAccountStatus.getValue().equals(value)){
				return settleAccountStatus;
			}
		}
		throw new RuntimeException("value【"+value+"】不存在对应的枚举！");
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
}
