package com.nbl.service.user.dto.res;

import java.io.Serializable;
import java.util.Date;

/**
 * @author maxinwei
 * @createdate 2016年4月11日
 * @version 1.0
 * @description :用户基本信息查询结果
 */
public class UserInfoResultDto implements Serializable {

	private static final long serialVersionUID = -2362072724133362065L;
	/**
	 * 用户名称（电话）
	 */
	private String userName;
	/**
	 * 用户真实姓名
	 */
	private String name;
	/**
	 * 是否通过实名认证：1-通过，0-未通过
	 */
	private String isPassIdentify;
	/**
	 * 是否验证邮箱:1-已验证，0-未验证
	 */
	private String isCertEmail;
	/**
	 * 是否绑定银行卡:1-已绑定，0-未绑定
	 */
	private String isBindCard;
	/**
	 * 是否设置交易密码:1-已设置，0-未设置
	 */
	private String isSetTradePwd;
	/**
	 * 红包个数
	 */
	private String redEnvelopeNum;
	/**
	 * 累计收益
	 */
	private String accIncome;
	/**
	 * 代收收益
	 */
	private String intrsCpnIncome;
	/**
	 * 在途资金
	 */
	private String frozenFund;
	/**
	 * 用户昵称
	 */
	private String nickname;
	/**
	 * 用户性别
	 */
	private String gender;
    /**
     * 用户籍贯
     */
	private String countryId;
	/**
	 * 用户职业
	 */
	private String profession;
	
	private String investmentExp;

	public UserInfoResultDto(String isPassIdentify, String isCertEmail, String isBindCard, String isSetTradePwd, String redEnvelopeNum, String accIncome, String intrsCpnIncome, String frozenFund) {
		super();
		this.isPassIdentify = isPassIdentify;
		this.isCertEmail = isCertEmail;
		this.isBindCard = isBindCard;
		this.isSetTradePwd = isSetTradePwd;
		this.redEnvelopeNum = redEnvelopeNum;
		this.accIncome = accIncome;
		this.intrsCpnIncome = intrsCpnIncome;
		this.frozenFund = frozenFund;
	}

	public UserInfoResultDto() {
		super();
	}

	public String getIsPassIdentify() {
		return isPassIdentify;
	}

	public void setIsPassIdentify(String isPassIdentify) {
		this.isPassIdentify = isPassIdentify;
	}

	public String getIsCertEmail() {
		return isCertEmail;
	}

	public void setIsCertEmail(String isCertEmail) {
		this.isCertEmail = isCertEmail;
	}

	public String getIsBindCard() {
		return isBindCard;
	}

	public void setIsBindCard(String isBindCard) {
		this.isBindCard = isBindCard;
	}

	public String getIsSetTradePwd() {
		return isSetTradePwd;
	}

	public void setIsSetTradePwd(String isSetTradePwd) {
		this.isSetTradePwd = isSetTradePwd;
	}

	public String getRedEnvelopeNum() {
		return redEnvelopeNum;
	}

	public void setRedEnvelopeNum(String redEnvelopeNum) {
		this.redEnvelopeNum = redEnvelopeNum;
	}

	public String getAccIncome() {
		return accIncome;
	}

	public void setAccIncome(String accIncome) {
		this.accIncome = accIncome;
	}

	public String getIntrsCpnIncome() {
		return intrsCpnIncome;
	}

	public void setIntrsCpnIncome(String intrsCpnIncome) {
		this.intrsCpnIncome = intrsCpnIncome;
	}

	public String getFrozenFund() {
		return frozenFund;
	}

	public void setFrozenFund(String frozenFund) {
		this.frozenFund = frozenFund;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	@Override
	public String toString() {
		return "UserInfoResultDto [userName=" + userName + ", name=" + name + ", isPassIdentify=" + isPassIdentify
				+ ", isCertEmail=" + isCertEmail + ", isBindCard=" + isBindCard + ", isSetTradePwd=" + isSetTradePwd
				+ ", redEnvelopeNum=" + redEnvelopeNum + ", accIncome=" + accIncome + ", intrsCpnIncome="
				+ intrsCpnIncome + ", frozenFund=" + frozenFund + ", nickname=" + nickname + ", gender=" + gender
				+ ", countryId=" + countryId + ", profession=" + profession + ", investmentExp=" + investmentExp + "]";
	}

	
	

}
