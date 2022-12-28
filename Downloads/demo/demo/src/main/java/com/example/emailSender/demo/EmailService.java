package com.example.emailSender.demo;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {

	@Autowired
	JavaMailSender mailSender;
	public String emilSend() {
		
		SimpleMailMessage sms=new SimpleMailMessage();
		sms.setFrom("vrajeshraju1@gmail.com");
		sms.setTo("vrajeshraju13@gmail.com");
		sms.setSubject("greet");
		sms.setText("Hello rajesh, welcome to our company");
		
		mailSender.send(sms);
		
		return "Gmail send successfully";
	}
	public String emailSendWithAttach() {
		try {
		MimeMessage sms_1=mailSender.createMimeMessage();
		MimeMessageHelper smsHelp=new MimeMessageHelper(sms_1,true);
		
		smsHelp.setFrom("vrajeshraju1@gmail.com");
		smsHelp.setTo("vrajeshraju13@gmail.com");
		smsHelp.setSubject("greet");
		smsHelp.setText("Hello rajesh, welcome to our company");
		
		File file=new File("G:\\into.txt"); // like this we can add multiple file attached
		smsHelp.addAttachment(file.getName(), file);
		
		mailSender.send(sms_1);
		
		return "Mail send successfully";
		}
		catch(Exception e) {
			
			return "Mail not send";
		}
		
	}

}
