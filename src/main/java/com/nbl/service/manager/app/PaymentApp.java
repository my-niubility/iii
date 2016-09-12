package com.nbl.service.manager.app;
/**
 * @author gcs
 * @createdate 2016年8月10日	
 * @version 1.0
 * 接口层对应的支付订单接口
 */

public interface PaymentApp {
	
	/**
	 * 根据登录用户custId来查询用户实名个数
	 * 
	 * */
	public int queryCountPayment();
	
	/**
	 * 根据登录用户custId来查询用户未实名个数
	 * 
	 * */
	public int queryNoCountPayment();
	/**
	 * 根据登录用户custId来查询上月用户实名个数
	 * 
	 * */
	public int queryLastMonthCount();
	
	/**
	 * 根据登录用户custId来查询上月用户未实名个数
	 * 
	 * */
	public int queryNoLastMonthCount();
	/**
	 * 根据登录用户custId来查询本月用户实名个数
	 * 
	 * */
	public int queryMonthCount();
	
	/**
	 * 根据登录用户custId来查询本月用户未实名个数
	 * 
	 * */
	public int queryNoMonthCount();
	/**
	 * 根据登录用户custId来查询上周用户实名个数
	 * 
	 * */
	public int queryWeekCount();
	
	/**
	 * 根据登录用户custId来查询上周用户未实名个数
	 * 
	 * */
	public int queryNoWeekCount();
}
