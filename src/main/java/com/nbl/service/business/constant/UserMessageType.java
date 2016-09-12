package com.nbl.service.business.constant;

/**
*@author:chenhongji
*@createdate：2016年8月22日 
*@version: 1.0 
*@description :消息类型标识
*/

public enum UserMessageType {
	
	SYSTEM("0","系统消息"),
	BUSINESS("1","业务消息");
		
	
	private String value;
	private final String displayName;
	
	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	private UserMessageType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
	
	public static UserMessageType parseOf(String value) {

		for (UserMessageType item : values())
			if (item.getValue().equals(value))
				return item;

		return null;
	}
}


