package com.nbl.service.manager.app;

import java.util.List;

import com.nbl.common.vo.PageVO;
import com.nbl.service.manager.dto.AccountReverseDto;

/**
 * @author gcs
 * @createdate 2016年7月22日
 * @version 1.0
 * @description  冲正流水管理接口
 * 
 * */

public interface PositiveApp {

	/**
	 * @param pageVO
	 * @param reqDto
	 * @return
	 * @description:分页查询
	 */
	public List<AccountReverseDto> pageListQueryPositive(PageVO<AccountReverseDto> pageVO,AccountReverseDto reqDto);
	
	/**
	 * @param reqDto
	 * @return
	 * @description:分页查询统计总数
	 */
	public int pageCountQueryPositive(AccountReverseDto reqDto);
	
	/**
	 * @param reverseId
	 * @return obj
	 * @description: 根据充值订单ID来查询订单明细
	 */
	public AccountReverseDto positiveDetail(Integer reverseId);
}
