package com.vaibhav.wsapp.ui.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vaibhav.wsapp.service.userService;
import com.vaibhav.wsapp.shared.dto.UserDto;
import com.vaibhav.wsapp.ui.model.request.UserDetailsRequestModel;
import com.vaibhav.wsapp.ui.model.response.UserRest;

@RestController
@RequestMapping("/NewUsers")
public class UserController {
	
	@Autowired
	userService userService1;

	@GetMapping
	public String getUser(@RequestParam(value = "page", defaultValue = "1") int page,
			@RequestParam(value = "limit", defaultValue = "100") int limit) {
		return "Get User was called with page = " + page + " and limit = " + limit;
	}

	@GetMapping(path = "/")
	public String getAllUSers() {
		return "Get AllUser was called with page";
	}

	@PostMapping
	public UserRest postUser(@RequestBody UserDetailsRequestModel UserDetails) {
		
		UserRest returnValue = new UserRest();
		
		System.out.println(UserDetails.getEmail());
		System.out.println(UserDetails.getFname());
		System.out.println(UserDetails.getLname());
		
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(UserDetails, userDto);
		
		
		
		UserDto createdUser = userService1.createUser(userDto);
		BeanUtils.copyProperties(createdUser, returnValue);

		return returnValue;

	}

	@PutMapping
	public String putUser() {
		return "PUT Method has been called";
	}

	@DeleteMapping
	public String deleteUser() {
		return "DELETE Method has been called";
	}

}
