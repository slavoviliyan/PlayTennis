package com.playtennis.repository;

import org.springframework.data.repository.CrudRepository;

import com.playtennis.domain.User;

public interface UserRepository extends CrudRepository<User, Long>{

}
