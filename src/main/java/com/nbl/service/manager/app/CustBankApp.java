package com.nbl.service.manager.app;

import java.util.List;

import com.nbl.common.vo.PageVO;
import com.nbl.service.manager.dto.CustBankReqDto;

/**
 * @author gcs
 * @createdate 2016年7月12日
 * @version 1.0 
 * @description :客户银行信息接口管理
 */

public interface CustBankApp {
	/**
	 * @param pageVO
	 * @param cb
	 * @return
	 * @description:分页查询
	 */
	public List<CustBankReqDto> pageListQueryCustBankCard(PageVO<CustBankReqDto> pageVO, CustBankReqDto cb);

	/**
	 * @param cb
	 * @return
	 * @description:分页查询统计总数
	 */
	public int pageCountQueryCustBank(CustBankReqDto cb);

	/**
	 * @param id
	 * @return obj
	 * @description: 根据客户ID查询银行卡信息
	 */
	public CustBankReqDto custBankDetail(String id);
}
