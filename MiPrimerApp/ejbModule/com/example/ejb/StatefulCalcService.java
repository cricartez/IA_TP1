package com.example.ejb;


import javax.ejb.LocalBean;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class StatefulCalService
 */
@Stateful
@LocalBean
public class StatefulCalcService implements StatefulCalcServiceRemote, StatefulCalcServiceLocal {

	private int value = 0;
	public void add(int n) { value += n;}
	public void substract(int n) { value -= n;}
	public int getValue() { return value;}
	
    public StatefulCalcService() {
        // TODO Auto-generated constructor stub
    }

}
