package com.zensar.service;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.zensar.bean.Customer;
import com.zensar.db.CustomerDAO;



@Service
public class CustomerService {
@Autowired
CustomerDAO dao;
public Customer insertCustomer(Customer customer) {
return this.dao.save(customer);
}
public Customer updateCustomer(Customer customer) {
return this.dao.save(customer);
}



public Customer deleteCustomer(int customerid) {
Customer customer=new Customer();
customer.setCustomerId(customerid);
this.dao.delete(customer);
return customer;
}



public Customer viewCustomer(int customerid) {
return this.dao.findById(customerid).get();
}



}

