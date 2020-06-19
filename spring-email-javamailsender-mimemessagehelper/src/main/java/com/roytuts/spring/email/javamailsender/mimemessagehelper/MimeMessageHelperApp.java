package com.roytuts.spring.email.javamailsender.mimemessagehelper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MimeMessageHelperApp implements CommandLineRunner {

	@Autowired
	private EmailSender emailSender;

	public static void main(String[] args) {
		SpringApplication.run(MimeMessageHelperApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		emailSender.sendEmail("MimeMessageHelper", "Email Message using MimeMessageHelper", "gmail@gmail.com",
				"gmail@gmail.com", true);
	}

}
