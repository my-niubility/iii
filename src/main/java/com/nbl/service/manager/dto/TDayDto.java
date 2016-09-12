package com.nbl.service.manager.dto;

import java.io.Serializable;

/**
 * @author gcs
 * @createdate 2016年8月1日	
 * @version 1.0
 * 对应日期实体类
 */

public class TDayDto implements Serializable {

	private static final long serialVersionUID = 4749578139794813877L;
	
	private String day;

    private Short festivalFlag;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day == null ? null : day.trim();
    }

    public Short getFestivalFlag() {
        return festivalFlag;
    }

    public void setFestivalFlag(Short festivalFlag) {
        this.festivalFlag = festivalFlag;
    }

	@Override
	public String toString() {
		return "TDayDto [day=" + day + ", festivalFlag=" + festivalFlag + "]";
	}
    
}
