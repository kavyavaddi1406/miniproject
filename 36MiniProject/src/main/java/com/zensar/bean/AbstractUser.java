package com.zensar.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="abstract_users")
public class AbstractUser {
	@Id
private String username;
private String password;
private String adresss;
private String mobileNumber;
private String email;
public AbstractUser(String username, String password, String adresss, String mobileNumber, String email) {
	super();
	this.username = username;
	this.password = password;
	this.adresss = adresss;
	this.mobileNumber = mobileNumber;
	this.email = email;
}
public AbstractUser() {
	super();
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getAdresss() {
	return adresss;
}
public void setAdresss(String adresss) {
	this.adresss = adresss;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "AbstractUser [username=" + username + ", password=" + password + ", adresss=" + adresss + ", mobileNumber="
			+ mobileNumber + ", email=" + email + "]";
}

}