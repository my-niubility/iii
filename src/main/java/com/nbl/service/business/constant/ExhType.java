package com.nbl.service.business.constant;


/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :展示类型
 */
public enum ExhType {
	PRD_LIST("01", "首页-推荐"), 
	PRD_RECOMMEND("02", "新品中心-产品推荐"),
	CUST_RECOMMEND("03", "我的资产-为您推荐"),
	PRD_LIST_NOR("04", "首页-普通展示");
	
	private String value;
	private String displayName;
	
	/**
	 * 枚举转换
	 */
	public static ExhType parseOf( String value ){
		for( ExhType item:values() )
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

	ExhType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
}
