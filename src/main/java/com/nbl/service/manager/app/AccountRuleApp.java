package com.nbl.service.manager.app;

import java.util.List;

import com.nbl.common.vo.PageVO;
import com.nbl.service.manager.dto.AccountRuleDto;

/**
 * @author gcs
 * @createdate 2016年7月26日	
 * @version 1.0
 * 给对应的接口加记账规则接口
 */

public interface AccountRuleApp {
	
	/**
	 * @param pageVO
	 * @param reqDto
	 * @return
	 * @description:分页查询
	 */
	public List<AccountRuleDto> pageListQueryAccRule(PageVO<AccountRuleDto> pageVO,AccountRuleDto reqDto);
	
	/**
	 * @param reqDto
	 * @return
	 * @description:分页查询统计总数
	 */
	public int pageCountQueryAccRule(AccountRuleDto reqDto);
}
