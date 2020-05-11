package com.odx.test.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.odx.test.entity.Palin;

@Repository
public interface TestRepo extends CrudRepository<Palin, Integer>{
	public Optional<Palin> findByName(String name);
}
