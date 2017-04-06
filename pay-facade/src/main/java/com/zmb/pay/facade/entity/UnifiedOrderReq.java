package com.zmb.pay.facade.entity;

import java.io.Serializable;


public class UnifiedOrderReq implements Serializable {
	
	private static final long serialVersionUID = 1L;
	//接口版本号
	private String apiVersion;
	//线上用户id
	private String uid;
	//发起请求源系统编号
	private String fromSysCode;
	//商户编号
	private String merId;
	//虚拟清算账户
	private String merPlatClearAcct;
	//支付订单渠道
	private String merOrderChl;
	//支付订单id
	private String merOrderId;
	//支付订单交易时间
	private String merOrderTime;
	//订单有效期
	private String merOrderPeriod;
	//支付订单金额
	private String merOrderAmt;
	//支付订单币种
	private String merOrderCurType;
	//支付订单交易类型
	private String merOrderTranType;
	//支付订单借贷标识
	private String merOrderCdFlag;
	//支付订单简要描述
	private String merOrderBrief;
	//所属省
    private String provinceCode;
	//所属市
	private String cityCode;
	//备注
	private String remark;
	//扩展信息
	private String extMsg;
	//支付结果通知回调html5 js方法名
	private String callBackMethod;
	//支付结果后台异步通知url
	private String asynNotifyUrl;
	//请求时间
	private String reqTime;
	//签名数据
	private String sign;
	//用户请求ip
	private String merOrderIp;
	//支付订单指定银行代码列表
	private String merOrderBankCode;
	//支付订单支付模式
	private String merOrderPayMode;
	//支付结果页面通知url
	private String pageNotifyUrl;
	//用户来源
	private String cusFrom;
	
	public String getCusFrom() {
		return cusFrom;
	}
	public void setCusFrom(String cusFrom) {
		this.cusFrom = cusFrom;
	}
	public String getMerOrderPayMode() {
		return merOrderPayMode;
	}
	public void setMerOrderPayMode(String merOrderPayMode) {
		this.merOrderPayMode = merOrderPayMode;
	}
	public String getPageNotifyUrl() {
		return pageNotifyUrl;
	}
	public void setPageNotifyUrl(String pageNotifyUrl) {
		this.pageNotifyUrl = pageNotifyUrl;
	}
	public String getMerOrderBankCode() {
		return merOrderBankCode;
	}
	public void setMerOrderBankCode(String merOrderBankCode) {
		this.merOrderBankCode = merOrderBankCode;
	}
	public String getMerOrderIp() {
		return merOrderIp;
	}
	public void setMerOrderIp(String merOrderIp) {
		this.merOrderIp = merOrderIp;
	}
	public String getApiVersion() {
		return apiVersion;
	}
	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getFromSysCode() {
		return fromSysCode;
	}
	public void setFromSysCode(String fromSysCode) {
		this.fromSysCode = fromSysCode;
	}
	public String getMerId() {
		return merId;
	}
	public void setMerId(String merId) {
		this.merId = merId;
	}
	public String getMerPlatClearAcct() {
		return merPlatClearAcct;
	}
	public void setMerPlatClearAcct(String merPlatClearAcct) {
		this.merPlatClearAcct = merPlatClearAcct;
	}
	public String getMerOrderId() {
		return merOrderId;
	}
	public void setMerOrderId(String merOrderId) {
		this.merOrderId = merOrderId;
	}
	public String getMerOrderTime() {
		return merOrderTime;
	}
	public void setMerOrderTime(String merOrderTime) {
		this.merOrderTime = merOrderTime;
	}
	public String getMerOrderPeriod() {
		return merOrderPeriod;
	}
	public void setMerOrderPeriod(String merOrderPeriod) {
		this.merOrderPeriod = merOrderPeriod;
	}
	public String getMerOrderAmt() {
		return merOrderAmt;
	}
	public void setMerOrderAmt(String merOrderAmt) {
		this.merOrderAmt = merOrderAmt;
	}
	public String getMerOrderCurType() {
		return merOrderCurType;
	}
	public void setMerOrderCurType(String merOrderCurType) {
		this.merOrderCurType = merOrderCurType;
	}
	public String getMerOrderTranType() {
		return merOrderTranType;
	}
	public void setMerOrderTranType(String merOrderTranType) {
		this.merOrderTranType = merOrderTranType;
	}
	public String getMerOrderCdFlag() {
		return merOrderCdFlag;
	}
	public void setMerOrderCdFlag(String merOrderCdFlag) {
		this.merOrderCdFlag = merOrderCdFlag;
	}
	public String getMerOrderBrief() {
		return merOrderBrief;
	}
	public void setMerOrderBrief(String merOrderBrief) {
		this.merOrderBrief = merOrderBrief;
	}
	public String getProvinceCode() {
		return provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getExtMsg() {
		return extMsg;
	}
	public void setExtMsg(String extMsg) {
		this.extMsg = extMsg;
	}
	public String getCallBackMethod() {
		return callBackMethod;
	}
	public void setCallBackMethod(String callBackMethod) {
		this.callBackMethod = callBackMethod;
	}
	public String getAsynNotifyUrl() {
		return asynNotifyUrl;
	}
	public void setAsynNotifyUrl(String asynNotifyUrl) {
		this.asynNotifyUrl = asynNotifyUrl;
	}
	public String getReqTime() {
		return reqTime;
	}
	public void setReqTime(String reqTime) {
		this.reqTime = reqTime;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public String getMerOrderChl() {
		return merOrderChl;
	}
	public void setMerOrderChl(String merOrderChl) {
		this.merOrderChl = merOrderChl;
	}
	
	@Override
	public String toString() {
		return "UnifiedOrderReq [apiVersion=" + apiVersion + ", uid=" + uid + ", fromSysCode=" + fromSysCode
				+ ", merId=" + merId + ", merPlatClearAcct=" + merPlatClearAcct + ", merOrderChl=" + merOrderChl
				+ ", merOrderId=" + merOrderId + ", merOrderTime=" + merOrderTime + ", merOrderPeriod=" + merOrderPeriod
				+ ", merOrderAmt=" + merOrderAmt + ", merOrderCurType=" + merOrderCurType + ", merOrderTranType="
				+ merOrderTranType + ", merOrderCdFlag=" + merOrderCdFlag + ", merOrderBrief=" + merOrderBrief
				+ ", provinceCode=" + provinceCode + ", cityCode=" + cityCode + ", remark=" + remark + ", extMsg="
				+ extMsg + ", callBackMethod=" + callBackMethod + ", asynNotifyUrl=" + asynNotifyUrl + ", reqTime="
				+ reqTime + ", sign=" + sign + ", merOrderIp=" + merOrderIp + ", merOrderBankCode=" + merOrderBankCode
				+ ", merOrderPayMode=" + merOrderPayMode + ", pageNotifyUrl=" + pageNotifyUrl + ", cusFrom=" + cusFrom
				+ "]";
	}
	
}
