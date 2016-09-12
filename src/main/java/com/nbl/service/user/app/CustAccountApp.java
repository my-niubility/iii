package com.nbl.service.user.app;

/**
 * @author AlanMa
 * @createdate 2016年5月17日
 * @version 1.0
 * @description :客户账户关系
 */
public interface CustAccountApp {

	/**
	 * 通过客户编号获取平台账号
	 * 
	 * @param custId
	 * @return
	 */
	public String getAccountId(String custId);

	public String getCustName(String custId);

}
