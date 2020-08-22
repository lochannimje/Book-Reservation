package com.infy.management.InfyBooking.controller;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.infy.management.InfyBooking.DTO.BookingDTO;
import com.infy.management.InfyBooking.DTO.ServiceDTO;
import com.infy.management.InfyBooking.DTO.Status;
import com.infy.management.InfyBooking.service.BookingService;

@RestController
@CrossOrigin
//@EnableAutoConfiguration

//@RequestMapping(value="/booking")
public class BookingController {
	
	
	
	@Autowired
	BookingService bookingService;
	
	@Autowired
	RestTemplate template;
	
	@PostMapping(value = "/booking/",  consumes = MediaType.APPLICATION_JSON_VALUE)
	public String BookingTicket(@RequestBody BookingDTO dto) throws Exception{
		System.out.println("inside cont");
		ServiceDTO service=template.getForObject("http://VIEWAVAILABILITY/"+dto.getServiceId(),ServiceDTO.class);
		System.out.println(service.getSeatsAvailable());
		System.out.println(dto.getNoOfPerson());
		
		if(dto.getNoOfPerson()<=service.getSeatsAvailable()){
		dto.setTotalAmount(service.getPrice());
		
		dto.setDate(service.getDate());
		dto.setArrivalTime(service.getArrivalTime());
		dto.setDeptTime(service.getDeptTime());
		dto.setDest(service.getDest());
		dto.setSource(service.getSource());
		dto.setTravelMode(service.getTravelMode());
		
		if(service.getShareMode().equals("Yes")) {
			System.out.println("inside cont1");
			Integer price=service.getPrice()*service.getNoOfPersons();
			Integer discountAmount=(int)(0.05*price);
			Integer finalAmount=price-discountAmount;
			dto.setTotalAmount(finalAmount);
		}
		dto.setStatus(Status.Confirmed);
		System.out.println(dto.getStatus());
		String message=bookingService.BookingTicket(dto);
		System.out.println("inside cont2");
		return message;
		}
		else {
			throw new Exception("Seats not available");
		}
	}
	
	@GetMapping(value="/booking/{date}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<BookingDTO> getTravels(@PathVariable String date) {
		System.out.println("inside const1");
		List<BookingDTO> dto=bookingService.getTravels(date);
		System.out.println("inside const2");
		return dto;
	}
	
	@GetMapping(value="/booking/Id/{bookingId}",produces=MediaType.APPLICATION_JSON_VALUE)
	public BookingDTO getBookingById(@PathVariable Integer bookingId) {
		BookingDTO dto=bookingService.getBookingById(bookingId);
		return dto;
	}

	
	
	
	@GetMapping(value="/booking/", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<BookingDTO> getBookingAll() {
		System.out.println("inside cont3");
		List<BookingDTO> booking=bookingService.getall();
		System.out.println("inside const4");
		return booking;
	}
	
	@PutMapping(value="/booking/{bookingId}/{date}")
	public String updateDate(@PathVariable Integer bookingId,@PathVariable String date) {
		
		String message=bookingService.upadateDate(bookingId,date);
		
		return message;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
