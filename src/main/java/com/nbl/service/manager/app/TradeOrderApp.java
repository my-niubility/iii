package com.nbl.service.manager.app;

import java.util.List;

import com.nbl.common.vo.PageVO;
import com.nbl.service.manager.dto.TradeOrderReqDto;

/**
 * @author gcs
 * @createdate 2016年7月19日
 * @version 1.0
 * @description  交易订单管理接口
 * 
 * */
public interface TradeOrderApp {

	/**
	 * @param pageVO
	 * @param reqDto
	 * @return
	 * @description:分页查询
	 */
	public List<TradeOrderReqDto> pageListQueryTradeOrder(PageVO<TradeOrderReqDto> pageVO,TradeOrderReqDto reqDto);
	
	/**
	 * @param reqDto
	 * @return
	 * @description:分页查询统计总数
	 */
	public int pageCountQueryTradeOrder(TradeOrderReqDto reqDto);
	
	/**
	 * @param id
	 * @return obj
	 * @description: 根据交易订单ID来查询订单明细
	 */
	public TradeOrderReqDto tradeOrderDetail(String id);
	
	/**
	 * 通过id获取orderStatus
	 * @param id
	 * @return
	 */
	public String getOrderStatus(String id);
}
