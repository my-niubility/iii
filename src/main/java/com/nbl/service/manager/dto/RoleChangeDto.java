package com.nbl.service.manager.dto;

import java.io.Serializable;
import java.util.Date;

import com.nbl.service.manager.constant.AuditResultStatus;
/**
 * @author Donald
 * @createdate 2016年5月23日
 * @version 1.0 
 * @description :角色审核变更
 */
public class RoleChangeDto implements Serializable{

	private static final long serialVersionUID = 1589928574727800375L;

	private String id;//id
	
	private String type;//类型--暂时不知道指什么类型,先为空
	
	private LoginAccountDto loginAccountDto;//操作员
	
	private AuditResultStatus status;//审核状态
	
	private byte[] originalObject;//原始角色
	
	private byte[] newObject;//新角色
	
	private RoleDto roleDto;//对应的角色id
	
	private Date createdTime;//创建时间
	
	private String description;//备注

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public AuditResultStatus getStatus() {
		return status;
	}

	public void setStatus(AuditResultStatus status) {
		this.status = status;
	}

	public byte[] getOriginalObject() {
		return originalObject;
	}

	public void setOriginalObject(byte[] originalObject) {
		this.originalObject = originalObject;
	}

	public byte[] getNewObject() {
		return newObject;
	}

	public void setNewObject(byte[] newObject) {
		this.newObject = newObject;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LoginAccountDto getLoginAccountDto() {
		return loginAccountDto;
	}

	public void setLoginAccountDto(LoginAccountDto loginAccountDto) {
		this.loginAccountDto = loginAccountDto;
	}

	public RoleDto getRoleDto() {
		return roleDto;
	}

	public void setRoleDto(RoleDto roleDto) {
		this.roleDto = roleDto;
	}
	
	
	
}
