package com.jeni;

import org.springframework.beans.factory.annotation.Autowired;

public class Address {
	private int houseNo;
	private String locality;
	private String city;
	
	public Address() {
		super();
		this.houseNo = 0;
		this.locality = "";
		this.city = "";
	}
	
	@Autowired
	public Address(int houseNo, String locality, String city) {
		super();
		this.houseNo = houseNo;
		this.locality = locality;
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "houseNo=" + houseNo + ",\n locality=" + locality + ",\n city=" + city;
	}

}
