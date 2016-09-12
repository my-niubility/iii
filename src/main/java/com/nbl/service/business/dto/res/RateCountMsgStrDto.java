package com.nbl.service.business.dto.res;

import java.io.Serializable;

public class RateCountMsgStrDto implements Serializable {

	private static final long serialVersionUID = -1086507316710017677L;
	// 期次
	private String period;
	// 本金
	private String benjin;
	// 利息
	private String lixi;
	// 本息（本+息）
	private String benxi;

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getBenjin() {
		return benjin;
	}

	public void setBenjin(String benjin) {
		this.benjin = benjin;
	}

	public String getLixi() {
		return lixi;
	}

	public void setLixi(String lixi) {
		this.lixi = lixi;
	}

	public String getBenxi() {
		return benxi;
	}

	public void setBenxi(String benxi) {
		this.benxi = benxi;
	}

	@Override
	public String toString() {
		return "RateCountMsgDto [period=" + period + ", benjin=" + benjin + ", lixi=" + lixi + ", benxi=" + benxi + "]";
	}

}
