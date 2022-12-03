package com.roy.email.service;

import com.roy.email.entity.EmailDetails;

public interface EmailService {

	String sendEmail(EmailDetails emailDetails);
	
	String sendEmailAttachment(EmailDetails emailDetails);
	
}
