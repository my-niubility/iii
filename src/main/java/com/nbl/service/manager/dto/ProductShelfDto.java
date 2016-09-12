package com.nbl.service.manager.dto;

import java.io.Serializable;

public class ProductShelfDto implements Serializable {
	
	private static final long serialVersionUID = 5331000047235355963L;

	private String productId;
	
	private String productName;
	
    private String shelfNum;

    private String status;
    
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getShelfNum() {
		return shelfNum;
	}

	public void setShelfNum(String shelfNum) {
		this.shelfNum = shelfNum;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ProductShelfDto [productId=" + productId + ", productName=" + productName + ", shelfNum=" + shelfNum
				+ ", status=" + status + "]";
	}



}
