package com.nbl.service.business.dto.res;

import java.io.Serializable;

public class RateCountMsgDto implements Serializable{
	private static final long serialVersionUID = -5620693070098765045L;
	//期次
	private long  period;
	//本金
	private long  benjin;
	//利息
	private long  lixi;
	//本息（本+息）
	private long  benxi;
	
	public long getPeriod() {
		return period;
	}
	public void setPeriod(long period) {
		this.period = period;
	}
	public long getBenjin() {
		return benjin;
	}
	public void setBenjin(long benjin) {
		this.benjin = benjin;
	}
	public long getLixi() {
		return lixi;
	}
	public void setLixi(long lixi) {
		this.lixi = lixi;
	}
	public long getBenxi() {
		return benxi;
	}
	public void setBenxi(long benxi) {
		this.benxi = benxi;
	}
	@Override
	public String toString() {
		return "RateCountMsgDto [period=" + period + ", benjin=" + benjin + ", lixi=" + lixi + ", benxi=" + benxi + "]";
	}
	
}
