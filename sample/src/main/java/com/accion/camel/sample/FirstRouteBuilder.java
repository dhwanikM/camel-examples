package com.accion.camel.sample;

import org.apache.camel.builder.RouteBuilder;

public class FirstRouteBuilder extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		
	from("file:D:/temp/camel/input")
	.process(new LogProcessor())
	.bean(new Transormer(),"transformContent")
	.process(new LogProcessor())
	.to("file:D:/temp/camel/output");	
	}

}