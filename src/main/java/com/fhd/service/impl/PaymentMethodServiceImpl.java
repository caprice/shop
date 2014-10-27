/*
 * Copyright 2005-2013 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package com.fhd.service.impl;

import javax.annotation.Resource;

import com.fhd.dao.PaymentMethodDao;
import com.fhd.entity.PaymentMethod;
import com.fhd.service.PaymentMethodService;

import org.springframework.stereotype.Service;

/**
 * Service - 支付方式
 * 
 * @author SHOP++ Team
 * @version 3.0
 */
@Service("paymentMethodServiceImpl")
public class PaymentMethodServiceImpl extends BaseServiceImpl<PaymentMethod, Long> implements PaymentMethodService {

	@Resource(name = "paymentMethodDaoImpl")
	public void setBaseDao(PaymentMethodDao paymentMethodDao) {
		super.setBaseDao(paymentMethodDao);
	}

}