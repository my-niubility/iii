package com.nbl.service.user.app;

import com.nbl.common.dto.CommRespDto;
import com.nbl.common.exception.MyBusinessCheckException;
import com.nbl.service.user.dto.req.UserInfoDto;
import com.nbl.service.user.dto.req.UserLoginDto;
import com.nbl.service.user.dto.res.RegArgtResult;
import com.nbl.service.user.dto.res.RegChkResultDto;

/**
 * @author maxinwei
 * @createdate 2016骞�4鏈�19鏃�
 * @version 1.0
 * @description :鐢ㄦ埛娉ㄥ唽
 */
public interface RegisteUserApp {
	
	/**
	 * 鐢ㄦ埛娉ㄥ唽鎻愪氦
	 * @param userInfoDto
	 * @return
	 */
	public CommRespDto registeUserApp(UserInfoDto userInfoDto);
	/**
	 * 鏍￠獙鎵嬫満鍙锋槸鍚﹀凡娉ㄥ唽
	 * @param phoneNum
	 * @return
	 */
	public RegChkResultDto isRegistedApp(String phoneNum);
	/**
	 * 鐢ㄦ埛鐧诲綍
	 * @param loginInfo
	 * @return
	 */
	public CommRespDto loginApp(UserLoginDto loginInfo);
	/**
	 * 娉ㄥ唽淇℃伅鏌ヨ
	 * @return
	 */
	public RegArgtResult getRegAgrt();
	
	/**
	 * 鐧诲綍娆℃暟瓒呴檺瑙ｉ攣
	 * 
	 * @return
	 */
	public CommRespDto resetLgnErrNum(String time);
	
}
