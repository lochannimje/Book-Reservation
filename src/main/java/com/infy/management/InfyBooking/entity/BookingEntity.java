package com.infy.management.InfyBooking.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.GetMapping;

import com.infy.management.InfyBooking.DTO.Status;



@Entity
@Table(name="bookings")
public class BookingEntity{
	@Id
	@Column(name="booking_id",nullable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer bookingId;
	@Column(name="service_id",nullable=false)
	Integer serviceId;
	@Column(name="date",nullable=false)
	String date;
	@Column(name="source",nullable=false)
	String source;
	@Column(name="dept_time",nullable=false)
	String deptTime;
	@Column(name="dest",nullable=false)
	String dest;
	@Column(name="arrival_time",nullable=false)
	String arrivalTime;
	@Column(name="travel_mode",nullable=false)
	String travelMode;
	
	@Column(name="no_of_person")
	Integer noOfPerson;
	@Column(name="status")
	@Enumerated(EnumType.STRING)
	Status status;
	@Column(name="total_amount")
	Integer totalAmount ;
	
	public Integer getNoOfPerson() {
		return noOfPerson;
	}
	public void setNoOfPerson(Integer noOfPerson) {
		this.noOfPerson = noOfPerson;
	}
	
	
	public Integer getServiceId() {
		return serviceId;
	}
	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}
	
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}
	public Integer getBookingId() {
		return bookingId;
	}
	public void setDate(String string) {
		this.date = string;
	}
	public String getDate() {
		return date;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public String getDest() {
		return dest;
	}
	public void setDeptTime(String deptTime) {
		this.deptTime = deptTime;
	}
	public String getDeptTime() {
		return deptTime;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getSource() {
		return source;
	}
	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Integer getTotalAmount() {
		return totalAmount;
	}
	public void setTravelMode(String travelMode) {
		this.travelMode = travelMode;
	}
	public String getTravelMode() {
		return travelMode;
	}
	public void setStatus(Status status2) {
		this.status = status2;
	}
	public Status getStatus() {
		return status;
	}
	
}
