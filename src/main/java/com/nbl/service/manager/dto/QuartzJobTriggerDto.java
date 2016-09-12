package com.nbl.service.manager.dto;

import java.io.Serializable;

/**
 * @author Donald
 * @createdate 2016年7月14日
 * @version 1.0 
 * @description :任务计划触发器对象
 */
public class QuartzJobTriggerDto implements Serializable{

	private static final long serialVersionUID = -2675623302601996579L;

	private String cron;
	
	private String tName;
	
	private String tGroup;
	
	private String currStatus;
	
	private String preTime;
	
	private String nextTime;
	
	private String startTime;
	
	private String endTime;


	public String getCron() {
		return cron;
	}

	public void setCron(String cron) {
		this.cron = cron;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public String gettGroup() {
		return tGroup;
	}

	public void settGroup(String tGroup) {
		this.tGroup = tGroup;
	}

	public String getCurrStatus() {
		return currStatus;
	}

	public void setCurrStatus(String currStatus) {
		this.currStatus = currStatus;
	}

	public String getPreTime() {
		return preTime;
	}

	public void setPreTime(String preTime) {
		this.preTime = preTime;
	}

	public String getNextTime() {
		return nextTime;
	}

	public void setNextTime(String nextTime) {
		this.nextTime = nextTime;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	
}
