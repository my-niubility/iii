package com.nbl.service.manager.app;

import java.util.List;

import com.nbl.common.vo.PageVO;
import com.nbl.service.manager.dto.BankTypeDto;

/**
 * @author gcs
 * @createdate 2016年8月3日	
 * @version 1.0
 * 接口模块对应的银行卡类别接口
 */

public interface BankTypeApp {
	
	/**
	 * @param pageVO
	 * @param cb
	 * @return
	 * @description:分页查询
	 */
	public List<BankTypeDto> pageListQueryBankType(PageVO<BankTypeDto> pageVO,BankTypeDto reqDto);
	
	/**
	 * @param cb
	 * @return
	 * @description:分页查询统计总数
	 */
	public int pageCountQueryBankType(BankTypeDto reqDto);
}
