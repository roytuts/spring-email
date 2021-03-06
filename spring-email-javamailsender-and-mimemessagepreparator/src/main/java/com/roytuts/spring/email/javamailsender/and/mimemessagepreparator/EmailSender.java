package com.roytuts.spring.email.javamailsender.and.mimemessagepreparator;

import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Component;

@Component
public class EmailSender {

	@Autowired
	private JavaMailSender mailSender;

	public void sendEmail(final String subject, final String message, final String fromEmailAddress,
			final String toEmailAddresses) {
		MimeMessagePreparator preparator = new MimeMessagePreparator() {
			public void prepare(MimeMessage mimeMessage) throws Exception {
				mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmailAddresses));
				mimeMessage.setFrom(new InternetAddress(fromEmailAddress));
				mimeMessage.setSubject(subject);
				mimeMessage.setText(message);
			}
		};
		try {
			mailSender.send(preparator);

			System.out.println("Email sending complete.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
