package com.accenture.controller;

import java.net.URI;
import java.util.Collection;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.accenture.model.Employee;
import com.accenture.service.EmployeeService;

@CrossOrigin(origins = "*")
@RestController
public class StoryController {

	@Autowired
	EmployeeService StoryService;

	@GetMapping("/story")
	public Collection<Story> getStorys() {
		return storyService.getStorys();

	}

	@GetMapping("/story/{username}")
	public ResponseEntity<?> getStory(@PathVariable String username) {
		return ResponseEntity.ok(storyService.getStory(username));
	}

	//title
//	@GetMapping("/employee/name/{name}")
//	public Employee getEmployeeByName(@PathVariable String name) {
//		return employeeService.getEmployeeByName(name);
//	}

	@PostMapping("/story")
	public ResponseEntity<?> addStory(@Valid @RequestBody Story story) {
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{username}")
				.buildAndExpand(story.getUsername()).toUri();
		storyService.addEmployee(story);
		return ResponseEntity.created(location).body("Story Created!");
	}

//	@PutMapping("/storu/{username}")
//	public ResponseEntity<?> updateStory(@PathVariable String username,@Valid @RequestBody Story story) {
//		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{username}")
//				.buildAndExpand(story.getUsername()).toUri();
//		storyService.updateStory(username,story);
//		return ResponseEntity.created(location).body("Story Created!");
//
//	}

//	@DeleteMapping("/story/{username}")
//	public ResponseEntity<?> deleteEmployee(@PathVariable String username) {
//		storyService.removeStory(username);
//		return ResponseEntity.noContent().build();
//	}

}
