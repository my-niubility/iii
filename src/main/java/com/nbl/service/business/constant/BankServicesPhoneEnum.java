package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :银行客户
 */
public enum BankServicesPhoneEnum {
     
     BANK_0102_PHONE("0102", "95588","工行客服电话"),
     BANK_0103_PHONE("0103", "95599","农行客户电话"),
 	 BANK_0104_PHONE("0104", "95566","中国银行客服电话"),
 	 BANK_0105_PHONE("0105", "95533","建行客服电话"),
     BANK_0106_PHONE("0106", "95580","中国邮政储蓄银行客服电话"),
 	 BANK_0301_PHONE("0301", "95559","交通银行客服电话"),
 	 BANK_0302_PHONE("0302", "95558","中信银行客服电话"), 
 	 BANK_0303_PHONE("0303", "95595","中国光大银行客服电话"),
 	 BANK_0307_PHONE("0307","95511转3","平安银行客服电话"),
  	 BANK_0309_PHONE("0309", "95561","兴业银行客服电话"),
 	 BANK_0310_PHONE("0310", "95528","上海浦东发展银行客服电话"),
 	 BANK_0318_PHONE("0318","400-888-8811","渤海银行客服电话"),
 	 BANK_0401_PHONE("0401","95594","上海银行"),
 	 BANK_0403_PHONE("0403","95526","北京银行客服电话");
     
     private String code;
     private String value;
     private String displayName;
     
     BankServicesPhoneEnum(String code,String value,String displayName){
    	 this.code = code;
    	 this.value = value;
    	 this.displayName = displayName;
     }
     public static BankServicesPhoneEnum parseOf(String code){
	     for(BankServicesPhoneEnum bankServicesPhoneEnum : values()){
	    	 if(bankServicesPhoneEnum.getCode().equals(code)){
	    		 return bankServicesPhoneEnum;
	    	 }
	     }
	     throw new RuntimeException("行别"+code+"客服电话不存在！");
     }

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
}
