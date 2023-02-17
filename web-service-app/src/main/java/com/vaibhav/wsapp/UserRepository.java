package com.vaibhav.wsapp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.vaibhav.wsapp.io.entity.UserEntity;

@Repository
@Service
public interface UserRepository extends CrudRepository<UserEntity, Long> {
	UserEntity findByEmail(String email);
}
