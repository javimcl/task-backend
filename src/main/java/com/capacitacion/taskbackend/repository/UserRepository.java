/**
 * 
 */
package com.capacitacion.taskbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capacitacion.taskbackend.model.User;

/**
 * @author jluceroc
 *
 */
public interface UserRepository extends JpaRepository<User, Long>{

}
