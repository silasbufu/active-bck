package com.iuri.active_bck.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.iuri.active_bck.entity.TestEntity;

public interface TestRepository extends CrudRepository<TestEntity, Integer>{
	List<TestEntity> findAll();
}
