package com.nbl.service.business.constant;
/**
 * @author gcs
 * @createdate 2016年8月19日	
 * @version 1.0
 * 募集完结审核判断是否通过
 */

public enum EstablishCondition {
	
	OFFLINE("0","下线"),
	
	PROPORION("1","比例");
	
	private String value;
	private final String displayName;

	EstablishCondition(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public static EstablishCondition parseOf(String value) {

		for (EstablishCondition item : values())
			if (item.getValue().equals(value))
				return item;

		return null;
	}
}
