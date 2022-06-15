
package com.zensar.rest;
import java.util.List;import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;import com.zensar.bean.Driver;
import com.zensar.service.DriverService;@RestController
public class DriverController {
@Autowired
DriverService service;
@PostMapping(value="/insertdriver")
public Driver f1(@RequestBody Driver driver) {
return this.service.insertDriver( driver);
}
@PutMapping(value ="/updatedriver")
public Driver f2(@RequestBody Driver driver) {
return this.service.updateDriver(driver);
}
@DeleteMapping(value = "/deletedriver")
public Driver f3(@RequestBody Driver driver) {
return this.service.deleteDriver(driver.getDriverId());
}
@GetMapping(value="/getBestDrivers")
public List<Driver>f4(){
return this.service.viewBestDrivers();
}
@GetMapping(value="/view/{id}")
public Driver f5(@PathVariable (name="id") int id) {
return this.service.viewDriver(id);
}
}

