
package com.zensar.rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.zensar.bean.Customer;
import com.zensar.service.CustomerService;
@RestController
public class CustomerController {
@Autowired
CustomerService service;
@GetMapping(value="/location")
public String location() {
return "location";
}
@GetMapping("/insertcustomer")
public Customer saveUser(@RequestBody Customer customer) {
return this.service.insertCustomer(customer);
}
@PostMapping(value ="/updatecustomer")
public Customer f1(@RequestBody Customer customer) {
return this.service.updateCustomer(customer);
}
@DeleteMapping(value = "/deletecustomer")
public Customer f2(@RequestBody Customer customer) {
return this.service.deleteCustomer(customer.getCustomerId());
}
@PostMapping(value = "/view/{id}")
public Customer f3(@PathVariable( name="id")int Id) {
return this.service.viewCustomer(Id);
}
}

