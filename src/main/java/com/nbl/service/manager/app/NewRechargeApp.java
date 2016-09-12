package com.nbl.service.manager.app;

import java.util.List;

import com.nbl.common.exception.MyBusinessCheckException;
import com.nbl.common.vo.PageVO;
import com.nbl.service.manager.dto.RechargeReqDto;

/**
 * @author gcs
 * @createdate 2016年7月20日
 * @version 1.0
 * @description  充值订单管理接口
 * 
 * */
public interface NewRechargeApp {
	/**
	 * @param pageVO
	 * @param reqDto
	 * @return
	 * @description:分页查询
	 */
	public List<RechargeReqDto> pageListQueryRecharge(PageVO<RechargeReqDto> pageVO,RechargeReqDto reqDto);
	
	/**
	 * @param reqDto
	 * @return
	 * @description:分页查询统计总数
	 */
	public int pageCountQueryRecharge(RechargeReqDto reqDto);
	
	/**
	 * @param id
	 * @return obj
	 * @description: 根据交易订单ID来查询订单明细
	 */
	public RechargeReqDto rechargeDetail(String id);
}
