package com.vaibhav.wsapp.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaibhav.wsapp.UserRepository;
import com.vaibhav.wsapp.io.entity.UserEntity;
import com.vaibhav.wsapp.service.userService;
import com.vaibhav.wsapp.shared.Utils;
import com.vaibhav.wsapp.shared.dto.UserDto;


@Service
public class UserServiceImpl implements userService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	Utils utils;
	
	
	//@Autowired
	//BCryptPasswordEncoder bCryptPasswordEncoder;
	
	//@Autowired
	//UserRepositoryNew newUserRepository;

	@Override
	public UserDto createUser(UserDto user) {
		
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(user, userEntity);
		
		
		System.out.println(user.getEmail());
		System.out.println(user.getFname());
		System.out.println(user.getLname());
		
		if(userRepository.findByEmail(user.getEmail())!= null)throw new RuntimeException("Record already Exists");
		
		//if(userRepository.findByEmail(user.getEmail())!= null) throw new RuntimeException("Error");
		
		
		String publicUserID = utils.generateUserId(20);
		userEntity.setUserId(publicUserID);
		
		
		
		//userEntity.setEcryptedPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		
		userEntity.setEcryptedPassword("Test");
		
		/*userEntity.setEmailID("vaibhav10@gmail.com");
		userEntity.setFirstName("Vaibhav");
		userEntity.setLastName("Sarode");
		
		System.out.println(userEntity.getEmail());
		System.out.println(userEntity.getEcryptedPassword());
		System.out.println(userEntity.getUserId());
		System.out.println(userEntity.getFirstName());
		System.out.println(userEntity.getLastName());
		System.out.println(userEntity.getEmailVerificationStatus());*/
	
		
		UserEntity storedUserDetails = userRepository.save(userEntity);
		
		//UserEntity sd = userRepository.save(userEntity);
		
		
		
		//UserEntity storedData =  userRepository.save(userEntity);
		
		
		
		
		UserDto returnValue = new UserDto();
		BeanUtils.copyProperties(storedUserDetails, returnValue);
		
		return returnValue;
	}

}
