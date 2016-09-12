package com.nbl.common.constants;

public class ComConst {
	/**
	 * 逻辑True
	 */
	public static final String TRUE = "1";
	/**
	 * 逻辑False
	 */
	public static final String FALSE = "0";
	/**
	 * S-成功GATEWAY
	 */
	public static final String SUCCESS = "S";
	/**
	 * W-警告
	 */
	public static final String WARNING = "W";
	/**
	 * E-错误
	 */
	public static final String ERROR = "E";
	/**
	 * U-未知
	 */
	public static final String UNKNOWN = "U";
	/**
	 * 注册校验类型 1-手机号是否已注册
	 */
	public static final int IS_REGISTED = 1;
	/**
	 * 证件有效期默认：2106-06-06
	 */
	public static final String DEF_EXP_DATE = "2106-06-06";
	/**
	 * 暂无数据
	 */
	public static final String NULL = "null";
	/**
	 * 线程池大小
	 */
	public static final int TP_MAX = 10;

	public interface PURCH_PRD {
		/**
		 * 商品购买
		 */
		public static final String OPT_CODE = "100";
		/**
		 * 商品购买冲正
		 */
		public static final String OPT_CODE_REVERSE = "200";
		/**
		 * 创建交易订单
		 */
		public static final String TRADE_ORDER = "001";
		/**
		 * 支付
		 */
		public static final String PAY_ORDER = "002";

		// /**
		// * 资管人客户编号
		// */
		// public static final String CUST_ID_ZGPT = "ZGPT00000001";
		// /**
		// * 资管人客户姓名
		// */
		// public static final String CUST_NAME_ZGPT = "金融网销平台";
		// /**
		// * 应付账户客户编号
		// */
		// public static final String CUST_ID_YF = "YF00000001";
	}

	/**
	 * 测试模拟数据
	 * 
	 * @author AlanMa
	 *
	 */
	public interface SIM_DATA {

		/**
		 * 冲账描述
		 */
		public static final String REVERSE_DESC = "正向记账异常";
	}

}
