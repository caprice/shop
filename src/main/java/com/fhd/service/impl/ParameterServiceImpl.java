/*
 * Copyright 2005-2013 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package com.fhd.service.impl;

import javax.annotation.Resource;

import com.fhd.dao.ParameterDao;
import com.fhd.entity.Parameter;
import com.fhd.service.ParameterService;

import org.springframework.stereotype.Service;

/**
 * Service - 参数
 * 
 * @author SHOP++ Team
 * @version 3.0
 */
@Service("parameterServiceImpl")
public class ParameterServiceImpl extends BaseServiceImpl<Parameter, Long> implements ParameterService {

	@Resource(name = "parameterDaoImpl")
	public void setBaseDao(ParameterDao parameterDao) {
		super.setBaseDao(parameterDao);
	}

}