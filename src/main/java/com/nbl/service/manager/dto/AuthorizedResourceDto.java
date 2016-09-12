package com.nbl.service.manager.dto;

import java.io.Serializable;
import java.util.Calendar;

public class AuthorizedResourceDto implements Serializable{
	
	private static final long serialVersionUID = 4148881458891954166L;

	/**
	 * 资源URL
	 */
	private String url;
	
	/**
	 * 是否可用
	 */
	private Boolean enabled;
	
	/**
	 * 创建日期
	 */
	private Calendar createdTime;
	
	/**
	 * 备注
	 */
	private String description;
	
	/**
	 * 需授权类型
	 */
	private String licensedType;
	
	
	/**
	 * 是否可用
	 */
	public boolean isEnabled(){
		return Boolean.TRUE.equals(this.enabled);
	}

	public String getIdentity() {
		return this.url;
	}

	public boolean isInsert() {
		return this.url == null ;
	}

	public void preInsert() {
		if( this.createdTime == null )
			this.createdTime = Calendar.getInstance();
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Calendar getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Calendar createdTime) {
		this.createdTime = createdTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLicensedType() {
		return licensedType;
	}

	public void setLicensedType(String licensedType) {
		this.licensedType = licensedType;
	}
}
