package com.pooldeal.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pooldeal.domain.Category;
import com.pooldeal.domain.User;
import com.pooldeal.service.PoolDealService;



@Controller
public class PoolDealController {


	@RequestMapping(value="/auth", method={RequestMethod.POST})
	@ResponseBody

	public  boolean AuthorizeUser(@RequestBody User user)
	{
		boolean authBool = false;
		if(null != user.getEmail() && null != user.getPwd())
		{
			PoolDealService service = new PoolDealService();
			authBool = service.authUser(user);

		}
		return authBool;

	}

	@RequestMapping(value="/createUser", method=RequestMethod.POST)
	@ResponseBody
	public User createUser(@RequestBody User user)
	{
		PoolDealService service = new PoolDealService();

		service.createUser(user);
		return user;
	}



}
