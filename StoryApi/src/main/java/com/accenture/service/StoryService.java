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

//	public void updateEmployee(String username, Story story) {
//		getStory(username);
//		storys.put(story.getUsername(), story);
//	}

//	public void removeEmployee(String empid) {
//			getEmployee(empid);
//			employees.remove(empid);
//	}

//	public Story getStory(String username) {
//		Story stry = storys.get(username);
//		if (stry==null)
//			throw new StoryNotFoundException();
//		else
//			return stry;
//	}
	
	public Story getStoryByTitle(String title) {
//		for (Employee emp : employees.values()) {
//			if(emp.getName().equalsIgnoreCase(name))
//				return emp;
//		}
		return storys.values()
				.stream()
				.filter(e -> e.getTitle().equalsIgnoreCase(title))
				.findFirst()
//				.orElseThrow(StoryNotFoundException::new);
	}

	public Collection<Story> getStorys() {
		return storys.values();
	}

}

		
//		REVISE
//	
//	public Employee getEmployeeByName(String name) {
//		for (Employee emp : employees.values()) {
//			if(emp.getName().equalsIgnoreCase(name))
//				return emp;
//		}
//		return employees.values()
//				.stream()
//				.filter(e -> e.getName().equalsIgnoreCase(name))
//				.findFirst()
//				.orElseThrow(EmployeeNotFoundException::new);
//	}

	