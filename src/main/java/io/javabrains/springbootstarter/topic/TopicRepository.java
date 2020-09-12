package io.javabrains.springbootstarter.topic;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

// for CRUD operations
public interface TopicRepository extends CrudRepository<Topic, String> {
	
	
	
}
