package com.day6.model;

import java.util.Objects;

public class Address {
//	private String state;
//	private String city;
//	private String pincode;
//	public String getState() {
//		return state;
//	}
//	public void setState(String state) {
//		this.state = state;
//	}
//	public String getCity() {
//		return city;
//	}
//	public void setCity(String city) {
//		this.city = city;
//	}
//	public String getPincode() {
//		return pincode;
//	}
//	public void setPincode(String pincode) {
//		this.pincode = pincode;
//	}
//	public Address() {}
//	public Address(String state, String city, String pincode) {
//		super();
//		this.state = state;
//		this.city = city;
//		this.pincode = pincode;
//	}
//	@Override
//	public String toString() {
//		return "Address [state=" + state + ", city=" + city + ", pincode=" + pincode + "]";
//	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(city, pincode, state);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Address other = (Address) obj;
//		return Objects.equals(city, other.city) && Objects.equals(pincode, other.pincode)
//				&& Objects.equals(state, other.state);
//	}
//	
	private String state;
	private String city;
	private String pincode;
	private String type;
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(city, pincode, state, type);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(city, other.city) && Objects.equals(pincode, other.pincode)
				&& Objects.equals(state, other.state) && Objects.equals(type, other.type);
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Address(String state, String city, String pincode, String type) {
		super();
		this.state = state;
		this.city = city;
		this.pincode = pincode;
		this.type = type;
	}
	
	
	public Address() {
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", pincode=" + pincode + ", type=" + type + "]";
	}
}
