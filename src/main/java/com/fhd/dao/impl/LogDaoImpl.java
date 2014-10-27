/*
 * Copyright 2005-2013 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package com.fhd.dao.impl;

import javax.persistence.FlushModeType;

import com.fhd.entity.Log;
import com.fhd.dao.LogDao;

import org.springframework.stereotype.Repository;

/**
 * Dao - 日志
 * 
 * @author SHOP++ Team
 * @version 3.0
 */
@Repository("logDaoImpl")
public class LogDaoImpl extends BaseDaoImpl<Log, Long> implements LogDao {

	public void removeAll() {
		String jpql = "delete from Log log";
		entityManager.createQuery(jpql).setFlushMode(FlushModeType.COMMIT).executeUpdate();
	}

}