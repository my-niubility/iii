package com.nbl.service.business.app;

import com.nbl.service.business.dto.req.PublishSolarFinanceDto;
import com.nbl.service.business.dto.req.PublishSolarProductDto;
import com.nbl.service.business.dto.req.PublishSolarProjectDto;
import com.nbl.service.business.dto.req.PublishSolarRentDto;
import com.nbl.service.business.dto.req.PublishStandardProductDto;
import com.nbl.service.business.dto.res.PublishResultDto;
/**
 * @author Donald
 * @createdate 2016年4月11日
 * @version 1.0 
 * @description :产品发布对外接口
 */
public interface PublishProductApp {

	/**
	 * @param productDto
	 * @param projectDto
	 * @param financeDto
	 * @param rentDto
	 * @return
	 * @description:光能产品发布接口
	 */
	public PublishResultDto publishSolarProduct(PublishSolarProductDto productDto,
			PublishSolarProjectDto projectDto,PublishSolarFinanceDto financeDto,PublishSolarRentDto rentDto);
	
	/**
	 * @param standardDto
	 * @return
	 * @description:标准产品发布接口
	 */
	public PublishResultDto publishStandardProduct(PublishStandardProductDto standardDto);
}
