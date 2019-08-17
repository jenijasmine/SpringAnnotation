package com.jeni;

import org.springframework.beans.factory.annotation.Autowired;

public class Person implements PersonIntf{
	private String name;
    private Address address;
	
    public Person() {
    	name = "";
        address = null;
    }

    @Autowired
	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	@Override
	public void showPersonDetails() {
		// TODO Auto-generated method stub
		System.out.println("Name: " + name);
		System.out.println("Address: "+ address);
	}
  
}
