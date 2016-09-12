package com.nbl.service.business.constant;

/**
 * @author AlanMa
 * @createdate 2016年5月9日
 * @version 1.0
 * @description :普通参数表中CODE值
 */
public enum ParamKeys {

	DIS_TORD_TIME("disTordTime", "交易订单失效时间(分钟)"), 
	LOG_LOC_TIME("loginLockTime", "登录错误次数超限锁定时间(分钟)"),
	CUST_ID_ZGPT("custIdZgpt", "资管人编号"), 
	CUST_NAME_ZGPT("custNameZgpt", "资管人名称"), 
	MERCHANT_ID_ZLZB("merchantIdZlzb", "证联资本支付商户号"),
	ACCOUNT_ID_ZLZB("accountIdZlzb", "证联资本支付账号"),
	CUST_ID_YF("custIdYf", "应付账户客户编号"),
	MCC_URL("msgCertCodeUrl", "短信网关地址"),
	MCC_UN("msgCertCodeUN", "短信网关用户名"),
	MCC_PWD("msgCertCodePWD", "短信网关密码"),
	MCC_CONT("msgCertCodeCont", "短信网关提示信息"),
	MCC_MODE("msgCertCodeMode","短信网关模式"),
	
	SMT_REG("staMsgTitReg","注册成功后站内信标题"),
	SMC_REG("staMsgContReg","注册成功后站内信内容"),
	
	SMTS_CERT("staMsgTitSuCert","实名认证成功后站内信标题"),
	SMCS_CERT("staMsgContSuCert","实名认证成功后站内信内容"),
	
	SMTF_CERT("staMsgTitFiCert","实名认证失败后站内信标题"),
	SMCF_CERT("staMsgContFiCert","实名认证失败后站内信内容"),
	
	SMTS_RCH("staMsgTitSuRch","充值成功后站内信标题"),
	SMCS_RCH("staMsgContSuRch","充值成功后站内信内容"),
	
	SMTF_RCH("staMsgTitFiRch","充值失败后站内信标题"),
	SMCF_RCH("staMSgContFiRch","充值失败后站内信内容"),
	
	SMTS_BUY("staMsgTitSuBuy","购买成功后站内信标题"),
	SMCS_BUY("staMsgContSuBuy","购买成功后站内信内容"),
	
	SMTF_BUY("staMsgTitFiBuy","购买失败后站内信标题"),
	SMCF_BUY("staMSgContFiBuy","购买失败后站内信内容"),
	
	SMTS_WTH("staMsgTitSuWth","提现成功后站内信标题"),
	SMCS_WTH("staMsgContSuWth","提现成功后站内信内容"),
	
	SMTF_WTH("staMsgTitFiWth","提现失败后站内信标题"),
	SMCF_WTH("staMSgContFiWth","提现失败后站内信内容");
	
	
	
	private String value;
	private final String displayName;

	ParamKeys(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public static ParamKeys parseOf(String value) {

		for (ParamKeys item : values())
			if (item.getValue().equals(value))
				return item;

		return null;
	}
}
