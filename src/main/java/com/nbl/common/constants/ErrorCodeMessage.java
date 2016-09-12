package com.nbl.common.constants;

/**
 * @author whb
 * @date 2014-7-2
 * @description：系统异常代码枚举类
 */
public enum ErrorCodeMessage {

	/** 证联支付异常  begin */
	
	PAY_SYSTEM_ERROR("PAY_000", "支付系统发生未知错误"),
	PAY_GETPRIVATEKEY_ERROR("PAY_001", "获取秘钥发生错误"),
	PAY_RESOLVE_ERROR("PAY_002", "解析返回的开户数据发生错误"),
	PAY_BINDCARD_ERROR("PAY_003", "绑卡发生错误"),
	PAY_ADDNEWCARD_ERROR("PAY_004", "新增银行卡发生错误"),
	PAY_DELETECARD_ERROR("PAY_005", "取消银行卡发生错误"),
	PAY_GATEPAYPAY_ERROR("PAY_005", "网关支付发生错误"),
	PAY_BUSINESSOPENACCOUNT_ERROR("PAY_006", "企业开户发生错误"),
	PAY_BUSINESSADDCARD_ERROR("PAY_007", "企业新增银行卡发生错误"),
	PAY_ENCRYPTED_ERROR("PAY_008", "数据加密发生错误"),
	PAY_SIGNED_ERROR("PAY_009", "数据签名发生错误"),
	
	/** 证联支付异常  end */
	
	
	
	
	
	/** 公共平台异常  begin */
	
	COMPONENT_BANKCARD_NOTEXISTS("COMPONENT_000", "银行卡不存在"),
	COMPONENT_CUST_NOTEXISTS("COMPONENT_001", "客户信息不存在"),
	COMPONENT_PAYTYPE_ERROR("COMPONENT_002", "支付方式不正确"),
	COMPONENT_BANKCARD_ERROR("COMPONENT_003", "认证时存在多个银行卡信息"),
	COMPONENT_ACCOUNT_NOTEXISTS("COMPONENT_004", "客户对应的账户信息不存在"),
	COMPONENT_IDENTITY_EXISTS("COMPONENT_005", "已存在认证通过或认证中的身份证信息"),
	COMPONENT_USERTYPE_ERROR("COMPONENT_0006", "客户类型不正确"),
	COMPONENT_FUNDTYPE_ERROR("COMPONENT_0007", "支付类型不正确"),
	COMPONENT_WRITEFILE_ERROR("COMPONENT_0008", "写文件出错"),
	COMPONENT_FILE_NOTEXISTS("COMPONENT_0009", "文件不存在"),
	COMPONENT_FILEUPLOAD_ERROR("COMPONENT_0010", "文件上传FTP出错"),
	COMPONENT_AUDIT_FINISH("COMPONENT_0011", "该银行卡已复合完成"),
	COMPONENT_CUSTAUDIT_FINISH("COMPONENT_0012", "该客户信息已复合完成"),
	COMPONENT_EMAILEXISTS("COMPONENT_0013", "该邮箱已存在"),
	COMPONENT_TRADEFILE_ERROR("COMPONENT_0014", "即不存在交易文件也不存在结算文件"),
	COMPONENT_BANKCARD_EXISTS("COMPONENT_0015", "该银行卡已存在"),
	
	
	/** 公共平台异常  end */
	
	
	
	
	
	
	/** 业务系统异常 begin */
	BUSINESS_ORDER_OUTOFDATE("BUSINESS_000", "订单过期"),
	BUSINESS_ORDER_STATUSERROR("BUSINESS_001", "订单状态不正确"),
	BUSINESS_PAYMENT_STATUSERROR("BUSINESS_002", "订单状态不正确"),
	BUSINESS_PAYMENT_NOTEXISTS("BUSINESS_003", "支付订单不存在"),
	BUSINESS_TRANSFERSTATUS_ERROR("BUSINESS_004", "订单转让状态不正确"),
	BUSINESS_FOUNDSPAYSTATUS_ERROR("BUSINESS_005", "资金划付支付状态不正确"),
	BUSINESS_FOUNDSSTATUS_ERROR("BUSINESS_006", "资金划付状态不正确"),
	BUSINESS_ACCOUNTNOTEXISTS_ERROR("BUSINESS_007", "不存在对应的虚户信息"),
	BUSINESS_PORTION_ZERO("BUSINESS_008", "购买失败，投资份额已卖完"),
	BUSINESS_PORTION_NOTENOUGH("BUSINESS_009", "购买失败，投资份额大于资管人剩余份额"),
	BUSINESS_POSITION_NULL("BUSINESS_010", "没有查询到对应的持仓信息"),
	BUSINESS_NOTESTABLISH("BUSINESS_011", "项目没有成立，不能进行划款操作"),
	BUSINESS_ASSETREPAYSTATUS_ERROR("BUSINESS_012", "资管人划款状态不正确，不能进行划款操作"),
	BUSINESS_REPAYISFINISH_FINISH("BUSINESS_013", "已完成还款"),
	BUSINESS_REPAYISFINISH_PAYING("BUSINESS_014", "还款中"),
	BUSINESS_FINANCEREPAY_NOTEXISTS("BUSINESS_015", "不存在对应的融资人还款信息"),
	BUSINESS_COLLECT_NOTFAILURE("BUSINESS_016", "项目不是募集失败状态，不能进行退款操作"),
	BUSINESS_ASSETREFUNDSTATUS_ERROR("BUSINESS_017", "资管人退款状态不正确，不能进行退款操作"),
	BUSINESS_PROJECTSTATUS_ERROR("BUSINESS_018", "项目状态不正确，不能进行审核操作"),
	BUSINESS_PROJECT_LOCKSCALE("BUSINESS_019", "项目锁定份额不正确"),
	BUSINESS_PROJECT_NOTENOUGH("BUSINESS_020", "投资份额大于锁定份额"),
	BUSINESS_MISTAKE_HANDLE_ERROR("BUSINESS_021","支付订单差错处理失败"),
	BUSINESS_SEND_SETTLE_ERROR("BUSINESS_022","商户发送结算文件异常"),
	BUSINESS_SETTLE_ACCOUNT_FLAG_RROR("BUSINESS_023","结算状态不正确"),
	BUSINESS_SUBSIDYSTATUS_ERROR("BUSINESS_024", "项目补贴发放状态不正确"),
	BUSINESS_TRADETOTAL_ERROR("BUSINESS_025", "查询出的交易汇总记录不正确"),
	BUSINESS_PENDINGREPAY_ERROR("BUSINESS_026", "项目状态不正确，不是待还款状态"),
	
