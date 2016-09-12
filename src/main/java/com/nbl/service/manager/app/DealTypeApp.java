package com.nbl.service.manager.app;

import java.util.List;

import com.nbl.common.vo.PageVO;
import com.nbl.service.manager.dto.DealTypeDto;

/**
 * @author gcs
 * @createdate 2016年7月26日	
 * @version 1.0
 * 接口层的业务步骤查询接口
 */

public interface DealTypeApp {
	
	/**
	 * @param pageVO
	 * @param cb
	 * @return
	 * @description:分页查询
	 */
	public List<DealTypeDto> pageListQueryDeal(PageVO<DealTypeDto> pageVO,DealTypeDto cb);
	
	/**
	 * @param cb
	 * @return
	 * @description:分页查询统计总数
	 */
	public int pageCountQueryDeal(DealTypeDto cb);
	
}
