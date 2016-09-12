package com.nbl.service.manager.app;

import java.util.List;

import com.nbl.common.exception.MyBusinessCheckException;
import com.nbl.common.vo.PageVO;
import com.nbl.service.manager.dto.WithdrawReqDto;

/**
 * @author gcs
 * @createdate 2016年7月20日
 * @version 1.0
 * @description  提现订单管理接口
 * 
 * */
public interface NewWithdrawApp{
	
	/**
	 * @param pageVO
	 * @param reqDto
	 * @return
	 * @description:分页查询
	 */
	public List<WithdrawReqDto> pageListQueryWithdraw(PageVO<WithdrawReqDto> pageVO,WithdrawReqDto reqDto);
	
	/**
	 * @param reqDto
	 * @return
	 * @description:分页查询统计总数
	 */
	public int pageCountQueryWithdraw(WithdrawReqDto reqDto);
	
	/**
	 * @param id
	 * @return obj
	 * @description: 根据交易订单ID来查询订单明细
	 */
	public WithdrawReqDto withdrawDetail(String id);
}
