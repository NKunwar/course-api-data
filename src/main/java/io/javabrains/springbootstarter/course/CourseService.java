package io.javabrains.springbootstarter.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository topicRepository;

	public List<Course> getAllTopics() {
		List<Course> topics = new ArrayList<Course>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}

	public Course getTopic(String id) {
		return topicRepository.findById(id).orElse(null);
	}

	public void addTopic(Course topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(Course topic, String id) {
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}

}
