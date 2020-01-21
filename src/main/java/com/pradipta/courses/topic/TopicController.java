package com.pradipta.courses.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@Autowired
	private TopicService service;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return service.getTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return service.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public Topic addTopic(@RequestBody Topic topic) {
		//System.out.println("Here: "+topic.getDesc()+" "+topic.getId()+" "+topic.getTitle());
		return service.addTopic(topic);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		service.deleteTopic(id);
	}
}
