package com.nbl.service.manager.dto;

import java.io.Serializable;
import java.util.Date;

import com.nbl.service.manager.constant.AuditResultStatus;

/**
 * @author Donald
 * @createdate 2016年5月23日
 * @version 1.0 
 * @description :角色审核结果
 */
public class RoleAuditResultDto implements Serializable{

	private static final long serialVersionUID = 8929048764175593751L;

	private String id;  //主键ID
	
	private RoleChangeDto rolechangeDto;  //角色变更ID
	
	private LoginAccountDto loginAccountDto;  //关联系统用户
	
	private AuditResultStatus result;//审核结果
	
	private String description;//备注
	
	private Date createdTime;//创建时间

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LoginAccountDto getLoginAccountDto() {
		return loginAccountDto;
	}

	public void setLoginAccountDto(LoginAccountDto loginAccountDto) {
		this.loginAccountDto = loginAccountDto;
	}

	public AuditResultStatus getResult() {
		return result;
	}

	public void setResult(AuditResultStatus result) {
		this.result = result;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public RoleChangeDto getRolechangeDto() {
		return rolechangeDto;
	}

	public void setRolechangeDto(RoleChangeDto rolechangeDto) {
		this.rolechangeDto = rolechangeDto;
	}
	
	
}
