package com.nbl.service.manager.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.nbl.service.manager.constant.MpAuditStatus;

/**
 * @author Donald
 * @createdate 2016年5月23日
 * @version 1.0 
 * @description :角色
 */
public class RoleDto implements Serializable{

	private static final long serialVersionUID = -7136631844200996017L;

	/**
	 * roleId
	 */
	private String roleId;
	
	
	/**
	 * 角色名称
	 */
	
	private String roleName;
	
	/**
	 * 状态
	 */
	private String status;
	
	/**
	 * 创建时间
	 */
	private Date createdTime;
	
	/**
	 * 描述
	 */
	private String description;
	
	private String creater;
	
	/**
	 * 角色对应权限
	 */
	private Set<ResourcePermDto> permissions;
	
	/**
	 * 状态是否有效
	 */
	public boolean isEffective(){
		return MpAuditStatus.EFFECTIVE.equals(this.status);
	}
	
	/**
	 * 是否标记删除
	 */
	public boolean isRemoved(){
		return MpAuditStatus.DELETE.equals(this.status);
	}
	
	public void addPermission( ResourcePermDto p ){
		if( p == null )
			return;
		
		List<ResourcePermDto> list = new ArrayList<ResourcePermDto>( );
		list.add(p);
		addPermission(list);
	}
	
	/**
	 * 添加权限
	 */
	public void addPermission( Collection<ResourcePermDto> colls ){
		if( this.permissions == null )
			this.permissions = new HashSet<ResourcePermDto>();
		
		if( colls == null ) 
			return;
		
		for( ResourcePermDto p:colls )
			this.permissions.add( p );
	}
	
	public void setPermissions( Collection<ResourcePermDto> colls ){
		this.permissions = new HashSet<ResourcePermDto>();
		
		if( colls == null ) 
			return;
		
		for( ResourcePermDto p:colls )
			this.permissions.add( p );
	}
	
	public RoleDto clone(){
		 try{
			 return (RoleDto)super.clone();
		 }catch( CloneNotSupportedException e ){
			 return null;
		 }
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<ResourcePermDto> getPermissions() {
		return permissions;
	}

	public void setPermissions(Set<ResourcePermDto> permissions) {
		this.permissions = permissions;
	}


	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

	@Override
	public String toString() {
		return "RoleDto [roleId=" + roleId + ", roleName=" + roleName + ", status=" + status + ", createdTime="
				+ createdTime + ", description=" + description + ", permissions=" + permissions + "]";
	}

	
}
