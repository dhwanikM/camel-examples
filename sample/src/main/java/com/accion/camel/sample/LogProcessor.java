package com.accion.camel.sample;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class LogProcessor implements Processor{

	public void process(Exchange exchange) throws Exception {
		System.out.println("DATA : ");
		System.out.println(exchange.getIn().getBody(String.class));
		System.out.println(exchange);
		System.out.println();
	}

}