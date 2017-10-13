package com.example.ejb;

import javax.ejb.Local;

@Local
public interface StatelessHelloServiceLocal {
	String SayHello(String name);
}
