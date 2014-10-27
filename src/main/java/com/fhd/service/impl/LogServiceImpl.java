/*
 * Copyright 2005-2013 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package com.fhd.service.impl;

import javax.annotation.Resource;

import com.fhd.service.LogService;
import com.fhd.dao.LogDao;
import com.fhd.entity.Log;

import org.springframework.stereotype.Service;

/**
 * Service - 日志
 * 
 * @author SHOP++ Team
 * @version 3.0
 */
@Service("logServiceImpl")
public class LogServiceImpl extends BaseServiceImpl<Log, Long> implements LogService {

	@Resource(name = "logDaoImpl")
	private LogDao logDao;

	@Resource(name = "logDaoImpl")
	public void setBaseDao(LogDao logDao) {
		super.setBaseDao(logDao);
	}

	public void clear() {
		logDao.removeAll();
	}

}