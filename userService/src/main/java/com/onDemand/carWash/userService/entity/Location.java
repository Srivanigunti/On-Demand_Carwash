package com.onDemand.carWash.userService.entity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "location")
public class Location {

	private String houseNo;
	private String streetNo;
	private String city;
	private String state;
	private String pincode;

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Location [houseNo=" + houseNo + ", streetNo=" + streetNo + ", city=" + city + ", state=" + state
				+ ", pincode=" + pincode + "]";
	}

}