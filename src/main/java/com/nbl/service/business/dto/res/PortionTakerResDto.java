package com.nbl.service.business.dto.res;

import java.io.Serializable;
import java.util.Date;

public class PortionTakerResDto  implements Serializable {

	private static final long serialVersionUID = -2943119332541794055L;

	private String id;

	private String payPassword;

	private String registeredType;

	private String name;

	private String credentialsType;

	private String identityCardNumber;

	private Date certExpiryDate;

	private String countryId;

	private String secondaryGeoId;

	private String thirdGeoId;

	private String fourthGeoId;

	private String nickname;

	private String gender;

	private Date birthday;

	private String maritalStatus;

	private String ethnicGroup;

	private String partyAffiliation;

	private String bloodType;

	private Long height;

	private Float weight;

	private String profession;

	private String investmentExp;

	private String annualIncome;

	private String status;

	private String certStatus;

	private Date createdTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getPayPassword() {
		return payPassword;
	}

	public void setPayPassword(String payPassword) {
		this.payPassword = payPassword == null ? null : payPassword.trim();
	}

	public String getRegisteredType() {
		return registeredType;
	}

	public void setRegisteredType(String registeredType) {
		this.registeredType = registeredType == null ? null : registeredType.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getCredentialsType() {
		return credentialsType;
	}

	public void setCredentialsType(String credentialsType) {
		this.credentialsType = credentialsType == null ? null : credentialsType.trim();
	}

	public String getIdentityCardNumber() {
		return identityCardNumber;
	}

	public void setIdentityCardNumber(String identityCardNumber) {
		this.identityCardNumber = identityCardNumber == null ? null : identityCardNumber.trim();
	}

	public Date getCertExpiryDate() {
		return certExpiryDate;
	}

	public void setCertExpiryDate(Date certExpiryDate) {
		this.certExpiryDate = certExpiryDate;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId == null ? null : countryId.trim();
	}

	public String getSecondaryGeoId() {
		return secondaryGeoId;
	}

	public void setSecondaryGeoId(String secondaryGeoId) {
		this.secondaryGeoId = secondaryGeoId == null ? null : secondaryGeoId.trim();
	}

	public String getThirdGeoId() {
		return thirdGeoId;
	}

	public void setThirdGeoId(String thirdGeoId) {
		this.thirdGeoId = thirdGeoId == null ? null : thirdGeoId.trim();
	}

	public String getFourthGeoId() {
		return fourthGeoId;
	}

	public void setFourthGeoId(String fourthGeoId) {
		this.fourthGeoId = fourthGeoId == null ? null : fourthGeoId.trim();
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname == null ? null : nickname.trim();
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender == null ? null : gender.trim();
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus == null ? null : maritalStatus.trim();
	}

	public String getEthnicGroup() {
		return ethnicGroup;
	}

	public void setEthnicGroup(String ethnicGroup) {
		this.ethnicGroup = ethnicGroup == null ? null : ethnicGroup.trim();
	}

	public String getPartyAffiliation() {
		return partyAffiliation;
	}

	public void setPartyAffiliation(String partyAffiliation) {
		this.partyAffiliation = partyAffiliation == null ? null : partyAffiliation.trim();
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType == null ? null : bloodType.trim();
	}

	public Long getHeight() {
		return height;
	}

	public void setHeight(Long height) {
		this.height = height;
	}

	public Float getWeight() {
		return weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession == null ? null : profession.trim();
	}

	public String getInvestmentExp() {
		return investmentExp;
	}

	public void setInvestmentExp(String investmentExp) {
		this.investmentExp = investmentExp == null ? null : investmentExp.trim();
	}

	public String getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(String annualIncome) {
		this.annualIncome = annualIncome == null ? null : annualIncome.trim();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	public String getCertStatus() {
		return certStatus;
	}

	public void setCertStatus(String certStatus) {
		this.certStatus = certStatus == null ? null : certStatus.trim();
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

}
