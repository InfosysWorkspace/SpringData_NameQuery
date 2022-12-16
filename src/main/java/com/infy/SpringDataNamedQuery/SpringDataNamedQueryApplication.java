package com.infy.SpringDataNamedQuery;

import com.infy.SpringDataNamedQuery.service.CustomerServiceImpl;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SpringDataNamedQueryApplication implements CommandLineRunner {

	private static final Log LOGGER = LogFactory.getLog(SpringDataNamedQueryApplication.class);

	@Autowired
	CustomerServiceImpl customerService;

	@Autowired
	Environment environment;


	public static void main(String[] args) {
		SpringApplication.run(SpringDataNamedQueryApplication.class, args);
	}

	@Override
	public void run(String... args){
		findNameByEmailId();
	}

	public void findNameByEmailId(){
		try{
			String name = customerService.findNameByEmailId("buhari@infosys.com");
			LOGGER.info("Customer name : " +name);
		} catch (Exception e){
			if(e.getMessage() != null)
				LOGGER.info(environment.getProperty(e.getMessage(),
						"Something went wrong. Please check log file for more details."));
		}
	}
}
