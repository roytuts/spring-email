package com.roytuts.spring.email.mailsender.and.simplemailmessage;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.MailMessage;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class EmailConfig {

	@Bean
	public MailSender mailSender() {
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();

		mailSender.setHost("smtp.gmail.com");
		mailSender.setPort(587);
		mailSender.setUsername("gmail@gmail.com");
		mailSender.setPassword("gmail password");

		Properties javaMailProperties = new Properties();
		javaMailProperties.put("mail.smtp.auth", true);
		javaMailProperties.put("mail.smtp.starttls.enable", true);

		mailSender.setJavaMailProperties(javaMailProperties);

		return mailSender;
	}

	@Bean
	public MailMessage mailMessage() {
		return new SimpleMailMessage();
	}

}
