package com.nbl.service.business.dto.res;

import java.io.Serializable;

/**
 * @author Donald
 * @createdate 2016年4月11日
 * @version 1.0 
 * @description :项目发布返回结果
 */
public class PublishResultDto implements Serializable {

	private static final long serialVersionUID = -6158335962434345834L;

	private boolean flag;

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	
	
}
