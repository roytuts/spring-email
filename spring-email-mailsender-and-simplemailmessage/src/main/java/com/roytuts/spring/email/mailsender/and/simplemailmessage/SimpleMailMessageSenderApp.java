package com.roytuts.spring.email.mailsender.and.simplemailmessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleMailMessageSenderApp implements CommandLineRunner {

	@Autowired
	private EmailSender emailSender;

	public static void main(String[] args) {
		SpringApplication.run(SimpleMailMessageSenderApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		emailSender.sendEmail("Test Subject", "Test Message", new String[] { "gmail@gmail.com" });
	}

}
