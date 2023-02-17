package com.vaibhav.wsapp.service;

import org.springframework.stereotype.Service;

import com.vaibhav.wsapp.shared.dto.UserDto;


@Service
public interface userService {
	
	UserDto createUser(UserDto user);

}
