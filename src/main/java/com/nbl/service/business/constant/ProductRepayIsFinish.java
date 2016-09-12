package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :产品还款完成状态
 */
public enum ProductRepayIsFinish {

	INIT((short) 0, "没有完成" ),
	
	FINISH((short) 1, "完成" ),
	
	REPAYING((short) 2, "还款中");
	
	private Short value;
	private final String displayName;
	
	ProductRepayIsFinish(Short value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public Short getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static ProductRepayIsFinish parseOf(Short value ){
		
		for ( ProductRepayIsFinish item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
