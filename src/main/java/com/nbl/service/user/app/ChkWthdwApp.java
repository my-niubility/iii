package com.nbl.service.user.app;

import com.nbl.common.exception.MyBusinessCheckException;
import com.nbl.service.user.dto.req.ChkWtDwInfoDto;

public interface ChkWthdwApp {
	/**
	 * 账号提现参数校验（包括支付密码校验）
	 * 
	 * @param chkRechgInfoDto
	 * @return
	 */
	public void chkWthdwInfo(ChkWtDwInfoDto chkWtDwInfoDto) throws MyBusinessCheckException;
	
}
