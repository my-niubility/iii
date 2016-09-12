package com.nbl.service.manager.app;

import java.util.List;

import com.nbl.common.vo.PageVO;
import com.nbl.service.manager.dto.PositionReqDto;

/**
 * @author gcs
 * @createdate 2016年7月22日
 * @version 1.0
 * @description  持仓管理接口
 * 
 * */

public interface PositionApp {
	/**
	 * @param pageVO
	 * @param reqDto
	 * @return
	 * @description:分页查询
	 */
	public List<PositionReqDto> pageListQueryPosition(PageVO<PositionReqDto> pageVO,PositionReqDto reqDto);
	
	/**
	 * @param reqDto
	 * @return
	 * @description:分页查询统计总数
	 */
	public int pageCountQueryPosition(PositionReqDto reqDto);
	
	/**
	 * @param id
	 * @return obj
	 * @description: 根据持仓流水ID来查询订单明细
	 */
	public PositionReqDto positionDetail(String id);
}
