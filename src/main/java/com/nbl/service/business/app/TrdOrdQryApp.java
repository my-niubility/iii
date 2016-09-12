package com.nbl.service.business.app;

import com.nbl.common.dto.CommRespDto;
import com.nbl.service.business.dto.req.HisTrdOrdDto;
import com.nbl.service.business.dto.req.InvHisDto;
import com.nbl.service.user.dto.req.SerFundQryDto;
import com.nbl.service.user.dto.req.TrdOrdQryInfoDto;

public interface TrdOrdQryApp {
	/**
	 * 交易订单查询
	 * 
	 * @param trdOrdQryInfoDto
	 * @return
	 */
	public CommRespDto queryTradeOrder(TrdOrdQryInfoDto trdOrdQryInfoDto);
	
	/**
	 * 交易订单总数查询
	 * 
	 * @param trdOrdQryInfoDto
	 * @return
	 */
	public String queryTradeOrderCount(TrdOrdQryInfoDto trdOrdQryInfoDto);

	/**
	 * 资金流水查询
	 * 
	 * @param serFundQryDto
	 * @return
	 */
	public CommRespDto querySerialFund(SerFundQryDto serFundQryDto);
	/**
	 * 资金流水总数查询
	 * 
	 * @param serFundQryDto
	 * @return
	 */
	public String querySerialFundCount(SerFundQryDto serFundQryDto);

	/**
	 * 历史成交订单信息查询
	 * 
	 * @param hisTrdOrdDto
	 * @return
	 */
	public CommRespDto queryHisTrdOrd(HisTrdOrdDto hisTrdOrdDto);
	
	/**
	 *  订单产品交易记录查询(根据更新时间倒序20条)
	 * 
	 * @return
	 */
	public CommRespDto queryHisPrdTrd();
	
	/**
	 * 客户最近投资记录（10条）
	 * 
	 * @return
	 */
	public CommRespDto qryCustInvestHistory(InvHisDto invHisDto);
	/**
	 * 资金流水查询，其中提现包括查询状态为处理中、已受理、提现成功
	 * @param serFundQryDto
	 * @return
	 */
	public CommRespDto querySerialFund4Withdr(SerFundQryDto serFundQryDto);
}
