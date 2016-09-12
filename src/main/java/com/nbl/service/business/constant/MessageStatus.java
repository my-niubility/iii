package com.nbl.service.business.constant;

/**
*@author:chenhongji
*@createdate：2016年8月22日 
*@version: 1.0 
*@description :消息已读未读标识
*/

public enum MessageStatus {
	
	INIT("0","初始"),
	DELETE("1","删除"),
	PRE_DELETE("2","预删除");
		
	
	private String value;
	private final String displayName;
	
	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	private MessageStatus(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
	
	public static MessageStatus parseOf(String value) {

		for (MessageStatus item : values())
			if (item.getValue().equals(value))
				return item;

		return null;
	}
}


