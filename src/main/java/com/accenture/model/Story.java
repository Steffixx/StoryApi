package com.accenture.model;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Story {
	public Story() {
	}

	public Story(String username, String body, String title) {
		super();
		this.username = username;
		this.body = body;
		this.title = title;
	}
	@NotEmpty
	@NotNull
	private String username;
	
	@NotEmpty
	@NotNull
	private String body;
	
	@NotEmpty
	@NotNull
	private String title;
	
	public String getUsername() {
		return username;
	}

	public void setEmpid(String username) {
		this.username = username;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Story [username=" + username + ", title=" + title + ", body=" + body + "]";
	}

}
