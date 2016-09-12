package com.nbl.service.business.app;

import com.nbl.common.dto.CommRespDto;
import com.nbl.service.business.dto.req.MutiCndQryPrdsDto;
import com.nbl.service.business.dto.req.PrdDtlInfoQryDto;
import com.nbl.service.business.dto.req.PrdExhiInfoDto;

/**
 * @author Donald
 * @createdate 2016年5月13日
 * @version 1.0
 * @description :产品信息查询接口，管理平台、门户通用
 */
public interface ProductQueryApp {

	/**
	 * 产品展示信息查询
	 * 
	 * @param reqDto
	 * @return
	 * @description:根据展示类型查询需要展示的商品信息如：首页展示、推荐商品等
	 */
	public CommRespDto productExhibitionQuery(PrdExhiInfoDto reqDto);

	/**
	 * 多条件产品信息查询
	 * 
	 * @param mutiCndQryPrdsDto
	 * @return
	 */
	public CommRespDto productsMutiCondQuery(MutiCndQryPrdsDto mutiCndQryPrdsDto);
	
	/**
	 * 多条件产品信息总条数查询
	 * 
	 * @param mutiCndQryPrdsDto
	 * @return
	 */
	public String productsMutiCondCountQuery(MutiCndQryPrdsDto mutiCndQryPrdsDto);
	
	/**
	 * 产品详细信息查询
	 * 
	 * @param mutiCndQryPrdsDto
	 * @return
	 */
	public CommRespDto productDetailsQuery(PrdDtlInfoQryDto prdDtlInfoQryDto);
	
	
	

}
