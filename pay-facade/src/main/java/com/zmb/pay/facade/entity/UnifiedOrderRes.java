package com.zmb.pay.facade.entity;

import java.io.Serializable;

/**
 * 统一下单接口的返回值
 * @author wanghui
 *
 */
public class UnifiedOrderRes implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String platPayFlowNo;
	
	private String gwPaySubmitBankFormCode;

	public String getPlatPayFlowNo() {
		return platPayFlowNo;
	}

	public void setPlatPayFlowNo(String platPayFlowNo) {
		this.platPayFlowNo = platPayFlowNo;
	}

	public String getGwPaySubmitBankFormCode() {
		return gwPaySubmitBankFormCode;
	}

	public void setGwPaySubmitBankFormCode(String gwPaySubmitBankFormCode) {
		this.gwPaySubmitBankFormCode = gwPaySubmitBankFormCode;
	}

	@Override
	public String toString() {
		return "UnifiedOrderRes [platPayFlowNo=" + platPayFlowNo + ", gwPaySubmitBankFormCode="
				+ gwPaySubmitBankFormCode + "]";
	}
	
}
