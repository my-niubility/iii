package com.nbl.service.manager.app;

import java.util.List;

import com.nbl.common.vo.PageVO;
import com.nbl.service.manager.dto.CustEnterpriReqDto;

/**
 * @author Donald
 * @createdate 2016年7月15日
 * @version 1.0 
 * @description :企业客户管理接口
 */
public interface CustEnterpriseApp {
	
	/**
	 * @param pageVO
	 * @param cb
	 * @return
	 * @description:分页查询
	 */
	public List<CustEnterpriReqDto> pageListQueryEnterprise(PageVO<CustEnterpriReqDto> pageVO,CustEnterpriReqDto reqDto);
	
	/**
	 * @param reqDto
	 * @return
	 * @description:分页查询统计总数
	 */
	public int pageCountQueryEnterprise(CustEnterpriReqDto reqDto);
	
	/**
	 * @param id
	 * @return
	 * @description:登录账户明细查询
	 */
	public CustEnterpriReqDto detailQueryEnterprise(String id);
	
	/**
	 * @param name  企业名称
	 * @return
	 * @description:账户是否存在检查
	 */
	public boolean enterpriseCheckQuery(String name);
	
	/**
	 * @param reqDto
	 * @return
	 * @description:账户增加
	 */
	public boolean enterpriseAdd(CustEnterpriReqDto reqDto);
}
