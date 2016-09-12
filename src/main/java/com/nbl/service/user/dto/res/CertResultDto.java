package com.nbl.service.user.dto.res;

import java.io.Serializable;

/**
 * @author maxinwei
 * @createdate 2016年4月11日
 * @version 1.0
 * @description :用户实名认证申请返回结果
 */
public class CertResultDto implements Serializable {

	private static final long serialVersionUID = 4424901952712721315L;
	/**
	 * 账号
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

	public CertResultDto() {
		super();
	}

	public CertResultDto(String accountId, String certSerialNum, String respTime) {
		this.accountId = accountId;
		this.certSerialNum = certSerialNum;
		this.respTime = respTime;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getCertSerialNum() {
		return certSerialNum;
	}

	public void setCertSerialNum(String certSerialNum) {
		this.certSerialNum = certSerialNum;
	}

	public String getRespTime() {
		return respTime;
	}

	public void setRespTime(String respTime) {
		this.respTime = respTime;
	}

	@Override
	public String toString() {
		return "CertResultDto [accountId=" + accountId + ", certSerialNum=" + certSerialNum + ", respTime=" + respTime
				+ "]";
	}

}
