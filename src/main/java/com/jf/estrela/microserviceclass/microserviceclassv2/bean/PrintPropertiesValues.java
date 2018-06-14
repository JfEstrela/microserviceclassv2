package com.jf.estrela.microserviceclass.microserviceclassv2.bean;

import javax.annotation.PostConstruct;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class PrintPropertiesValues {
	
	private static final Logger LOGGER = LogManager.getLogger(PrintPropertiesValues.class);
	
	@Autowired
	private PropertiesValues propertiesValues;
	
	@Autowired
	private Environment env;

	
	 @PostConstruct
	 public void print() {
		 LOGGER.info(propertiesValues.getAuthor());
		 LOGGER.info(propertiesValues.getEmail());
		 LOGGER.info(propertiesValues.getProfileName());
		 LOGGER.info(env.getProperty("app.name"));
	 }

}
