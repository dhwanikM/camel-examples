package com.accion.boot.controller;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@Autowired
	CamelContext camelContext;

	@Autowired
	ProducerTemplate template;

	@RequestMapping(value = "/route/{body}")
	public void startCamel(@PathVariable String body) throws Exception {
		template.sendBody("direct:firstRoute", body);
	}

}
