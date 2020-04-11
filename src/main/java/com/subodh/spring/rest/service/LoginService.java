package com.subodh.spring.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subodh.spring.rest.jpa.Login;
import com.subodh.spring.rest.jpa.LoginRepository;

@Service
public class LoginService implements ILoginService {
	
	@Autowired
	private LoginRepository loginRepository;

	@Override
	public List<Login> findAll() {
		// TODO Auto-generated method stub
		return (List<Login>) loginRepository.findAll();
	}
	
	public void save(Login login) {
		loginRepository.save(login);
	}

}
