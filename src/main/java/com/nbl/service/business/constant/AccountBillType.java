package com.nbl.service.business.constant;


/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :记账流水类型
 */
public enum AccountBillType {
	BOOK("0", "记账流水"), 
	REVERSE("1", "记账冲正流水"),
	;

	private String value;
	private String displayName;
	
	/**
	 * 枚举转换
	 */
	public static AccountBillType parseOf( String value ){
		for( AccountBillType item:values() )
			if( item.getValue().equals(value) )
				return item;
		
		throw new IllegalArgumentException("记账流水类型举值["+value+"]不匹配!");
	}

	public String getValue() {
		return this.value;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	AccountBillType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
}
