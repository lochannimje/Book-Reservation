package com.infy.management.InfyBooking.service;

import java.util.ArrayList;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.management.InfyBooking.DTO.BookingDTO;
import com.infy.management.InfyBooking.entity.BookingEntity;
import com.infy.management.InfyBooking.repository.BookingRepository;

@Service

public class BookingService{
	@Autowired
	BookingRepository repo;
	

	public String BookingTicket(BookingDTO dto) throws Exception{
		try {
	
		BookingEntity entity=dto.createEntity(dto);
//		System.out.println(entity.getNoPerson());
		repo.save(entity);
		System.out.println("inside service");
		return "Ticket booked Successfully";
		}catch(Exception e) {
			throw new Exception("Ticket Booking Unsuccessfull,Please Provide correct credentials");
		}
		
	}
	public List<BookingDTO> getTravels(String date) {
		System.out.println("inside service2");
		List<BookingEntity> list=repo.findByDate(date);
		List<BookingDTO> booking=new ArrayList<BookingDTO>();
		for(BookingEntity e:list) {
			System.out.println("inside service3");
			BookingDTO d=BookingDTO.valueof(e);
			booking.add(d);
		}
		return booking;
		
	}
	public List<BookingDTO> getall() {
		List<BookingEntity> en=repo.findAll();
		List<BookingDTO> dto=new ArrayList<BookingDTO>();
		for(BookingEntity e:en) {
			BookingDTO d=BookingDTO.valueof(e);
			dto.add(d);
		}
		
		return dto;
	}
	public String upadateDate(Integer bookingId,String date) {
		BookingEntity en=repo.findByBookingId(bookingId);
		if(en!=null) {
			
			en.setDate(date);
			repo.save(en);
			return "Date updated successfully";
		}
		else {
			return "update failed.Please check the credentials";
			
		}
		
	}
	public BookingDTO getBookingById(Integer bookingId) {
		BookingEntity en=repo.findByBookingId(bookingId);
		BookingDTO dto=BookingDTO.valueof(en);
		// TODO Auto-generated method stub
		return dto;
	}
	
	
}
