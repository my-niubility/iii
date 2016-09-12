package com.nbl.service.business.constant;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :
 */
public enum FileStorageType {

	FileStorageType00("00","投资结算"),
	FileStorageType01("01","还款结算"),
	FileStorageType02("02","退款结算"),
	FileStorageType03("03","划款结算"),
	FileStorageType04("04","退款交易"),
	FileStorageType05("05","资管人还款交易"),
	FileStorageType06("06","资管人补贴发放交易"),
	FileStorageType07("07","资管人补贴发放结算"),
	
	;
	
	private String value;
	private String displayName;
	
	FileStorageType(String value,String displayName){
		this.value = value;
		this.displayName = displayName;
	}
	
	public static FileStorageType parseOf(String value){
		for(FileStorageType fileStorageType : values()){
			if(fileStorageType.getValue().equals(value)){
				return fileStorageType;
			}
		}
		return null;
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
