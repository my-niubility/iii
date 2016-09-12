/**
 * InvestmentProjectAction.java
 * 版权所有(C) 2014 证联融通电子有限公司 
 * 创建:LiuQ 2014-6-12
 */
package com.nbl.service.business.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :支付交易类型
 */
public enum PaymentType {
    
    ACCOUNT_PAYMENT("00", "账户支付"), 
    GATEWAY_PAYMENT_RECHARGE("01", "网关支付"),
    SHORTCUT_PAYMENT("02", "快捷支付"), 
    BANK_ACCOUNT_TRANSFER("03", "银行账户转账"), 
    BANK_ACCOUNT_COLLECTION("04", "银行收账"),
    
    ;
    
    private String value;
    private String displayName;
    
    public String getValue() {
        return this.value;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }
    
    PaymentType(String value, String displayName){
        this.value = value ;
        this.displayName = displayName ;
    }
    
    private static Map<String, PaymentType> valueMap = new HashMap<String, PaymentType>();

	static {
		for (PaymentType _enum : PaymentType.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	/**
	 * 枚举转换
	 */
	public static PaymentType parseOf(String value){
		for(PaymentType item : values())
			if(item.getValue().equals(value))
				return item;
		
		throw new IllegalArgumentException("支付交易类型["+value+"]不匹配!");
	}
}