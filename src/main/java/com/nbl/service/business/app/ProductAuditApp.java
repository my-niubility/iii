package com.nbl.service.business.app;

import com.nbl.service.business.dto.req.ProductAuditReqDto;

/**
 * @author Donald
 * @createdate 2016年5月13日
 * @version 1.0 
 * @description :产品审核接口，包括产品发布审核、产品募集成立后审核等
 */
public interface ProductAuditApp {
	
	/**
	 * @param reqDto
	 * @return
	 * @description:产品发布审核
	 */
	public boolean productPublishAudit(ProductAuditReqDto reqDto);
	
	/**
	 * @param reqDto
	 * @return
	 * @description:产品募集成立后审核
	 */
	public boolean productEstablishAudit(ProductAuditReqDto reqDto);

}
