package com.nbl.service.business.app;

import com.nbl.common.dto.CommRespDto;
import com.nbl.common.exception.MyBusinessCheckException;
import com.nbl.service.user.dto.req.RchgNoticeDto;
import com.nbl.service.user.dto.req.RechgAlyInfoDto;

/**
 * @author maxinwei
 * @createdate 2016年4月19日
 * @version 1.0
 * @description :账号充值
 */
public interface RechargeApp {

	/**
	 * 账号充值申请
	 * 
	 * @param rechgAlyInfoDto
	 * @return
	 */
	public CommRespDto rechargeApply(RechgAlyInfoDto rechgAlyInfoDto);

	/**
	 * 充值异步通知
	 * 
	 * @param rchgNoticeDto
	 * @return
	 * @throws MyBusinessCheckException
	 */
	public void rechargeNotice(RchgNoticeDto rchgNoticeDto) throws MyBusinessCheckException;

}
