package com.nbl.service.manager.constant;

/**
 * @author Donald
 * @createdate 2016年5月23日
 * @version 1.0 
 * @description :令牌作用范围
 */
public enum AuthorizedTicketScope {
		ONCE("一次"),
		TIMES("次数"),
		PERIOD("一段时间"),
		SESSION("会话有效");
		
		private String value;
		
		AuthorizedTicketScope( String value ){
			this.value = value;
		}

		public String getValue() {
			return value;
		}
		
		public String toString(){
			return this.value;
		}
}
