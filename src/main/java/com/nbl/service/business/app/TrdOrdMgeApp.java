package com.nbl.service.business.app;

import com.nbl.common.dto.CommRespDto;
import com.nbl.service.business.dto.req.CanlTrdOrdDto;

public interface TrdOrdMgeApp {

	/**
	 * 取消订单
	 * 
	 * @param canlTrdOrdDto
	 * @return
	 */
	public CommRespDto cancelTradeOrder(CanlTrdOrdDto canlTrdOrdDto);
	
	/**
	 * 订单失效（定时任务触发）
	 * 
	 * @return
	 */
	public CommRespDto disabledTradeOrder();
}
