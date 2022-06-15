package com.zensar.rest;import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;import com.zensar.bean.TripBooking;
import com.zensar.service.TripBookingService;

@RestController
public class TripBookingController {
	@Autowired
TripBookingService service;
	@PostMapping(value = "/inserttripbooking")
public TripBooking f1(@RequestBody TripBooking tripBooking) {
return this.service.insertTripBooking(tripBooking);
}
	@PutMapping(value = "/updatetripbooking")
public TripBooking f2(@RequestBody TripBooking tripBooking) {
return this.service.updateTripBooking(tripBooking);
}
	@DeleteMapping(value = "/deletetripbooking")
public TripBooking f3(@RequestBody TripBooking tripBooking) {
return this.service.deleteTripBooking(tripBooking.getTripBookingId());
}
	@GetMapping(value = "/getAll/{customerId}")
public List<TripBooking> f4(@PathVariable(name = "customerId") int customerId) {
return this.service.viewAlltripsCustomer(customerId);
}
	}

