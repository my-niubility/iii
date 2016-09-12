package com.nbl.service.user.dto.res;

import java.io.Serializable;
import java.util.Date;

/**
 * @author maxinwei
 * @createdate 2016年4月11日
 * @version 1.0
 * @description :綁卡申请返回结果
 */
public class BndBnkCrdResultDto implements Serializable {

	private static final long serialVersionUID = 4424901952712721315L;
	/**
	 * 账号
	 */
	private String accountId;
	/**
	 * 綁卡流水号
	 */
	private String bindSerialNum;
	/**
	 * 应答时间
	 */
	private String respTime;

	public BndBnkCrdResultDto() {
		super();
	}

	public BndBnkCrdResultDto(String accountId, String bindSerialNum, String respTime) {
		this.accountId = accountId;
		this.bindSerialNum = bindSerialNum;
		this.respTime = respTime;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getBindSerialNum() {
		return bindSerialNum;
	}

	public void setBindSerialNum(String bindSerialNum) {
		this.bindSerialNum = bindSerialNum;
	}

	public String getRespTime() {
		return respTime;
	}

	public void setRespTime(String respTime) {
		this.respTime = respTime;
	}

	@Override
	public String toString() {
		return "BndBnkCrdResultDto [accountId=" + accountId + ", bindSerialNum=" + bindSerialNum + ", respTime="
				+ respTime + "]";
	}

}
