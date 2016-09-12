package com.nbl.service.user.dto.res;

import java.io.Serializable;
import java.util.Date;

public class SerialRefResultDto implements Serializable {

	private static final long serialVersionUID = 4538788326357437767L;

	private String serialId;

	private String refId;

	private String recFlag;

	private Date createTime;

	private Date updateTime;

	private String returnCode;

	private String returnMessage;

	private String remark;

	public String getSerialId() {
		return serialId;
	}

	public void setSerialId(String serialId) {
		this.serialId = serialId == null ? null : serialId.trim();
	}

	public String getRefId() {
		return refId;
	}

	public void setRefId(String refId) {
		this.refId = refId == null ? null : refId.trim();
	}

	public String getRecFlag() {
		return recFlag;
	}

	public void setRecFlag(String recFlag) {
		this.recFlag = recFlag == null ? null : recFlag.trim();
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode == null ? null : returnCode.trim();
	}

	public String getReturnMessage() {
		return returnMessage;
	}

	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage == null ? null : returnMessage.trim();
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}

	@Override
	public String toString() {
		return "SerialRefResultDto [serialId=" + serialId + ", refId=" + refId + ", recFlag=" + recFlag
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + ", returnCode=" + returnCode
				+ ", returnMessage=" + returnMessage + ", remark=" + remark + "]";
	}
}
