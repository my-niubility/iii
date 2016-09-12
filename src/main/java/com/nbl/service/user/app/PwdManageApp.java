package com.nbl.service.user.app;

import com.nbl.common.exception.MyBusinessCheckException;
import com.nbl.service.user.dto.req.LogPwdInfoDto;
import com.nbl.service.user.dto.req.PayPwdInfoDto;

public interface PwdManageApp {
	/**
	 * 交易密码设置
	 * 
	 * @param payPwdInfoDto
	 * @return
	 */
	public void setPayPwd(PayPwdInfoDto payPwdInfoDto) throws MyBusinessCheckException;

	/**
	 * 登录密码设置
	 * 
	 * @param payPwdInfoDto
	 * @return
	 */
	public void setPayPwd(LogPwdInfoDto payPwdInfoDto) throws MyBusinessCheckException;

	/**
	 * 支付密码校验
	 * 
	 * @param custId
	 * @param payPwd
	 * @throws MyBusinessCheckException
	 */
	public void checkPayPwd(String custId, String payPwd) throws MyBusinessCheckException;

}
