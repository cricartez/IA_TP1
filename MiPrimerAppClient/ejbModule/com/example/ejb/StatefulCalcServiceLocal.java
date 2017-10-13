package com.example.ejb;

import javax.ejb.Local;

@Local
public interface StatefulCalcServiceLocal {
	public void add(int n);
	public void substract(int n);
	public int getValue();
}
