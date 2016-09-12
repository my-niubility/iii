package com.nbl.service.manager.constant;

public enum LoginAccountType {
	
	MEMBER( "会员" );

	private String value;

	LoginAccountType( String value ) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public String toString() {
		return this.value;
	}
}
