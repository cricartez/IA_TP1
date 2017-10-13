package com.example.client;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.example.ejb.StatefulCalcServiceRemote;
import com.example.ejb.StatelessHelloServiceRemote;

public class Cliente {

	public static void main(String[] args) throws NamingException {
		final Hashtable jndiProperties = new Hashtable();
		jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
		jndiProperties.put("jboss.naming.client.ejb.context", true);
		final Context context = new InitialContext(jndiProperties);
		final String earName = "MiPrimerAppEAR"; // Nombre del módulo EAR
		final String ejbModuleName = "MiPrimerApp"; // Nombre del módulo EJB
		final String distinctName = ""; // Opcional para resolver repeticiones en nombres
		final String ejbClassName = "StatelessHelloService"; // Nombre corto del EJB
		final String fullInterfaceName = StatelessHelloServiceRemote.class.getName();
		String lookupName = "ejb:" + earName + "/" + ejbModuleName + "/" +
		distinctName + "/" + ejbClassName + "!" + fullInterfaceName;
		System.out.println("Conectando a " + lookupName);
		StatelessHelloServiceRemote mbr = (StatelessHelloServiceRemote)
		
		context.lookup(lookupName);
		System.out.println("Respuesta: " + mbr.SayHello("Mr Bean"));
		
		final String statefulEjbClassName = "StatefulCalcService"; // Nombre corto del EJB
		final String statefulFullInterfaceName = StatefulCalcServiceRemote.class.getName();
		String statefulLookupName = "ejb:" + earName + "/" + ejbModuleName + "/" +
		distinctName + "/" + statefulEjbClassName + "!" + statefulFullInterfaceName +
		"?stateful";
		System.out.println("Conectando a " + statefulLookupName);
		StatefulCalcServiceRemote calc = (StatefulCalcServiceRemote) context.lookup(statefulLookupName);
		
		calc.add(10);
		calc.substract(3);
		System.out.println("Respuesta: " + calc.getValue());


	}

}
