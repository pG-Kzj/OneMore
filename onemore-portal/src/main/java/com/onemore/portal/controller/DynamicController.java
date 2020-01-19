package com.onemore.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.onemore.portal.entity.Dynamic;
import com.onemore.portal.service.DynamicService;

@Controller
@RequestMapping("dynamic")
public class DynamicController {

	@Autowired
	private DynamicService dynamicService;

	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public String insert(Dynamic dynamic) {

		dynamicService.insert(dynamic);

		return "success";
	}

}
