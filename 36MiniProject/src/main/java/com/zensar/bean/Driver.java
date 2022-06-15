package com.zensar.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Drivers")

public class Driver {
	@Id
private int driverId;
private String licenceNo;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "cabId", referencedColumnName = "cabId")


Cab cab;
private float rating;
public Driver(int driverId, String licenceNo, Cab cab, float rating) {
	super();
	this.driverId = driverId;
	this.licenceNo = licenceNo;
	this.cab = cab;
	this.rating = rating;
}
public Driver() {
	super();
}
public int getDriverId() {
	return driverId;
}
public void setDriverId(int driverId) {
	this.driverId = driverId;
}
public String getLicenceNo() {
	return licenceNo;
}
public void setLicenceNo(String licenceNo) {
	this.licenceNo = licenceNo;
}
public Cab getCab() {
	return cab;
}
public void setCab(Cab cab) {
	this.cab = cab;
}
public float getRating() {
	return rating;
}
public void setRating(float rating) {
	this.rating = rating;
}
@Override
public String toString() {
	return "Driver [driverId=" + driverId + ", licenceNo=" + licenceNo + ", cab=" + cab + ", rating=" + rating + "]";
}

}
