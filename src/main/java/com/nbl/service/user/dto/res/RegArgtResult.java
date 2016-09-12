package com.nbl.service.user.dto.res;

import java.io.Serializable;

/**
 * @author maxinwei
 * @createdate 2016年4月11日
 * @version 1.0
 * @description :注册协议
 */
public class RegArgtResult implements Serializable {
	
	private static final long serialVersionUID = -2275158649065259024L;
	
	private String argtContent;
	
	public RegArgtResult(String argtContent) {
		this.argtContent = argtContent;
	}

	public String getArgtContent() {
		return argtContent;
	}

	public void setArgtContent(String argtContent) {
		this.argtContent = argtContent;
	}
	
	@Override
	public String toString() {
		return "RegArgtResult [argtContent=" + argtContent + "]";
	}

}
