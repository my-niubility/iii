package com.nbl.service.manager.app;

import java.util.List;

import com.nbl.common.vo.PageVO;
import com.nbl.service.business.dto.req.StandardProductQueryDto;

/**
 * @author Donald
 * @createdate 2016年7月21日
 * @version 1.0 
 * @description :管理平台产品查询专用 服务
 */
public interface StandardProductQueryApp {
	
	/**
	 * @param pageVO
	 * @param reqDto
	 * @return
	 * @description:标准产品分页查询
	 */
	public List<StandardProductQueryDto> pageListQueryStProduct(PageVO<StandardProductQueryDto> pageVO,StandardProductQueryDto reqDto);
	
	/**
	 * @param reqDto
	 * @return
	 * @description:分页查询总数
	 */
	public int pageCountQueryStProduct(StandardProductQueryDto reqDto);
	
	/**
	 * @param chargeId
	 * @return
	 * @description:标准产品明细查询
	 */
	public StandardProductQueryDto detailQuery(String productId);


}
