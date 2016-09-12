package com.nbl.service.user.dto.res;

import java.io.Serializable;

/**
 * @author maxinwei
 * @createdate 2016年4月11日
 * @version 1.0
 * @description :校验注册信息返回结果
 */
public class RegChkResultDto implements Serializable {
	
	private static final long serialVersionUID = -2275158649065259024L;
	
	private String isRegisted;
	
	public RegChkResultDto(String isRegisted) {
		this.isRegisted = isRegisted;
	}
	
	public String getIsRegisted() {
		return isRegisted;
	}

	public void setIsRegisted(String isRegisted) {
		this.isRegisted = isRegisted;
	}

}
