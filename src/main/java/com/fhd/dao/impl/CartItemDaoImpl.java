/*
 * Copyright 2005-2013 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package com.fhd.dao.impl;

import com.fhd.dao.CartItemDao;
import com.fhd.entity.CartItem;

import org.springframework.stereotype.Repository;

/**
 * Dao - 购物车项
 * 
 * @author SHOP++ Team
 * @version 3.0
 */
@Repository("cartItemDaoImpl")
public class CartItemDaoImpl extends BaseDaoImpl<CartItem, Long> implements CartItemDao {

}