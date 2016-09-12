package com.nbl.service.user.app;

import com.nbl.common.exception.MyBusinessCheckException;
import com.nbl.service.user.dto.req.ChkRechgInfoDto;

public interface RechargeChkApp {
	/**
	 * 账号充值参数校验（包括支付密码校验）
	 * 
	 * @param chkRechgInfoDto
	 * @return
	 */
	public void chkRechgInfo(ChkRechgInfoDto chkRechgInfoDto) throws MyBusinessCheckException;
}
