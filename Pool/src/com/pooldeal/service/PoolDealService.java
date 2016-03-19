package com.pooldeal.service;

import org.springframework.stereotype.Service;

import com.pooldeal.dao.PoolDealDAO;
import com.pooldeal.domain.Registration;
import com.pooldeal.domain.User;



@Service
public class PoolDealService {


	public void createUser(User user) {
		PoolDealDAO dao = new PoolDealDAO();
		dao.createUser(user);
	}

//	public void createUser(Registration registration) {
//		PoolDealDAO dao = new PoolDealDAO();
//		dao.createUser(registration);
//	}
}