/*
 * Copyright 2005-2013 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package com.fhd.service.impl;

import javax.annotation.Resource;

import com.fhd.entity.SpecificationValue;
import com.fhd.dao.SpecificationValueDao;
import com.fhd.service.SpecificationValueService;

import org.springframework.stereotype.Service;

/**
 * Service - 规格值
 * 
 * @author SHOP++ Team
 * @version 3.0
 */
@Service("specificationValueServiceImpl")
public class SpecificationValueServiceImpl extends BaseServiceImpl<SpecificationValue, Long> implements SpecificationValueService {

	@Resource(name = "specificationValueDaoImpl")
	public void setBaseDao(SpecificationValueDao specificationValueDao) {
		super.setBaseDao(specificationValueDao);
	}

}