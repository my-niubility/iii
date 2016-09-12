package com.nbl.service.business.dto.req;

import java.io.Serializable;

import com.nbl.service.business.constant.ProductAuditResult;
import com.nbl.service.business.constant.ProductAuditType;

public class ProductAuditReqDto implements Serializable {

	private static final long serialVersionUID = -4089188565398195312L;
	//待审核产品的Id
    private String productId;
    //审核类型(可空)
    private ProductAuditType type;
    //审核通过标识：pass表示:审核通过 ,noPass表示:审核不通过
    private ProductAuditResult passed;
    //审核人员（管理平台账户）
    private String auditUserId;
    //是否修改（可空）
    private Short isModify;
    //审核信息
    private String description;


	public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public ProductAuditType getType() {
		return type;
	}

	public void setType(ProductAuditType type) {
		this.type = type;
	}

	public String getAuditUserId() {
        return auditUserId;
    }

    public void setAuditUserId(String auditUserId) {
        this.auditUserId = auditUserId == null ? null : auditUserId.trim();
    }

    public Short getIsModify() {
        return isModify;
    }

    public void setIsModify(Short isModify) {
        this.isModify = isModify;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

	public ProductAuditResult getPassed() {
		return passed;
	}

	public void setPassed(ProductAuditResult passed) {
		this.passed = passed;
	}

    
}
