package com.zmb.pay.facade.service;

import com.zmb.pay.facade.entity.CommonRes;
import com.zmb.pay.facade.entity.UnifiedOrderReq;
import com.zmb.pay.facade.entity.UnifiedOrderRes;

/**
 * 支付对外暴露的接口
 * @author wanghui
 *
 */
public interface PayFacadeService {
	
	/**
	 * 统一支付下单接口
	 * 调用支付的所有下单请求都通过该接口完成
	 * @param req : 下单的请求参数
	 * @return
	 */
	public CommonRes unifiedOrder(UnifiedOrderReq req);
	
}
