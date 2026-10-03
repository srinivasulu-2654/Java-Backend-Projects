package com.irctc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.irctc.request.BookingRequest;
import com.irctc.response.BookingResponse;
import com.irctc.service.BookingService;

@RestController
@RequestMapping("/irctc")
public class BookingController {
	
	@Autowired
	BookingService bookingService;
	
	@PostMapping("/bookTicket")
	public BookingResponse ticketBooking(@RequestBody BookingRequest bookingReq)
	{
		BookingResponse response =  bookingService.bookTicket(bookingReq);
		return response;
	}
	
	@GetMapping("/getTickets")
	public List<BookingResponse> getTickets(@RequestParam String userId, @RequestParam String page, @RequestParam String records)
	{
		List<BookingResponse> response = bookingService.getAllTcikets(userId,page,records);
		return response;
	}
}
