package com.nbl.service.business.app;

import com.nbl.common.dto.CommRespDto;
import com.nbl.service.user.dto.req.RchgQryInfoDto;

public interface RechargeQryApp {
	/**
	 * 充值订单查询
	 * 
	 * @param chkRechgInfoDto
	 * @return
	 */
	public CommRespDto queryRchgOrder(RchgQryInfoDto rchgQryInfoDto);
	/**
	 * 充值订单总条数查询
	 * 
	 * @param chkRechgInfoDto
	 * @return
	 */
	public String queryRchgOrderCount(RchgQryInfoDto rchgQryInfoDto);
}
