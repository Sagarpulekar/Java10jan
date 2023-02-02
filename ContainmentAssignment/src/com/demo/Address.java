package com.demo;

public class Address {
	private int srno, pin;
	private String society, city;

	public Address() {

	}

	Address(int srno, int pin, String society, String City) {
		this.srno = srno;
		this.pin = pin;
		this.society = society;
		this.city = city;

	}

	public int getSrno() {
		return srno;
	}

	public void setSrno(int srno) {
		this.srno = srno;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getSociety() {
		return society;
	}

	public void setSociety(String society) {
		this.society = society;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String toString() {
		return "SOCIETY NAME:" + society + "\nCITY:" + city + "\nPINCODE:" + pin + "\nSURVEY NO.:" + srno;
	}

}
