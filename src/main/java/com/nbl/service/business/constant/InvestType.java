package com.nbl.service.business.constant;

import com.nbl.common.constants.ConstantEnum;

/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0
 * @description :投资类型
 */
public enum InvestType implements ConstantEnum {

	INVEST("0", "投资"), TRANSFER("1", "协议转让"), HUA_KUAN("2", "划款"), RZR_HUANKUAN("3", "融资人还款"), ZGR_HUANKUAN("4", "资管人还款"), RZR_TUIKUAN("5", "资管人退款"), BU_TIE("6", "补贴发放");

	private String value;
	private final String displayName;

	InvestType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public static InvestType parseOf(String value) {

		for (InvestType item : values())
			if (item.getValue().equals(value))
				return item;

		return null;
	}
}
