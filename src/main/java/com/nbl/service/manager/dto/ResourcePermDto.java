package com.nbl.service.manager.dto;

import java.io.Serializable;
import java.util.List;
/**
 * @author Donald
 * @createdate 2016年5月23日
 * @version 1.0 
 * @description :资源权限类
 */
public class ResourcePermDto implements Serializable {
	
	private static final long serialVersionUID = -7423392498427015269L;

	/**
	 * 资源Id
	 */
	private String resourcesId;
	
	/**
	 * 资源名称
	 */
	private String resourcesName;
	
	/**
	 * 资源类型
	 */
	private String resourcesType;

	/**
	 * 状态
	 */
	private String status;
	
	/**
	 * 资源描述
	 */
	private String description;
	
	/**
	 * 资源所规定的权限
	 */
	private List<PermissionDto> permList;

	public ResourcePermDto(){
		
	}

	public String getResourcesId() {
		return resourcesId;
	}

	public void setResourcesId(String resourcesId) {
		this.resourcesId = resourcesId;
	}

	public String getResourcesName() {
		return resourcesName;
	}

	public void setResourcesName(String resourcesName) {
		this.resourcesName = resourcesName;
	}

	public String getResourcesType() {
		return resourcesType;
	}

	public void setResourcesType(String resourcesType) {
		this.resourcesType = resourcesType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<PermissionDto> getPermList() {
		return permList;
	}

	public void setPermList(List<PermissionDto> permList) {
		this.permList = permList;
	}

	@Override
	public String toString() {
		return "ResourcePermDto [resourcesId=" + resourcesId + ", resourcesName=" + resourcesName + ", resourcesType="
				+ resourcesType + ", status=" + status + ", description=" + description + ", permList=" + permList
				+ "]";
	}
	
	
}
