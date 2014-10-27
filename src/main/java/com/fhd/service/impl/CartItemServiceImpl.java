/*
 * Copyright 2005-2013 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package com.fhd.service.impl;

import javax.annotation.Resource;

import com.fhd.dao.CartItemDao;
import com.fhd.entity.CartItem;
import com.fhd.service.CartItemService;

import org.springframework.stereotype.Service;

/**
 * Service - 购物车项
 * 
 * @author SHOP++ Team
 * @version 3.0
 */
@Service("cartItemServiceImpl")
public class CartItemServiceImpl extends BaseServiceImpl<CartItem, Long> implements CartItemService {

	@Resource(name = "cartItemDaoImpl")
	public void setBaseDao(CartItemDao cartItemDao) {
		super.setBaseDao(cartItemDao);
	}

}