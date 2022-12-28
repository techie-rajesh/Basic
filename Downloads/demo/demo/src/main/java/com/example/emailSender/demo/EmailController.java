package com.example.emailSender.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/G")
public class EmailController {
	@Autowired
	EmailService es;
	@GetMapping(value="/mail")
	public String emailSend()  // error fix pom.xml line (32-35) from stackoverflow website
	{
		return es.emilSend();
	}
	@PostMapping(value="/mailAttach")
	public String emailSendWithAttach() {
		return es.emailSendWithAttach();
	}
}
