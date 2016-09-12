package com.nbl.service.business.constant;

/**
*@author:chenhongji
*@createdate：2016年8月22日 
*@version: 1.0 
*@description :消息已读未读标识
*/

public enum MessageReadStatus {
	
	NOT_READ("0","未读"),
	READ("1","已读");
		
	
	private String value;
	private final String displayName;
	
	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	private MessageReadStatus(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
	
	public static MessageReadStatus parseOf(String value) {

		for (MessageReadStatus item : values())
			if (item.getValue().equals(value))
				return item;

		return null;
	}
}


