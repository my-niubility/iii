package com.nbl.service.business.app;

import com.nbl.common.dto.CommRespDto;
import com.nbl.common.exception.MyBusinessCheckException;
import com.nbl.service.business.dto.req.PayAlyInfoDto;
import com.nbl.service.business.dto.req.PayRltInfoDto;

/**
 * @author AlanMa
 * @createdate 2016年5月5日
 * @version 1.0
 * @description :订单支付
 */
public interface OrderPaymentApp {

	/**
	 * 支付申请(快捷支付)
	 * 
	 * @param payAlyInfoDto
	 * @return
	 */
	public CommRespDto paymentApplyQuick(PayAlyInfoDto payAlyInfoDto);

	/**
	 * 支付申请(余额支付)
	 * 
	 * @param payAlyInfoDto
	 * @return
	 */
	public CommRespDto paymentApplyBalance(PayAlyInfoDto payAlyInfoDto);

	/**
	 * 支付申请(网关支付)
	 * 
	 * @param payAlyInfoDto
	 * @return
	 */
	public CommRespDto paymentApplyGateway(PayAlyInfoDto payAlyInfoDto);

	/**
	 * 支付结果通知(快捷支付)
	 * 
	 * @param payRltInfoDto
	 * @return
	 * @throws MyBusinessCheckException
	 */
	public void paymentAlyQckNotice(PayRltInfoDto payRltInfoDto) throws MyBusinessCheckException;

	/**
	 * 支付结果通知(余额支付)
	 * 
	 * @param payRltInfoDto
	 * @return
	 * @throws MyBusinessCheckException
	 */
	public void paymentAlyBalNotice(PayRltInfoDto payRltInfoDto) throws MyBusinessCheckException;

	/**
	 * 支付结果通知(网关支付)
	 * 
	 * @param payRltInfoDto
	 * @return
	 * @throws MyBusinessCheckException
	 */
	public void paymentAlyGtyNotice(PayRltInfoDto payRltInfoDto) throws MyBusinessCheckException;

}
