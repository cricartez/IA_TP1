package com.example.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class StatelessHelloService
 */
@Stateless
@LocalBean
public class StatelessHelloService implements StatelessHelloServiceRemote, StatelessHelloServiceLocal {

    /**
     * Default constructor. 
     */
    public StatelessHelloService() {
        // TODO Auto-generated constructor stub
    }
    
    public String SayHello(String name){
    	return "Hello " + name;
    }

}
