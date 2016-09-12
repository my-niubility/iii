package com.nbl.service.manager.dto;

import java.io.Serializable;

import com.nbl.service.manager.constant.AuditResult;

/**
 * @author Donald
 * @createdate 2016年5月23日
 * @version 1.0 
 * @description :审核基础类
 */
public class BaseAuditDto implements Serializable{

	private static final long serialVersionUID = 800252562242728498L;

	/**
	 * 审核人
	 */
	private LoginAccountDto user;
	
	/**
	 * 审核结果
	 */
	private AuditResult result;
	
	/**
	 * 描述
	 */
	private String description;


	
	public LoginAccountDto getUser() {
		return user;
	}

	public void setUser(LoginAccountDto user) {
		this.user = user;
	}

	public AuditResult getResult() {
		return result;
	}

	public void setResult(AuditResult result) {
		this.result = result;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
