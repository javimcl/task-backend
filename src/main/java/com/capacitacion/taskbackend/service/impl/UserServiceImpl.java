/**
 * 
 */
package com.capacitacion.taskbackend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capacitacion.taskbackend.model.User;
import com.capacitacion.taskbackend.repository.UserRepository;
import com.capacitacion.taskbackend.service.UserService;

/**
 * @author jluceroc
 *
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository repository;

	@Override
	public List<User> findAll() {
		return repository.findAll();
	}

}
