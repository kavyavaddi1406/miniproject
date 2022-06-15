
package com.zensar.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import com.zensar.bean.AbstractUser;
import com.zensar.db.AbstractUserDAO;
@Service
public class AbstractService {
@Autowired
AbstractUserDAO dao;
public AbstractUser insertAbstractUser(AbstractUser Abstractuser) {
return this.dao.save(Abstractuser);
}
public AbstractUser updateAbstractUser(AbstractUser Abstractuser) {
return this.dao.save(Abstractuser);
}
}

