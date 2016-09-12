package com.nbl.service.manager.dto;

import java.io.Serializable;
/**
 * @author Donald
 * @createdate 2016年5月23日
 * @version 1.0 
 * @description :内部组织，部门
 */
public class OrganizationDto implements Serializable{

	private static final long serialVersionUID = 8458167324219768327L;
	
	private String id;
	
	private String name;
	
	private String description;
	
	private Boolean enable;
	
	private Integer sequence;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getEnable() {
		return enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}
	
}
