package com.nbl.service.business.app;

import java.util.List;

import com.nbl.service.business.dto.req.MessageReqDto;
import com.nbl.service.business.dto.res.MessageResDto;

/**
*@author:chenhongji
*@createdate：2016年8月24日 
*@version: 1.0 
*@description：用户站内消息添加、删除、查询
*/

public interface UserMessageApp {
	/**
	 * 新建消息
	 * @param reqDto
	 * @return
	 */
	public String addMessage(MessageReqDto reqDto);
	/**
	 * 删除消息(将消息status置为删除)
	 * @param reqDto
	 * @return
	 */
	public String deleteMessage(MessageReqDto reqDto);
	/**
	 * 分页查询用户信息
	 * @param reqDto
	 * @return
	 */
	List<MessageResDto> getMessagePage(MessageReqDto reqDto);
	
	/**
	 * 分页查询时获取指定条件下的消息总数
	 * @param reqDto
	 * @return
	 */
	String getMessagePageCount(MessageReqDto reqDto);
	/**
	 * 获取指定消息详情
	 * @param reqDto
	 * @return
	 */
	MessageResDto getMessage(MessageReqDto reqDto);
	/**
	 * 获取用户未读消息个数
	 * @param reqDto
	 * @return
	 */
	String getUnreadMessageCount(MessageReqDto reqDto);
	/**
	 * 将消息批量置为已读状态
	 * @param reqDto
	 * @return
	 */
	public String setMessageReadStatus(MessageReqDto reqDto);
}


