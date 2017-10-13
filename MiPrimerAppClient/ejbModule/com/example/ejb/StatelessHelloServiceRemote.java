package com.example.ejb;

import javax.ejb.Remote;

@Remote
public interface StatelessHelloServiceRemote {
	String SayHello(String name);
}
