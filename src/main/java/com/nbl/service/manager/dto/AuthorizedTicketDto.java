package com.nbl.service.manager.dto;

import java.io.Serializable;
import java.util.Calendar;

import com.nbl.service.manager.constant.AuthorizedTicketScope;

public class AuthorizedTicketDto implements Serializable{

	private static final long serialVersionUID = -5945813966203052176L;

	private String id;
	
	/**
	 * 资源URL
	 */
	private String url;
	
	/**
	 * 权限令牌
	 */
	private String token;
	
	/**
	 * 授权范围
	 */
	private AuthorizedTicketScope scope;
	
	/**
	 * SESSION ID值
	 */
	private String sessionId;
	
	/**
	 * 授权用户
	 */
	private String licensor;
	
	/**
	 * 被授权用户
	 */
	private String grantor;
	
	/**
	 * 失效时间
	 */
	private Calendar validTime;
	
	/**
	 * 最大授权次数
	 */
	public Long maxCount;
	
	/**
	 * 实际授权次数
	 */
	public Long authCount;
	
	/**
	 * 是否有效
	 */
	public boolean isEffective( ){
		return isEffective(Calendar.getInstance());
	}
	
	/**
	 * 是否有效
	 */
	public boolean isEffective(Calendar now){
		if( AuthorizedTicketScope.TIMES.equals(scope) ){
			return this.authCount < this.maxCount;
		}else{
			return validTime == null || ( now != null 
				&& validTime.getTimeInMillis() >= now.getTimeInMillis());
		}
	}
	
	/**
	 * 是否一次有效
	 */
	public boolean isOnceScope(){
		return AuthorizedTicketScope.ONCE.equals(this.getScope());
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public AuthorizedTicketScope getScope() {
		return scope;
	}

	public void setScope(AuthorizedTicketScope scope) {
		this.scope = scope;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getLicensor() {
		return licensor;
	}

	public void setLicensor(String licensor) {
		this.licensor = licensor;
	}

	public String getGrantor() {
		return grantor;
	}

	public void setGrantor(String grantor) {
		this.grantor = grantor;
	}

	public Calendar getValidTime() {
		return validTime;
	}

	public void setValidTime(Calendar validTime) {
		this.validTime = validTime;
	}

	public Long getMaxCount() {
		return maxCount;
	}

	public void setMaxCount(Long maxCount) {
		this.maxCount = maxCount;
	}

	public Long getAuthCount() {
		return authCount;
	}

	public void setAuthCount(Long authCount) {
		this.authCount = authCount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
