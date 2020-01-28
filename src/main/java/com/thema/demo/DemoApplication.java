package com.thema.demo;

import com.thema.demo.domain.Subscriber;
import com.thema.demo.domain.SubscriberRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(SubscriberRepository repository){

		return args -> {
			repository.save(new Subscriber("Dan","Vega","danvega@gmail.com"));
		};
	}

}
