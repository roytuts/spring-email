package com.roytuts.spring.email.attachment.mimemessagehelper;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailAttachmentApp implements CommandLineRunner {

	@Autowired
	private EmailSender emailSender;

	public static void main(String[] args) {
		SpringApplication.run(EmailAttachmentApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		emailSender.sendEmailAttachment("Email Attachment", "Email Attachment using MimeMessageHelper",
				"gmail@gmail.com", "gmail@gmail.com", true, new File("C:/jee_workspace/sample.xlsx"));
	}

}
