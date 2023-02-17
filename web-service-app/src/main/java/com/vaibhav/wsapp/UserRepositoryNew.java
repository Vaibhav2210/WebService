package com.vaibhav.wsapp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vaibhav.wsapp.io.entity.UserEntity;

@Repository
public interface UserRepositoryNew extends CrudRepository<UserEntity, Long> {

}
