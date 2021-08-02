package com.prokarma.customer.publisher.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prokarma.customer.publisher.model.PublisherRequest;

@RestController
@RequestMapping("/customer")
public class PublisherController {
	private static final Logger logger = LogManager.getLogger(PublisherController.class.getName());
    
	@PostMapping(path = "/publisherDeatils", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String publisherCustomerDeatils(
			@RequestHeader(value = "Authorization", required = true) String authorization,
			@RequestHeader(value = "Transaction-Id", required = true) String transactionId,
			@RequestHeader(value = "Activity-Id", required = true) String activityId,
			@RequestBody PublisherRequest request) {
		logger.info("authorization token" +authorization);
		return null;

	}

}
