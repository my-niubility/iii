package com.nbl.common.dto;

import java.io.Serializable;

import com.nbl.common.constants.ComConst;

/**
 * 公共返回信息
 * 
 * @author AlanMa
 *
 */
public class CommRespDto implements Serializable {

	private static final long serialVersionUID = -4367099412665883386L;

	private ResIdentifier resIdentifier;

	private Object data;

	public CommRespDto() {
		super();
	}
	
	public CommRespDto(Object data) {
		super();
		this.data = data;
	}

	public void setResIdentifier(ResIdentifier resIdentifier) {
		this.resIdentifier = resIdentifier;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public ResIdentifier getResIdentifier() {
		return resIdentifier;
	}

	public Object getData() {
		return data;
	}

	public CommRespDto success(Object data) {
		this.data = data;
		this.success();
		return this;
	}

	public CommRespDto success(Object data, String reuturnCode, String returnMsg) {
		this.data = data;
		this.success(reuturnCode, returnMsg);
		return this;
	}

	public CommRespDto success() {
		this.resIdentifier = new ResIdentifier().success();
		return this;
	}

	public CommRespDto success(String reuturnCode, String returnMsg) {
		this.resIdentifier = new ResIdentifier().success(reuturnCode, returnMsg);
		return this;
	}

	public CommRespDto fail(String reuturnCode, String returnMsg) {
		this.resIdentifier = new ResIdentifier().fail(reuturnCode, returnMsg);
		return this;
	}

	public CommRespDto warning(String reuturnCode, String returnMsg) {
		this.resIdentifier = new ResIdentifier().fail(reuturnCode, returnMsg);
		return this;
	}

	public CommRespDto unknown(String reuturnCode, String returnMsg) {
		this.resIdentifier = new ResIdentifier().fail(reuturnCode, returnMsg);
		return this;
	}

	// 内部类封装返回数据
	public class ResIdentifier implements Serializable {

		private static final long serialVersionUID = 3649933597185002561L;
		/**
		 * S-成功；W-警告；E-错误；U-未知
		 */
		private String returnType;
		/**
		 * W-警告、E-错误、U-未知时此项不为空，S-成功非必输
		 */
		private String returnCode;
		/**
		 * W-警告、E-错误、U-未知时此项不为空，S-成功非必输
		 */
		private String returnMsg;

		public ResIdentifier() {
		}

		public ResIdentifier success() {
			this.returnType = ComConst.SUCCESS;
			this.returnCode = "S00001";
			this.returnMsg = "SUCCESS";
			return this;
		}

		public ResIdentifier success(String reuturnCode, String returnMsg) {
			this.returnType = ComConst.SUCCESS;
			this.returnCode = reuturnCode;
			this.returnMsg = returnMsg;
			return this;
		}

		public ResIdentifier fail(String reuturnCode, String returnMsg) {
			this.returnType = ComConst.ERROR;
			this.returnCode = reuturnCode;
			this.returnMsg = returnMsg;
			return this;
		}

		public ResIdentifier warning(String reuturnCode, String returnMsg) {
			this.returnType = ComConst.WARNING;
			this.returnCode = reuturnCode;
			this.returnMsg = returnMsg;
			return this;
		}

		public ResIdentifier unknown(String reuturnCode, String returnMsg) {
			this.returnType = ComConst.UNKNOWN;
			this.returnCode = reuturnCode;
			this.returnMsg = returnMsg;
			return this;
		}

		public String getReturnType() {
			return returnType;
		}

		public void setReturnType(String returnType) {
			this.returnType = returnType;
		}

		public String getReturnCode() {
			return returnCode;
		}

		public void setReturnCode(String returnCode) {
			this.returnCode = returnCode;
		}

		public String getReturnMsg() {
			return returnMsg;
		}

		public void setReturnMsg(String returnMsg) {
			this.returnMsg = returnMsg;
		}

		@Override
		public String toString() {
			return "ResIdentifier [returnType=" + returnType + ", returnCode=" + returnCode + ", returnMsg=" + returnMsg
					+ "]";
		}

	}

	@Override
	public String toString() {
		return "CommRespDto [resIdentifier=" + resIdentifier + ", data=" + (data!=null?data.toString():data) + "]";
	}

}
