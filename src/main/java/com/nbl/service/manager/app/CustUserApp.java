package com.nbl.service.manager.app;
/**
 * @author gcs
 * @createdate 2016年8月9日	
 * @version 1.0
 * 对应接口登录注册实名接口管理
 */

public interface CustUserApp {
	
	/**
	 * @param cub
	 * 根据登录用户custId来查询用户实名个数
	 * 
	 * */
	public int queryCountCustUser();
	
	/**
	 * @param cub
	 * 根据登录用户custId来查询用户未实名个数
	 * 
	 * */
	public int queryNoCountCustUser();
	/**
	 * @param cub
	 * 根据登录用户custId来查询用户实名个数
	 * 
	 * */
	public int queryLastMonthCount();
	
	/**
	 * @param cub
	 * 根据登录用户custId来查询用户未实名个数
	 * 
	 * */
	public int queryNoLastMonthCount();
	/**
	 * @param cub
	 * 根据登录用户custId来查询用户实名个数
	 * 
	 * */
	public int queryMonthCount();
	
	/**
	 * @param cub
	 * 根据登录用户custId来查询用户未实名个数
	 * 
	 * */
	public int queryNoMonthCount();
	/**
	 * @param cub
	 * 根据登录用户custId来查询用户实名个数
	 * 
	 * */
	public int queryWeekCount();
	
	/**
	 * @param cub
	 * 根据登录用户custId来查询用户未实名个数
	 * 
	 * */
	public int queryNoWeekCount();
}
