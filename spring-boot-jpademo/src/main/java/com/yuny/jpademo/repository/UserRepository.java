package com.yuny.jpademo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.yuny.jpademo.pojo.User;


//
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
	
}
