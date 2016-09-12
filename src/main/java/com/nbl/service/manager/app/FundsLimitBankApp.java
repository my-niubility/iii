package com.nbl.service.manager.app;

import java.util.List;

import com.nbl.common.vo.PageVO;
import com.nbl.service.manager.dto.FundsLimitBankDto;

/**
 * @author gcs
 * @createdate 2016年8月3日	
 * @version 1.0
 * 银行资金限额对应的接口
 */

public interface FundsLimitBankApp {
	/**
	 * @param pageVO
	 * @param reqDto
	 * @return
	 * @description:分页查询
	 */
	public List<FundsLimitBankDto> pageListQueryFundsLimit(PageVO<FundsLimitBankDto> pageVO,FundsLimitBankDto reqDto);
	
	/**
	 * @param reqDto
	 * @return
	 * @description:分页查询统计总数
	 */
	public int pageCountQueryFundsLimit(FundsLimitBankDto reqDto);
}
