package com.nbl.service.business.app;

import com.nbl.common.dto.CommRespDto;
import com.nbl.common.exception.MyBusinessCheckException;
import com.nbl.service.user.dto.req.WthdwAlyInfoDto;
import com.nbl.service.user.dto.req.WthdwNoticeDto;

/**
 * @author maxinwei
 * @createdate 2016年4月19日
 * @version 1.0
 * @description :账号提现
 */
public interface WithdrawApp {
	/**
	 * 账号充值申请
	 * 
	 * @param rechgAlyInfoDto
	 * @return
	 */
	public CommRespDto withDrawApply(WthdwAlyInfoDto wthdwAlyInfoDto);

	/**
	 * 充值异步通知
	 * 
	 * @param wthdwNoticeDto
	 * @return
	 * @throws MyBusinessCheckException
	 */
	public void rechargeNotice(WthdwNoticeDto wthdwNoticeDto) throws MyBusinessCheckException;
}
