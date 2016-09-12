package com.nbl.service.business.constant;

public enum LockStatus {
	
	UN_LOCK("0", "未锁"),
	LOCK("1", "已锁");

	private String value;
	private final String displayName;

	LockStatus(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public static LockStatus parseOf(String value) {

		for (LockStatus item : values())
			if (item.getValue().equals(value))
				return item;

		return null;
	}
}
