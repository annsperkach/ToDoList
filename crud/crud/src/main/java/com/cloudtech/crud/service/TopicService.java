package com.cloudtech.crud.service;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.cloudtech.crud.repository.TopicRepository;
import com.cloudtech.crud.entity.Topic;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	public Topic save(Topic top) {
		return topicRepository.save(top);
	}

	
	public Topic getTopic(int id) {
		return topicRepository.findById(id).get();
	}
	
	public Topic update(Topic topic) {
		Topic top = topicRepository.findById(topic.getId()).get();
		top.setName(topic.getName());
		top.setDescription(topic.getDescription());
		
		return topicRepository.save(top);
	}
	
	public String delete(int id) {
		topicRepository.deleteById(id);
		return "Entity deleted " + id;
	}

	public TopicRepository getTopicRepository() {
		return topicRepository;
	}

	public void setTopicRepository(TopicRepository topicRepository) {
		this.topicRepository = topicRepository;
	}
	
}
