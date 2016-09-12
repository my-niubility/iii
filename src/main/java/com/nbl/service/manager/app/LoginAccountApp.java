package com.nbl.service.manager.app;

import java.util.List;

import com.nbl.common.vo.PageVO;
import com.nbl.service.manager.dto.LoginAccountReqDto;

/**
 * @author Donald
 * @createdate 2016年5月31日
 * @version 1.0 
 * @description :管理平台用户管理接口
 */
public interface LoginAccountApp {
	
	/**
	 * @param pageVO
	 * @param reqDto
	 * @return
	 * @description:分页查询
	 */
	public List<LoginAccountReqDto> pageListQueryAccount(PageVO<LoginAccountReqDto> pageVO,LoginAccountReqDto reqDto);
	
	/**
	 * @param reqDto
	 * @return
	 * @description:分页查询统计总数
	 */
	public int pageCountQueryAccount(LoginAccountReqDto reqDto);
	
	/**
	 * @param accountName
	 * @return
	 * @description:登录账户明细查询
	 */
	public LoginAccountReqDto detailQueryAccount(String accountName);
	
	/**
	 * @param accountName
	 * @return
	 * @description:账户是否存在检查
	 */
	public boolean accountCheckQuery(String accountName);
	
	/**
	 * @param reqDto
	 * @return
	 * @description:账户增加
	 */
	public boolean accountAdd(LoginAccountReqDto reqDto);

	/**
	 * @param loginName
	 * @param newPass
	 * @return
	 * @description:修改密码
	 */
	public boolean modifyPass(String loginName,String newPass);
	

}
