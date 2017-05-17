package com.accion.boot.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CamelRoutes extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("direct:firstRoute").routeId("testRoute")
		.log("Camel body: ${body}")
		.to("file:D:/temp/camel/output?fileName=${body}.txt");
	}

}