package com.nbl.service.business.dto.res;

import java.io.Serializable;
import java.util.List;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :
 */
public class RateCountUtilResponseDto implements Serializable{
	private static final long serialVersionUID = -3819950926615761375L;
	//总收入
	private long total_lixi;
	//各期本金、利息明细信息
	private List<RateCountMsgDto> list;
	public long getTotal_lixi() {
		return total_lixi;
	}
	public void setTotal_lixi(long total_lixi) {
		this.total_lixi = total_lixi;
	}
	public List<RateCountMsgDto> getList() {
		return list;
	}
	public void setList(List<RateCountMsgDto> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "RateCountUtilResponseDto [total_lixi=" + total_lixi + ", list=" + list + "]";
	}
	
}
