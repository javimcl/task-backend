/**
 * 
 */
package com.capacitacion.taskbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capacitacion.taskbackend.model.User;
import com.capacitacion.taskbackend.service.UserService;

/**
 * @author jluceroc
 *
 */
@RestController
@RequestMapping("/api/user/migration")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> users = userService.findAll();
		return ResponseEntity.ok(users);
	}

}
