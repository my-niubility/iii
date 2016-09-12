package com.nbl.service.manager.app;

import java.util.List;

import com.nbl.common.vo.PageVO;
import com.nbl.service.manager.dto.CustPersonReqDto;
import com.nbl.service.manager.dto.PersonAndUserReqDto;
import com.nbl.service.user.dto.req.CustPersonReqUpDto;


/**
 * @author gcs
 * @createdate 2016年7月11日
 * @version 1.0 
 * @description :个人客户管理平台接口
 */

public interface CustPersonApp {
	/**
	 * @param pageVO
	 * @param reqDto
	 * @return
	 * @description:分页查询
	 */
	public List<PersonAndUserReqDto> pageListQueryCustPerson(PageVO<PersonAndUserReqDto> pageVO,PersonAndUserReqDto reqDto);

	/**
	 * @param reqDto
	 * @return
	 * @description:分页查询统计总数
	 */
	public int pageCountQueryCustPerson(PersonAndUserReqDto reqDto);
	
	/**
	 * @param identityCardNumber
	 * @return obj
	 * @description: 根据身份证号查询个人客户明细
	 */
	public PersonAndUserReqDto custPersonDetail(String identityCardNumber);
	
	/**
	 * @param cb
	 * @return
	 * @description:查询所有客户Id
	 */
	public List<CustPersonReqDto> listQueryCustPersonId();
	
	public CustPersonReqDto getCustPerDetail(String custId);
	
	/**
	 * 统计所有渠道个数
	 * */
	public List<CustPersonReqDto> listCount();
	/**
	 * 统计上月所有渠道个数
	 * */
	public List<CustPersonReqDto> listLastMonthCount();
	/**
	 * 统计本月所有渠道个数
	 * */
	public List<CustPersonReqDto> listMonthCount();
	/**
	 * 统计本周所有渠道个数
	 * */
	public List<CustPersonReqDto> listWeekCount();
	
	/**
	 * 统计所有省份注册人数
	 * */
	public List<CustPersonReqDto> listAreaCount();
	/**
	 * 统计上月所有省份注册人数
	 * */
	public List<CustPersonReqDto> listLastMonthAreaCount();
	/**
	 * 统计本月所有省份注册人数
	 * */
	public List<CustPersonReqDto> listMonthAreaCount();
	/**
	 * 统计本周所有省份注册人数
	 * */
	public List<CustPersonReqDto> listWeekAreaCount();
	
	/**
	 * 更新客户基本信息
	 * @param custPerson
	 * @return
	 */
	public String updateCustCommonInfo(CustPersonReqUpDto custPersonReqUpDto);

	
}