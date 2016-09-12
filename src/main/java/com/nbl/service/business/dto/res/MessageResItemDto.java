package com.nbl.service.business.dto.res;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
*@author:chenhongji
*@createdate：2016年9月6日 
*@version: 1.0 
*/

public class MessageResItemDto implements Serializable{

	private static final long serialVersionUID = -3600675648806174092L;
	private List<MessageResDto> messageResDtos ;
	public List<MessageResDto> getMessageResDtos() {
		return messageResDtos;
	}
	public void setMessageResDtos(List<MessageResDto> messageResDtos) {
		this.messageResDtos = messageResDtos;
	}
	public MessageResItemDto() {
		super();
		messageResDtos = new ArrayList<MessageResDto>();
	}
	public MessageResItemDto(List<MessageResDto> messageResDtos) {
		super();
		this.messageResDtos = new ArrayList<MessageResDto>();
		this.messageResDtos.addAll(messageResDtos);
	}
	public void addAll(List<MessageResDto> messageResDto){
		if(messageResDto !=null){
			this.messageResDtos.addAll(messageResDto);
		}
	}
	@Override
	public String toString() {
		return "MessageResItemDto [messageResDtos=" + messageResDtos.toString() + "]";
	}
	
	
	
	

}


