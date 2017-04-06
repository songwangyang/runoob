package com.zmb.pay.facade.entity;

import java.io.Serializable;

/**
 * 系统间交互的通用返回结果
 * 由报文头和报文体组成
 * @author wanghui
 *
 */
public class CommonRes implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String returnCode;
	
	private String returnMsg;
	
	private Object body;

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

	public Object getBody() {
		return body;
	}

	public void setBody(Object body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "CommonRes [returnCode=" + returnCode + ", returnMsg=" + returnMsg + ", body=" + body + "]";
	}
	
}
