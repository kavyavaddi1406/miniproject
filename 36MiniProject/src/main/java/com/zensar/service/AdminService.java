
package com.zensar.service;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zensar.bean.Admin;
import com.zensar.bean.TripBooking;
import com.zensar.bean.TripCustomerComparator;
import com.zensar.bean.TripDateComparator;
import com.zensar.db.AdminDAO;
import com.zensar.db.TripBookingDAO;
@Service
public class AdminService {
@Autowired
AdminDAO dao;
@Autowired
TripBookingDAO dao1;
public Admin insertAdmin(Admin admin) {
return this.dao.save(admin);
}
public List<Admin> getAllAdmins(){
return this.dao.findAll();
}
public Admin updateAdmin(Admin admin) {
return this.dao.save(admin);
}
public Boolean removeAdmin(Admin admin) {
dao.delete(admin);
return true;
}
public List<TripBooking> getAllTrips (int customerId){
List<TripBooking> allTripBookings = this.dao1.findAll();
List<TripBooking> customerbooking =new ArrayList<>();
for(TripBooking booking:allTripBookings) {
if(booking.getCustomerId()==customerId) {
customerbooking.add(booking);
}
}
return customerbooking;
}
public List<TripBooking> getTripsCustomerwise(){
List<TripBooking> allTripBookings = this.dao1.findAll();
TripCustomerComparator tcc=new TripCustomerComparator();
Collections.sort(allTripBookings, tcc);
return allTripBookings;
}
public List<TripBooking> getTripsDatewise(){
List<TripBooking> allTripBookings = this.dao1.findAll();
TripDateComparator tdc = new TripDateComparator();
Collections.sort(allTripBookings, tdc);
return allTripBookings;
}
public List<TripBooking> getAllTripsForDays (int customerId,LocalDateTime fromDate,LocalDateTime toDate){
List<TripBooking>allTripBookings = this.dao1.findAll();
List<TripBooking> filterList = new ArrayList<>();
for(TripBooking booking:allTripBookings) {
if(booking.getCustomerId()==customerId && booking.getFromDateTime().isAfter(fromDate) && booking.getFromDateTime().isBefore(toDate)) {
filterList.add(booking);
}
}
return filterList;
}
}


