package com.onemore.portal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onemore.portal.entity.Dynamic;
import com.onemore.portal.mapper.DynamicMapper;
import com.onemore.portal.service.DynamicService;

@Service
public class DynamicServiceImpl implements DynamicService {

	@Autowired
	private DynamicMapper dynamicMapper;

	@Override
	public void insert(Dynamic dynamic) {
		dynamicMapper.insert(dynamic);
	}

}
