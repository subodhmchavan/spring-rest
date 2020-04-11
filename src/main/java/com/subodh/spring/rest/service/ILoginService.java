package com.subodh.spring.rest.service;

import java.util.List;

import com.subodh.spring.rest.jpa.Login;

public interface ILoginService {

	List<Login> findAll();
	
	void save(Login login);
}
