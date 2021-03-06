package com.nbl.service.user.dto.req;

import java.io.Serializable;

public class CertNoticeDto implements Serializable {

	private static final long serialVersionUID = 4487777236993663253L;

	/**
	 * 账户编号
	 */
	private String accountId;
	/**
	 * 认证流水号
	 */
	private String certSerialNum;
	/**
	 * 应答时间
	 */
	private String respTime;
	/**
	 * S-成功；W-警告；E-错误；U-未知
	 */
	private String returnType;
	/**
	 * W-警告、E-错误、U-未知时此项不为空
	 */
	private String returnCode;
	/**
	 * W-警告、E-错误、U-未知时此项不为空
	 */
	private String returnMsg;

	public String getCertSerialNum() {
		return certSerialNum;
	}

	public void setCertSerialNum(String certSerialNum) {
		this.certSerialNum = certSerialNum;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getReturnType() {
		return returnType;
	}

	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}

	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public String getReturnMsg() {
		return returnMsg;
	}

	public void setReturnMsg(String returnMsg) {
		this.returnMsg = returnMsg;
	}

	public String getRespTime() {
		return respTime;
	}

	public void setRespTime(String respTime) {
		this.respTime = respTime;
	}

	@Override
	public String toString() {
		return "CertNoticeDto [accountId=" + accountId + ", certSerialNum=" + certSerialNum + ", respTime=" + respTime
				+ ", returnType=" + returnType + ", returnCode=" + returnCode + ", returnMsg=" + returnMsg + "]";
	}

}
