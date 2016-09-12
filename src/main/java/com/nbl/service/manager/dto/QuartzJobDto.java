package com.nbl.service.manager.dto;

import java.io.Serializable;
import java.util.List;

/**
 * @author Donald
 * @createdate 2016年7月14日
 * @version 1.0 
 * @description :任务计划对象
 */
public class QuartzJobDto implements Serializable{

	private static final long serialVersionUID = -3307193807601203485L;

	private String jName;
	
	private String jGroup;
	
	private List<QuartzJobTriggerDto> triggerList;
	
	public String getjName() {
		return jName;
	}

	public void setjName(String jName) {
		this.jName = jName;
	}

	public String getjGroup() {
		return jGroup;
	}

	public void setjGroup(String jGroup) {
		this.jGroup = jGroup;
	}

	public List<QuartzJobTriggerDto> getTriggerList() {
		return triggerList;
	}

	public void setTriggerList(List<QuartzJobTriggerDto> triggerList) {
		this.triggerList = triggerList;
	}

	
}
