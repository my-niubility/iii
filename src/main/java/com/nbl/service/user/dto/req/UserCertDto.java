package com.nbl.service.user.dto.req;

import java.io.Serializable;

/**
 * @author maxinwei
 * @createdate 2016年4月11日
 * @version 1.0
 * @description :用户实名认证信息
 */
public class UserCertDto implements Serializable {

	private static final long serialVersionUID = -241651706409686835L;
	/**
	 * 认证流水号
	 */
	private String certSerialNum;
	/**
	 * 用户编号
	 */
	private String custId;
	/**
	 * 银行户名
	 */
	private String cardName;
	/**
	 * 身份证号
	 */
	private String identityCardNumber;
	/**
	 * 银行类别编码
	 */
	private String bankType;
	/**
	 * 卡号
	 */
	private String cardNo;
	/**
	 * 预留手机号
	 */
	private String phoneNum;
	/**
	 * 注册类型:GATEWAY-网关、 PROTAL-门户
	 */
	private String registeredType;
	/**
	 * 证件类型：P01-居民身份证、 P04-军人证、P31-护照、C01-营业执照、C09-组织机构代码证
	 */
	private String credentialsType;
	/**
	 * 创建标志：1门户创建、2管理系统创建
	 */
	private String createType;
	/**
	 * 注册IP
	 */
	private String ip;

	/**
	 * 昵称
	 */
	private String nickname;

	/**
	 * 账户类型(01：客户 02：商户)
	 */
	private String custAccType;
	
	/**
	 * 认证渠道编码001：门户网站、002：IOS手机客户端、003：Android手机客户端、004：微信、005：微博、006：其他
	 */
	private String regChanCode;

	public String getIdentityCardNumber() {
		return identityCardNumber;
	}

	public void setIdentityCardNumber(String identityCardNumber) {
		this.identityCardNumber = identityCardNumber;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getRegisteredType() {
		return registeredType;
	}

	public void setRegisteredType(String registeredType) {
		this.registeredType = registeredType;
	}

	public String getCredentialsType() {
		return credentialsType;
	}

	public void setCredentialsType(String credentialsType) {
		this.credentialsType = credentialsType;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	public String getCreateType() {
		return createType;
	}

	public void setCreateType(String createType) {
		this.createType = createType;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getCertSerialNum() {
		return certSerialNum;
	}

	public void setCertSerialNum(String certSerialNum) {
		this.certSerialNum = certSerialNum;
	}

	public String getCustAccType() {
		return custAccType;
	}

	public void setCustAccType(String custAccType) {
		this.custAccType = custAccType;
	}

	public String getRegChanCode() {
		return regChanCode;
	}

	public void setRegChanCode(String regChanCode) {
		this.regChanCode = regChanCode;
	}

	@Override
	public String toString() {
		return "UserCertDto [certSerialNum=" + certSerialNum + ", custId=" + custId + ", cardName=" + cardName + ", identityCardNumber=" + identityCardNumber + ", bankType=" + bankType + ", cardNo="
				+ cardNo + ", phoneNum=" + phoneNum + ", registeredType=" + registeredType + ", credentialsType=" + credentialsType + ", createType=" + createType + ", ip=" + ip + ", nickname="
				+ nickname + ", custAccType=" + custAccType + ", regChanCode=" + regChanCode + "]";
	}

}
