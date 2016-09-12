package com.nbl.service.manager.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * @author Donald
 * @createdate 2016年5月23日
 * @version 1.0 
 * @description :登录用户类
 */
public class LoginAccountDto implements Serializable{
	
	private static final long serialVersionUID = -457085057147114369L;

	/**
     * 登录名称
     */
    private String loginName;
    
    /**
     * 登录密码
     */
    private String password;
 
    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 电子邮箱
     */
    private String email;
    
    /**
     * 登录账户是否有效,true:有效   false:无效
     */
    private Short enabled;
    /**
     * 登录帐户有效期-开始时间
     */
    private Date periodStart;
    /**
     * 登录帐户有效期-结束时间
     */
    private Date periodEnd;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 所属机构、部门
     */
    private String partyId;

    /**
     * 备注
     */
    private String description;
    
	/**
	 * 权限角色
	 */
	private Set<RoleDto> roles;
	/**
	 * 真实姓名
	 */
	private String realName;

	/**
	 * 是否使用CA登录
	 */
	private Boolean useCa;

	/**
	 * 最后一次更新密码时间
	 */
	private Date lastUpdatePasswordTime;

	/**
	 * 最近一次登录错误锁定时间
	 */
	private Date lastLoginLockTime;
	
	/**
	 * 审核人
	 */
	private String auditUser;
	
	/**
	 * 变更对象
	 */
	private byte[] newObject;

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Short getEnabled() {
		return enabled;
	}

	public void setEnabled(Short enabled) {
		this.enabled = enabled;
	}

	public Date getPeriodStart() {
		return periodStart;
	}

	public void setPeriodStart(Date periodStart) {
		this.periodStart = periodStart;
	}

	public Date getPeriodEnd() {
		return periodEnd;
	}

	public void setPeriodEnd(Date periodEnd) {
		this.periodEnd = periodEnd;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getPartyId() {
		return partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<RoleDto> getRoles() {
		return roles;
	}

	public void setRoles(Set<RoleDto> roles) {
		this.roles = roles;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Boolean getUseCa() {
		return useCa;
	}

	public void setUseCa(Boolean useCa) {
		this.useCa = useCa;
	}

	public Date getLastUpdatePasswordTime() {
		return lastUpdatePasswordTime;
	}

	public void setLastUpdatePasswordTime(Date lastUpdatePasswordTime) {
		this.lastUpdatePasswordTime = lastUpdatePasswordTime;
	}

	public Date getLastLoginLockTime() {
		return lastLoginLockTime;
	}

	public void setLastLoginLockTime(Date lastLoginLockTime) {
		this.lastLoginLockTime = lastLoginLockTime;
	}

	public String getAuditUser() {
		return auditUser;
	}

	public void setAuditUser(String auditUser) {
		this.auditUser = auditUser;
	}

	public byte[] getNewObject() {
		return newObject;
	}

	public void setNewObject(byte[] newObject) {
		this.newObject = newObject;
	}

	@Override
	public String toString() {
		return "LoginAccountDto [loginName=" + loginName + ", password=" + password + ", mobile=" + mobile + ", email="
				+ email + ", enabled=" + enabled + ", periodStart=" + periodStart + ", periodEnd=" + periodEnd
				+ ", createDate=" + createDate + ", partyId=" + partyId + ", description=" + description + ", roles="
				+ roles + ", realName=" + realName + ", useCa=" + useCa + ", lastUpdatePasswordTime="
				+ lastUpdatePasswordTime + ", lastLoginLockTime=" + lastLoginLockTime + ", auditUser=" + auditUser
				+ "]";
	}


	

}
