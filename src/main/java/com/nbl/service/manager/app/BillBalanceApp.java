package com.nbl.service.manager.app;

import java.util.List;

import com.nbl.common.vo.PageVO;
import com.nbl.service.manager.dto.BillBalanceReqDto;

/**
 * @author gcs
 * @createdate 2016年7月25日	
 * @version 1.0
 * 
 */
public interface BillBalanceApp {

	/**
	 * @param pageVO
	 * @param reqDto
	 * @return
	 * @description:分页查询
	 */
	public List<BillBalanceReqDto> pageListQueryBalance(PageVO<BillBalanceReqDto> pageVO,BillBalanceReqDto reqDto);
	
	/**
	 * @param reqDto
	 * @return
	 * @description:分页查询统计总数
	 */
	public int pageCountQueryBalance(BillBalanceReqDto reqDto);
	
	/**
	 * @param id
	 * @return obj
	 * @description: 根据交易订单ID来查询订单明细
	 */
	public BillBalanceReqDto BalanceDetail(Integer id);
}
