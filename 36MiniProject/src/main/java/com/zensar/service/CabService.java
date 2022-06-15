
package com.zensar.service;
import java.util.ArrayList;
import java.util.List;import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zensar.bean.Cab;
import com.zensar.db.CabDAO;

@Service
public class CabService {
@Autowired
CabDAO dao;
public Cab insertCab(Cab cab) {
return this.dao.save(cab);
}
public Cab updateCab(Cab cab) {
return this.dao.save(cab);
}
public Cab deleteCab(int cabId) {
Cab cab=new Cab();
cab.setCabId(cabId);
this.dao.delete(cab);
return cab;
}
public List<Cab> ViewCabsOfType(String carType){
List<Cab> AllCars=this.dao.findAll();
List<Cab> TypeCabs=new ArrayList<>();
for(Cab cab:AllCars) {
if(cab.getCarType().equals(carType)) {
TypeCabs.add(cab);
}
}
return TypeCabs;
}
public int countCabsOfType(String carType) {
List<Cab> AllCars=this.dao.findAll();
List<Cab> TypeCabs=new ArrayList<>();
for(Cab cab:AllCars) {
if(cab.getCarType().equals(carType)) {
TypeCabs.add(cab);
}
}
return TypeCabs.size();
} 
}



