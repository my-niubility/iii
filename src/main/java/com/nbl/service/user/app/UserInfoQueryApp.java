package com.nbl.service.user.app;

import java.util.List;

import com.nbl.common.dto.CommRespDto;
import com.nbl.service.user.dto.req.BalanceInfoQueryDto;
import com.nbl.service.user.dto.req.UserInfoQueryDto;
import com.nbl.service.user.dto.res.BalanceInfoResultDto;

/**
 * @author AlanMa
 * @createdate 2016年5月20日
 * @version 1.0
 * @description :用户注册
 */
public interface UserInfoQueryApp {
	/**
	 * 用户基本信息查询
	 * @param userInfoDto
	 * @return
	 */
	public CommRespDto queryCustCenterInfo(UserInfoQueryDto userInfoQueryDto);
	/**
	 * 用户可用余额查询
	 * @param userInfoDto
	 * @return
	 */
	public BalanceInfoResultDto queryUsableBalance(BalanceInfoQueryDto balanceInfoQueryDto);
	
	/**
	 * 获取所有用户的custId
	 * @return
	 */
	public List<String> queryAllCustId();
	
	
}
