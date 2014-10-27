/*
 * Copyright 2005-2013 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package com.fhd.service.impl;

import javax.annotation.Resource;

import com.fhd.entity.OrderItem;
import com.fhd.service.OrderItemService;
import com.fhd.dao.OrderItemDao;

import org.springframework.stereotype.Service;

/**
 * Service - 订单项
 * 
 * @author SHOP++ Team
 * @version 3.0
 */
@Service("orderItemServiceImpl")
public class OrderItemServiceImpl extends BaseServiceImpl<OrderItem, Long> implements OrderItemService {

	@Resource(name = "orderItemDaoImpl")
	public void setBaseDao(OrderItemDao orderItemDao) {
		super.setBaseDao(orderItemDao);
	}

}