package com.accenture.service;

import java.util.Collection;
import java.util.TreeMap;

import org.springframework.stereotype.Service;

import com.accenture.exception.EmployeeNotFoundException;
import com.accenture.model.Employee;
import com.accenture.model.Story;

@Service
public class StoryService {

	TreeMap<String, Story> storys = new TreeMap<>();

	public StoryService() {
		Story e = new Story ("usernameTEST" + 1, "TitleTEST" + 1, "bodyTEST" + 1 );
		this.addStory(e);
	}

	public void addStory(Story story) {
		storys.put(story.getUsername(), story);
	}

	public Story getStory(String username) {
		Story stry = storys.get(username);
			return stry;
	}
	
//	public Story getStoryByTitle(String title) {
//		return storys.values()
//				.stream()
//				.filter(e -> e.getTitle().equalsIgnoreCase(title))
//				.findFirst()
//	}

	public Collection<Story> getStorys() {
		return storys.values();
	}

}

	