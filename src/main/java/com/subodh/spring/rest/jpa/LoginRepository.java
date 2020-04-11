package com.subodh.spring.rest.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LoginRepository extends CrudRepository<Login, Long> {

//	public Login findById(Long id);
}
