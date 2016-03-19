package com.pooldeal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pooldeal.dao.PoolDealDAO;
import com.pooldeal.domain.Location;
import com.pooldeal.domain.User;

@Service
public class PoolDealService {

	PoolDealDAO dao = new PoolDealDAO();
	
	public void createUser(User user) {
		dao.createUser(user);
	}

	public boolean authUser(User user) {
		return dao.authUser(user);
	}
	
	public List<Location> fetchAllLocations() {
		return dao.fetchAllLocations();
	}

}
