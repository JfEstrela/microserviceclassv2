package com.jf.estrela.microserviceclass.microserviceclassv2.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertiesValues implements Serializable{
	

	private static final long serialVersionUID = -3752577598075104754L;

	@Value("${app.author.email}")
	private String email;
	
	@Value("${app.author}")
	private String author;
	
	@Value("${app.profile.name}")
	private String profileName;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	
	
	

}
