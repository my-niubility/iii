package com.nbl.service.manager.constant;

public enum MpAuditStatus {
	
	NEW("待审核"),
	AUDIT_REJECT("审核拒绝"),
	EFFECTIVE("有效"),
	DELETE("停用"),
	;
	
	private String value;
	
	MpAuditStatus( String value ){
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString(){
		return this.value;
	}

}
