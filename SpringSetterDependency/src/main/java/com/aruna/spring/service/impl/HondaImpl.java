package com.aruna.spring.service.impl;

import com.aruna.spring.model.Address;
import com.aruna.spring.service.IVehicle;

public class HondaImpl implements IVehicle {
	private Address address =null;//this HondaImpl class is dependent on Address

	public String model() {		
		return "Honda";
	}

	public int year() {
		return 2019;
	}
	

	public void setAddress(Address address)  //we need setters in impl class for setter dependency in .xml file
	{
		this.address = address;
		
	}

public void print(){
	System.out.println("HondaImpl class:"+ this.model() + ", "+address.toString());
}
}
