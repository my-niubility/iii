package com.nbl.service.business.dto.res;

import java.io.Serializable;

public class CustSimplInfoResDto implements Serializable {

	private static final long serialVersionUID = 2254661596756897052L;

	private String custName;

	private String assetCustName;


	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getAssetCustName() {
		return assetCustName;
	}

	public void setAssetCustName(String assetCustName) {
		this.assetCustName = assetCustName;
	}

	@Override
	public String toString() {
		return "CustSimplInfoResDto [custName=" + custName + ", assetCustName=" + assetCustName + "]";
	}


}
