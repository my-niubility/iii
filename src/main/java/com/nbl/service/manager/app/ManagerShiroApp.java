package com.nbl.service.manager.app;

import java.util.Set;

import com.nbl.service.manager.dto.LoginAccountDto;
import com.nbl.service.manager.dto.RoleDto;

public interface ManagerShiroApp {
	
	/**
	 * 通过用户名查询用户
	 * @param userName
	 * @return
	 */
	public LoginAccountDto getByUserName(String userName);
	
	/**
	 * 通过用户名查询角色信息
	 * @param userName
	 * @return
	 */
	public Set<RoleDto> getRoles(String userName);
	
	/**
	 * 通过用户名查询权限信息
	 * @param userName
	 * @return
	 */
	public Set<String> getPermissions(String userName);


}
