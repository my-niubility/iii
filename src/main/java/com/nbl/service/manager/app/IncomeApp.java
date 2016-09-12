package com.nbl.service.manager.app;

import java.util.List;

import com.nbl.common.vo.PageVO;
import com.nbl.service.manager.dto.IncomeDto;

/**
 * @author gcs
 * @createdate 2016年7月23日
 * @version 1.0
 * @description  投资利息管理接口
 * 
 * */


public interface IncomeApp {
	
	/**
	 * @param pageVO
	 * @param reqDto
	 * @return
	 * @description:分页查询
	 */
	public List<IncomeDto> pageListQueryIncome(PageVO<IncomeDto> pageVO,IncomeDto reqDto);
	
	/**
	 * @param reqDto
	 * @return
	 * @description:分页查询统计总数
	 */
	public int pageCountQueryIncome(IncomeDto reqDto);
	
	/**
	 * @param id
	 * @return obj
	 * @description: 根据充值订单ID来查询订单明细
	 */
	public IncomeDto incomeDetail(String id);
}
