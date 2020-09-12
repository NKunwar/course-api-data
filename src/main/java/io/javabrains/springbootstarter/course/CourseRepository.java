package io.javabrains.springbootstarter.course;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

// for CRUD operations
public interface CourseRepository extends CrudRepository<Course, String> {
	
	public List<Course> findByTopicId(String topicId);
	
}
