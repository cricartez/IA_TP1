package com.example.ejb;

import javax.ejb.Remote;

@Remote
public interface StatefulCalcServiceRemote {
	public void add(int n);
	public void substract(int n);
	public int getValue();
}
