package com.prokarma.customer.publisher.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.prokarma.customer.publisher.model.InvalidCodeException;
import com.prokarma.customer.publisher.model.PublisherErrorResponse;
import com.prokarma.customer.publisher.model.RequestBindingException;
import com.prokarma.customer.publisher.model.ResourceNotFoundException;
import com.prokarma.customer.publisher.model.UnAuthoroizedException;

@ControllerAdvice
public class CustomerPublisherControllerAdvice {
	public ResponseEntity<PublisherErrorResponse> handleException(RequestBindingException ex, HttpServletRequest re) {

		PublisherErrorResponse publisherResponse = new PublisherErrorResponse();
		publisherResponse.setStatusCode(HttpStatus.BAD_REQUEST.value());
		publisherResponse.setMessage("headers are missing:" + ex.getMessage());
		return new ResponseEntity<PublisherErrorResponse>(publisherResponse, HttpStatus.BAD_REQUEST);

	}

	public ResponseEntity<PublisherErrorResponse> handleException(UnAuthoroizedException ex, HttpServletRequest re) {

		PublisherErrorResponse publisherResponse = new PublisherErrorResponse();
		publisherResponse.setStatusCode(HttpStatus.UNAUTHORIZED.value());
		publisherResponse.setMessage("authorization failed:" + ex.getMessage());
		return new ResponseEntity<PublisherErrorResponse>(publisherResponse, HttpStatus.UNAUTHORIZED);

	}

	public ResponseEntity<PublisherErrorResponse> handleException(ResourceNotFoundException ex, HttpServletRequest re) {

		PublisherErrorResponse publisherResponse = new PublisherErrorResponse();
		publisherResponse.setStatusCode(HttpStatus.NOT_FOUND.value());
		publisherResponse.setMessage("url or requestbody is invalid:" + ex.getMessage());
		return new ResponseEntity<PublisherErrorResponse>(publisherResponse, HttpStatus.NOT_FOUND);

	}

	public ResponseEntity<PublisherErrorResponse> handleException(InvalidCodeException ex, HttpServletRequest re) {

		PublisherErrorResponse publisherResponse = new PublisherErrorResponse();
		publisherResponse.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		publisherResponse.setMessage("Error in the code:" + ex.getMessage());
		return new ResponseEntity<PublisherErrorResponse>(publisherResponse, HttpStatus.INTERNAL_SERVER_ERROR);

	}

}
