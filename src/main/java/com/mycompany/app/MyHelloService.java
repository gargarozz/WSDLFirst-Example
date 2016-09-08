package com.mycompany.app;

import javax.jws.WebService;

import com.examples.wsdl.helloservice.HelloPortType;


@WebService(name = "Hello_PortType", targetNamespace = "http://www.examples.com/wsdl/HelloService.wsdl")
public class MyHelloService implements HelloPortType{

	public String sayHello(String firstName) {
		return "Hello world!";
	}

}
