package com.accion.camel.sample.router;

import org.apache.camel.builder.RouteBuilder;

public class FirstRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		from("file:D:/temp/camel/input")
		.choice()
			.when(header("CamelFileName").endsWith("txt"))
				.to("file:D:/temp/camel/output/txt")
			.when(header("CamelFileName").endsWith("xml"))
				.to("file:D:/temp/camel/output/xml")
			.otherwise()
				.to("file:D:/temp/camel/output")
		.end();
			
	}

}