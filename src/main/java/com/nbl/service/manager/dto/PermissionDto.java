package com.nbl.service.manager.dto;

import java.io.Serializable;

public class PermissionDto implements Serializable{

	private static final long serialVersionUID = 8025728717500996366L;
	/**
	 * 权限ID
	 */
	private String permissionId;
	
	/**
	 * 权限名称
	 */
	private String permissionName;
	
	/**
	 * 描述
	 */
	private String description;

	public String getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(String permissionId) {
		this.permissionId = permissionId;
	}

	public String getPermissionName() {
		return permissionName;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "PermissionDto [permissionId=" + permissionId + ", permissionName=" + permissionName + ", description="
				+ description + "]";
	}
	
}
