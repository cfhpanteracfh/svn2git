package com.techdata.annotation.servicesimpl;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techdata.annotation.model.beans.User;
import com.techdata.annotation.repository.UserDAO;
import com.techdata.annotation.services.MainService;

@Service("mainService")
public class MainServiceImpl implements MainService {
	
	 @Autowired(required = true)
	 private UserDAO userDAO;

	public void register(User user) throws Exception {
		try {
             userDAO.insert(user);
        } catch (SQLException e) {
            throw new Exception("Error in method register ", e);
        }
	}

	    
	
	


}
