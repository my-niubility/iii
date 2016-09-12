package com.nbl.service.manager.constant;

/**
 * @author Donald
 * @createdate 2016年5月23日
 * @version 1.0 
 * @description :资源操作角色
 */
public enum OperateRoleType {
	ROOT_MANAGER("ROOT","ROOT管理员"),
	OPERATE_H_MANAGER("OPERATE_H","运营高级管理员"),
	OPERATE_L_MANAGER("OPERATE_L","运营初级管理员"),
	IT_H_MANAGER("IT_H_MANAGER","技术高级管理员"),
	IT_L_MANAGER("IT_L_MANAGER","技术初级管理员"),
	NORMAL_MANAGER("NOR_MANAGER","普通用户");
	private String value;
	private final String displayName;
	
	OperateRoleType( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}
	
	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static OperateRoleType parseOf( String value ){
		
		for ( OperateRoleType item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		return null;
	}
}
