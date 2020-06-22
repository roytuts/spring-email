package com.roytuts.spring.email.using.template.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VelocityEmailTemplateLibraryApp implements CommandLineRunner {

	@Autowired
	private EmailSender emailSender;

	public static void main(String[] args) {
		SpringApplication.run(VelocityEmailTemplateLibraryApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		emailSender.sendEmailUsingVelocityTemplate("Email using Velocity Template Library",
				"Email Message using MimeMessagePreparator and Velocity Template Library", "gmail@gmail.com",
				"gmail@gmail.com", new User("John", "john@email.com"));
	}

}
