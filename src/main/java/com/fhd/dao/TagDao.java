/*
 * Copyright 2005-2013 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package com.fhd.dao;

import java.util.List;

import com.fhd.entity.Tag;
import com.fhd.entity.Tag.Type;

/**
 * Dao - 标签
 * 
 * @author SHOP++ Team
 * @version 3.0
 */
public interface TagDao extends BaseDao<Tag, Long> {

	/**
	 * 查找标签
	 * 
	 * @param type
	 *            类型
	 * @return 标签
	 */
	List<Tag> findList(Type type);

}