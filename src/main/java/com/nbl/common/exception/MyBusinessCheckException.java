package com.nbl.common.exception;

import com.nbl.util.ErrCodeUtil;

/**
 * @author AlanMa
 *
 */
public class MyBusinessCheckException extends Exception {

	private static final long serialVersionUID = -8443921217049541077L;
	/**
	 * 错误编码
	 */
	private String errorCode;
	/**
	 * 错误信息
	 */
	private String errMsgKey;
	

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrMsgKey() {
		return errMsgKey;
	}

	public void setErrMsgKey(String errMsgKey) {
		this.errMsgKey = errMsgKey;
	}

	public MyBusinessCheckException(String errorCode, String... errMsgKey) {
		String[] errInfo = ErrCodeUtil.getErrMsg(errorCode, errMsgKey);
		this.errorCode = errInfo[0];
		this.errMsgKey = errInfo[1];
	}

	public MyBusinessCheckException() {
		super();
	}
	
}
