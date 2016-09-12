package com.nbl.service.business.app;

import com.nbl.common.dto.CommRespDto;
import com.nbl.service.user.dto.req.WthdrQryInfoDto;

public interface WithdrawQryApp {
	/**
	 * 提现订单查询
	 * 
	 * @param chkRechgInfoDto
	 * @return
	 */
	public CommRespDto queryWthdrOrder(WthdrQryInfoDto wthdrQryInfoDto);

	/**
	 * 提现订单总条数查询
	 * 
	 * @param chkRechgInfoDto
	 * @return
	 */
	public String queryWthdrOrderCount(WthdrQryInfoDto wthdrQryInfoDto);
}
