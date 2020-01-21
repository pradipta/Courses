package com.pradipta.courses.topic;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	@Autowired
	private TopicRepository repository;
	
//	private List<Topic> topics;
//	
//	public TopicService() {
//		topics = new ArrayList<> (Arrays.asList(new Topic("1", "T1", "D1"),
//				new Topic("2", "T2", "D2"),
//				new Topic("3", "T3", "D3")));
//	}
	
	public List<Topic> getTopics(){
		List<Topic> topics = new ArrayList<>();
		repository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id) {
		return repository.findById(id).get();
	}
	
	public Topic addTopic(Topic topic) {
		return repository.save(topic);
	}

	public void deleteTopic(String id) {
		repository.deleteById(id);
	}
	
}
