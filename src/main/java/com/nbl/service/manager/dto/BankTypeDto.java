package com.nbl.service.manager.dto;

import java.io.Serializable;

/**
 * @author gcs
 * @createdate 2016年8月3日	
 * @version 1.0
 * 银行卡实体类
 */

public class BankTypeDto implements Serializable {

	
	private static final long serialVersionUID = 2446166095610877241L;

	
	private String bankType;

    private String bankName;

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType == null ? null : bankType.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

	@Override
	public String toString() {
		return "BankTypeBean [bankType=" + bankType + ", bankName=" + bankName + "]";
	}
}
