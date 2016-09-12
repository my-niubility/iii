package com.nbl.service.manager.constant;

/**
 * 审核结果
 * @author YangXiaojin
 *
 */
public enum AuditResult {
	FIRST_AUDIT_PASSED("初审通过"),
	FIRST_AUDIT_REJECT("初审拒绝"),
	LAST_AUDIT_PASSED("终审通过"),
	LAST_AUDIT_REJECT("终审拒绝"),
	AUDITING("审核中…"),
	AUDIT_PASSED("审核通过"),
	AUDIT_REJECT("审核拒绝")
	;
	
	
	private String value;
	
	AuditResult( String value ){
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString(){
		return this.value;
	}
	
	public static AuditResult[] getAuditResult(){
		return new AuditResult[]{AUDIT_PASSED,AUDIT_REJECT};
	}
	
}
