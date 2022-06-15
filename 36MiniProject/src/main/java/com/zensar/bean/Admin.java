package com.zensar.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admins")
public class Admin {
	@Id
	@Column(name="admin_id")
private int adminId;

public Admin(int adminId) {
	super();
	this.adminId = adminId;
}

public Admin() {
	super();
}

public int getAdminId() {
	return adminId;
}

public void setAdminId(int adminId) {
	this.adminId = adminId;
}

@Override
public String toString() {
	return "Admin [adminId=" + adminId + "]";
}

}
