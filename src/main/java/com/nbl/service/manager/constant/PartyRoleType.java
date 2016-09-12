package com.nbl.service.manager.constant;

/**
 * @author Donald
 * @createdate 2016年5月23日
 * @version 1.0 
 * @description :机构、部门
 */
public enum PartyRoleType {
	GENERAL_MANA_OFFICE("GENERAL_MANA_OFFICE","总经办"),
	OPERATE_BRANCH("OPERATE_BRANCH","运营部门"),
	MARKET_BRANCH("MARKET_BRANCH","市场部门"),
	IT_BRANCH("IT_BRANCH","技术部门"),
	HC_BRANCH("HC_BRANCH","人力部门"),
	OTHER_BRANCH("OTHER_BRANCH","其它部门");
	private String value;
	private final String displayName;
	
	PartyRoleType( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}
	
	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static PartyRoleType parseOf( String value ){
		
		for ( PartyRoleType item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		return null;
	}
}
