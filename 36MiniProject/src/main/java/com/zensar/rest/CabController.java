package com.zensar.rest;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;import com.zensar.bean.Cab;
import com.zensar.service.CabService;@RestController
public class CabController {
@Autowired
CabService service;
@PostMapping(value ="/insertcab")
public Cab f1(@RequestBody Cab cab) {
return this.service.insertCab(cab);
}
@PutMapping(value = "/updatecab")
public Cab f2(@RequestBody Cab cab) {
return this.service.updateCab(cab);
}
@DeleteMapping(value = "/deletecab")
public Cab f3(@RequestBody Cab cab) {
return this.service.deleteCab(cab.getCabId());
}
@GetMapping(value = "/getAll/{cabType}")
public List<Cab> f4(@PathVariable(name ="cabType")String cabType) {
return this.service.ViewCabsOfType(cabType);
}
@GetMapping(value = "/getCount/{cabType}")
public int f5(@PathVariable(name ="cabType")String cabType) {
return this.service.countCabsOfType(cabType);
}
}



