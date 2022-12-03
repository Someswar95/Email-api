package com.roy.email.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.roy.email.entity.EmailDetails;
import com.roy.email.service.EmailService;

@RestController
public class EmailController {

	@Autowired
	private EmailService emailService;
	
	@PostMapping("/sendMail")
	public String sendEmail(@RequestBody EmailDetails emailDetails) {
		String status = this.emailService.sendEmail(emailDetails);
		return status;
	}
	
//	@PostMapping("/sendMailAttachment")
//	public String sendEmailAttachment(@RequestBody EmailDetails emailDetails) {
//		String status = this.emailService.sendEmailAttachment(emailDetails);
//		return status;
//	}
	
}
