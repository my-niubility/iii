package com.nbl.service.manager.app;

import java.util.List;

import com.nbl.common.vo.PageVO;
import com.nbl.service.manager.dto.GeneralParameterDto;

/**
 * @author gcs
 * @createdate 2016年7月26日	
 * @version 1.0
 * 接口对应的参数接口
 */

public interface GeneralParameterApp {
		
	/**
	 * @param pageVO
	 * @param cb
	 * @return
	 * @description:分页查询
	 */
	public List<GeneralParameterDto> pageListQueryGenParameter(PageVO<GeneralParameterDto> pageVO,GeneralParameterDto cb);
	
	/**
	 * @param cb
	 * @return
	 * @description:分页查询统计总数
	 */
	public int pageCountQueryGenParameter(GeneralParameterDto cb);
	
	/**
	 * @param id
	 * @return
	 * 根据系统参数代码来修改数据
	 * 
	 * */
	public GeneralParameterDto generalParameterDetail(Integer id);
	/**
	 * @param id code parName parValue reMark
	 * @return
	 * 根据系统参数代码来修改数据
	 * 
	 * */
	public boolean generalParameterModify(Integer id,String code,String parName,String parValue,String reMark);

	public String getValueByCode(String code);
}
