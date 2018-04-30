package org.cactuarr.springquickstart.courseapi.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
				new Topic("CD", "Linley", "Dragon"),
				new Topic("BTTH", "Xiao Yan", "Alchemist"),
				new Topic("DE", "Arjay", "Emperor")
				));
	
	public List<Topic> getAllTopics(){
		//return topics;
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id) {
		 return topicRepository.getOne(id);
	}
	
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(Topic id, Topic topic) {
		for(int i = 0; i < topics.size(); i++ ) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
	}

	public void deleteTopic(Topic id, Topic topic) {
		topics.removeIf(t -> t.getId().equals(id));
	}
		
}
