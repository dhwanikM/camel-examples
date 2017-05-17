package com.accion.camel.sample;
public class Transormer {
	public String transformContent(String body)
	{
		System.out.println("Transforming data to upper case");
		String upperCaseContent=body.toUpperCase();
		return upperCaseContent;
	}

}