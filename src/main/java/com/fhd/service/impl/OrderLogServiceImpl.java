/*
 * Copyright 2005-2013 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package com.fhd.service.impl;

import javax.annotation.Resource;

import com.fhd.dao.OrderLogDao;
import com.fhd.entity.OrderLog;
import com.fhd.service.OrderLogService;

import org.springframework.stereotype.Service;

/**
 * Service - 订单日志
 * 
 * @author SHOP++ Team
 * @version 3.0
 */
@Service("orderLogServiceImpl")
public class OrderLogServiceImpl extends BaseServiceImpl<OrderLog, Long> implements OrderLogService {

	@Resource(name = "orderLogDaoImpl")
	public void setBaseDao(OrderLogDao orderLogDao) {
		super.setBaseDao(orderLogDao);
	}

}