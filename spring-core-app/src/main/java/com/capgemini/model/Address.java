package com.capgemini.model;

public class Address {
private String houseNumber;
private String city;
private String pin;
public String getHouseNumber() {
	return houseNumber;
}
public void setHouseNumber(String houseNumber) {
	this.houseNumber = houseNumber;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getPin() {
	return pin;
}
public void setPin(String pin) {
	this.pin = pin;
}
@Override
public String toString() {
	return "Address [houseNumber=" + houseNumber + ", city=" + city + ", pin=" + pin + "]";
}


}
