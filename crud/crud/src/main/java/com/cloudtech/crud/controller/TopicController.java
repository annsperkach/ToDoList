package com.cloudtech.crud.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import com.cloudtech.crud.service.TopicService;
import com.cloudtech.crud.entity.Topic;


@RestController
@RequestMapping("/topics")
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@PostMapping
	public Topic addTopic(@RequestBody Topic topic) {
		return topicService.save(topic);
	}
	
	@GetMapping(path = "/{id}")
	public Topic getTopic(@PathVariable int id) {
		return topicService.getTopic(id);
	}
	
	@PutMapping	
	public Topic updateTopic(@RequestBody Topic topic) {
		return topicService.update(topic);
	}
	
	@DeleteMapping(path = "/{id}")
	public String deleteTopic(@PathVariable int id) {
		return topicService.delete(id);
	}

	public TopicService getTopicService() {
		return topicService;
	}

	public void setTopicService(TopicService topicService) {
		this.topicService = topicService;
	}
	
	
}
