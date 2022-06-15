package com.zensar.service;



import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.zensar.bean.TripBooking;
import com.zensar.db.TripBookingDAO;



@Service
public class TripBookingService {



@Autowired
TripBookingDAO dao;
public TripBooking insertTripBooking(TripBooking tripBooking) {
return this.dao.save(tripBooking);
}

public TripBooking updateTripBooking(TripBooking tripBooking) {
return this.dao.save(tripBooking);
}

public TripBooking deleteTripBooking(int tripBookingId) {
TripBooking tripbooking=new TripBooking();
tripbooking.setTripBookingId(tripBookingId);
this.dao.delete(tripbooking);
return tripbooking;
}

public List<TripBooking> viewAlltripsCustomer(int customerId) {
List<TripBooking> allTrips=this.dao.findAll();
List<TripBooking> customer=new ArrayList<>();
for(TripBooking tripbooking:allTrips) {
if(tripbooking.getCustomerId()==customerId) {
customer.add(tripbooking);
}

}
return customer;

}

}