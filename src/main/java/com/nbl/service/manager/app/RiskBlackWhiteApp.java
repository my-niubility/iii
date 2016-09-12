package com.nbl.service.manager.app;

import java.util.List;

import com.nbl.common.vo.PageVO;
import com.nbl.service.manager.dto.RiskBlackWhiteDto;

/**
 * @author gcs
 * @createdate 2016年8月3日	
 * @version 1.0
 * 接口层对应黑白名单接口管理
 */

public interface RiskBlackWhiteApp {
	
	/**
	 * @param pageVO
	 * @param cb
	 * @return
	 * @description:分页查询
	 */
	public List<RiskBlackWhiteDto> pageListQueryBlackWhite(PageVO<RiskBlackWhiteDto> pageVO,RiskBlackWhiteDto cb);
	
	/**
	 * @param cb
	 * @return
	 * @description:分页查询统计总数
	 */
	public int pageCountQueryBlackWhite(RiskBlackWhiteDto cb);
}
