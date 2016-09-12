package com.nbl.service.manager.app;
/**
 * @author gcs
 * @createdate 2016年8月1日	
 * @version 1.0
 * 初始化日期接口
 */

public interface DayApp {
	
	/**
	 * @param initDay  
	 * @return
	 * @description:初始化日期
	 */
	public void initDay(String initDay);
	
	/**
	 * @param day 
	 * @param workDayType 1是工作日   0不是
	 * 修改工作日期
	 * */
	public boolean workDayTypeModify(String day,Short workDayType);
	
	/**
	 * @param initDay
	 * @return boolean
	 * 根据传过来的年来判断是否已初始化
	 * */
	public boolean queryLikeDay(String initDay);
	
}
