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

	public  ResponseEntity<User> AuthorizeUser()
	{
		User user = new User();
		user.setEmail("abc");
		user.setPwd("xyz");
		if(true)
        return new ResponseEntity<User>(user, HttpStatus.OK);

		else
			return new ResponseEntity(HttpStatus.NOT_FOUND);
	}

	@RequestMapping(value="/createUser", method=RequestMethod.POST)
	@ResponseBody
	public User createUser(@RequestBody User user)
	{
		PoolDealService service = new PoolDealService();

		service.createUser(user);
		return user;
	}

	@RequestMapping(value="/sample", method=RequestMethod.POST)
	@ResponseBody
	public String createUser(@RequestBody String sample) {
		return sample;
	}

}
