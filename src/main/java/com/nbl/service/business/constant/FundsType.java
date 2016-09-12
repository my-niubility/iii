package com.nbl.service.business.constant;

import com.nbl.common.constants.ConstantEnum;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :支付类型
 */
public enum FundsType implements ConstantEnum {

	FundsType1( "01", "划款" ),
	
	FundsType2( "02", "资产管理人还款" ),
	
	FundsType3("03", "资产管理人退款"),
	
	FundsType4("04", "融资人还款"),
	
	FundsType5("05", "担保人还款"),
	
	FundsType6("06", "投资购买"),
	
	FundsType7("07", "转让购买"),
	
	FundsType8("08", "补贴发放")
	
	;
	

	private String value;
	private final String displayName;
	
	FundsType( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static FundsType parseOf( String value ){
		
		for ( FundsType item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println(FundsType.parseOf("01"));
	}
}
