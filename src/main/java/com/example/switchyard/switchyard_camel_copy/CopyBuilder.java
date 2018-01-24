package com.example.switchyard.switchyard_camel_copy;

import org.apache.camel.builder.RouteBuilder;

public class CopyBuilder extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("file:C:/Users/mauro.caredda/INPUT?noop=true")
		.to("file:C:/Users/mauro.caredda/OUTPUT");
		
	}

}
