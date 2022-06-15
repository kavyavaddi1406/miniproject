package com.zensar.rest;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import com.zensar.bean.AbstractUser;
import com.zensar.service.AbstractService;



@RestController
public class AbstractController {
@Autowired
AbstractService service;

@GetMapping("/insertuser")
public AbstractUser f1(@RequestBody AbstractUser abstractuser) {
return this.service.insertAbstractUser(abstractuser);
}


@PutMapping(value ="/updateuser")
public AbstractUser f2(@RequestBody AbstractUser abstractuser) {
return this.service.updateAbstractUser(abstractuser);
}




}