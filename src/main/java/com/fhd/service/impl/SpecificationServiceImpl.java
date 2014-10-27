/*
 * Copyright 2005-2013 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package com.fhd.service.impl;

import javax.annotation.Resource;

import com.fhd.dao.SpecificationDao;
import com.fhd.entity.Specification;
import com.fhd.service.SpecificationService;

import org.springframework.stereotype.Service;

/**
 * Service - 规格
 * 
 * @author SHOP++ Team
 * @version 3.0
 */
@Service("specificationServiceImpl")
public class SpecificationServiceImpl extends BaseServiceImpl<Specification, Long> implements SpecificationService {

	@Resource(name = "specificationDaoImpl")
	public void setBaseDao(SpecificationDao specificationDao) {
		super.setBaseDao(specificationDao);
	}

}