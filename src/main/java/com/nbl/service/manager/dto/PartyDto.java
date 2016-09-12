package com.nbl.service.manager.dto;

import java.util.Date;
import java.util.Set;

import com.nbl.service.manager.constant.PartyRoleType;

/**
 * @author Donald
 * @createdate 2016年5月23日
 * @version 1.0 
 * @description :机构，部门业务角色
 */
public class PartyDto extends OrganizationDto{

	private static final long serialVersionUID = -3251477647721895799L;
	
	private Date createdTime;//创建时间
	
	private Date periodStart; //开始时间
	
	private Date periodEnd;//结束时间
	/**
	 * 上级
	 */
	private PartyDto parent;
	/**
	 * 下级
	 */
	private Set<PartyDto> children;
	
	private PartyRoleType partyRoleType; //业务角色

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
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

	public PartyDto getParent() {
		return parent;
	}

	public void setParent(PartyDto parent) {
		this.parent = parent;
	}

	public Set<PartyDto> getChildren() {
		return children;
	}

	public void setChildren(Set<PartyDto> children) {
		this.children = children;
	}

	public PartyRoleType getPartyRoleType() {
		return partyRoleType;
	}

	public void setPartyRoleType(PartyRoleType partyRoleType) {
		this.partyRoleType = partyRoleType;
	}
	
	
}
