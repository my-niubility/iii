package com.nbl.service.user.app;

import com.nbl.common.dto.CommRespDto;
import com.nbl.common.exception.MyBusinessCheckException;
import com.nbl.service.user.dto.req.BindNoticeDto;
import com.nbl.service.user.dto.req.BndBnkCardDto;
import com.nbl.service.user.dto.req.ChkBndCrdInfoDto;

/**
 * @author AlanMa
 * @createdate 2016年4月27日
 * @version 1.0
 * @description :绑定银行卡
 */
public interface BindBankCardApp {
	/**
	 * 绑卡申请
	 * 
	 * @param userCertDto
	 * @return
	 */
	public CommRespDto bindCardApply(BndBnkCardDto userCertDto);

	/**
	 * 绑卡参数校验
	 * 
	 * @param userCertDto
	 * @return
	 */
	public void checkBnkCrdInfo(ChkBndCrdInfoDto chkBndCrdInfoDto) throws MyBusinessCheckException;

	/**
	 * 绑卡异步通知
	 * 
	 * @param userCertDto
	 * @return
	 */
	public void bindNotice(BindNoticeDto bindNoticeDto);

}
