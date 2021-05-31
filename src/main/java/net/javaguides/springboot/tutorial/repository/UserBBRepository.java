package net.javaguides.springboot.tutorial.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.tutorial.entity.UserBB;

@Repository
public interface UserBBRepository extends CrudRepository<UserBB, Long> {

	List<UserBB> findByName(String name);
	
}