	/** 业务系统异常 end */
	
	/** 门户系统异常 begin */
	PORTAL_STRING_ENCRYPTION("PORTAL_1005","字符串加密异常"),
	/** 门户系统异常 end */
	
	/**账务系统异常定义**/
	ACCOUNT_000_ERROR("ACCOUNT_000", "账务系统发生未知错误"),
	ACCOUNT_001_ERROR("ACCOUNT_001", "该科目不存在"),
	ACCOUNT_002_ERROR("ACCOUNT_002", "该二级科目不正确"),
	ACCOUNT_003_ERROR("ACCOUNT_003", "该客户的这个二级科目账户已存在"),
	ACCOUNT_004_ERROR("ACCOUNT_004", "该账户非正常状态"),
	ACCOUNT_005_ERROR("ACCOUNT_005", "根据客户编号和二级科目无法查询到账户"),
	ACCOUNT_006_ERROR("ACCOUNT_006", "无法查询到对应的记账规则"),
	ACCOUNT_007_ERROR("ACCOUNT_007", "该记账规则配置错误"),
	ACCOUNT_008_ERROR("ACCOUNT_008", "账户余额不足"),
	ACCOUNT_009_ERROR("ACCOUNT_009", "账户不存在"),
	ACCOUNT_010_ERROR("ACCOUNT_010", "记账金额不能小于或等于零"),
	ACCOUNT_011_ERROR("ACCOUNT_011", "记账接口调用错误，AccountBookDTO为空"),
	ACCOUNT_012_ERROR("ACCOUNT_012", "账户信息不正确"),
	ACCOUNT_013_ERROR("ACCOUNT_013", "数据格式错误"),
	ACCOUNT_014_ERROR("ACCOUNT_014", "根据交易订单号找不到对应的支付订单"),
	ACCOUNT_015_ERROR("ACCOUNT_015", "冲正金额与原支付金额不符"),
	ACCOUNT_016_ERROR("ACCOUNT_016", "客户类型错误"),
	ACCOUNT_017_ERROR("ACCOUNT_017", "记账类型错误"),
	ACCOUNT_018_ERROR("ACCOUNT_018", "记账来源字段错误"),
	ACCOUNT_019_ERROR("ACCOUNT_019", "该记账流水已冲正"),
	ACCOUNT_020_ERROR("ACCOUNT_020","调用管理系统失败"),
	ACCOUNT_021_ERROR("ACCOUNT_021","根据支付订单号找不到对应的记账流水"),
	ACCOUNT_022_ERROR("ACCOUNT_022","根据支付订单号找不到对应的冲正接口流水"),
	ACCOUNT_023_ERROR("ACCOUNT_023","查询条件不能为空，传入对象为空！"),
	ACCOUNT_024_ERROR("ACCOUNT_024","查询条件不能为空,ruleId为空！"),
	ACCOUNT_025_ERROR("ACCOUNT_025","查询条件不能为空,付款方借贷类型为空！"),
	ACCOUNT_026_ERROR("ACCOUNT_026","查询条件不能为空,收款方借贷类型为空！"),
	ACCOUNT_027_ERROR("ACCOUNT_027","收款方和付款方的借贷类型不能相同！"),
	ACCOUNT_028_ERROR("ACCOUNT_028","获取当前记账日期出错！"),
	ACCOUNT_029_ERROR("ACCOUNT_029","参数不能为空"),
	ACCOUNT_030_ERROR("ACCOUNT_030","授信记录不存在"),
	ACCOUNT_031_ERROR("ACCOUNT_031","授信余额不足"),
	ACCOUNT_032_ERROR("ACCOUNT_032","额度降低为负"),
	
	;
	
	private String value;
	private final String displayName;
	
	ErrorCodeMessage( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static ErrorCodeMessage parseOf( String value ){
		
		for ( ErrorCodeMessage item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
