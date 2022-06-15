
package com.zensar.rest;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.zensar.bean.Admin;
import com.zensar.bean.Customer;
import com.zensar.bean.TripBooking;
import com.zensar.service.AdminService;
@RestController
public class AdminController {
@Autowired
AdminService service;
@PostMapping(value ="/insertadmin")
public Admin f1(@RequestBody Admin admin) {
return this.service.insertAdmin(admin);
}
@PutMapping(value ="/updateadmin")
public Admin f2(@RequestBody Admin admin) {
return this.service.updateAdmin(admin);
}
@DeleteMapping(value = "/deleteadmin")
public boolean f3(@RequestBody Admin admin) {
return this.service.removeAdmin(admin);
}
@GetMapping(value = "/getAllbookings/{customerId}")
public List<TripBooking> f4(@PathVariable(name ="customerId")int customerId) {
return this.service.getAllTrips(customerId);
}
@GetMapping(value = "/findCustomer/{customerid}")
public List<TripBooking>f5(@PathVariable(name="customerid") int customerid){
return this.service.getAllTrips(customerid);
}
@GetMapping(value = "/findbookingcustomerwise")
public List<TripBooking>f6(){
return this.service.getTripsCustomerwise();
}
@GetMapping(value = "/findbookingDatewise")
public List<TripBooking>f7(){
return this.service.getTripsDatewise();
}
@GetMapping(value = "/getAllTrips/{customerid}/{fromDate}/{toDate}")
public List<TripBooking>f8(@PathVariable(name="customerid")int customerid,@PathVariable(name = "fromDate")LocalDateTime from,@PathVariable(name = "toDate")LocalDateTime to){
return this.service.getAllTripsForDays(customerid, from, to);
}
}

