package com.infy.management.InfyBooking.DTO;




import com.infy.management.InfyBooking.entity.BookingEntity;




public class BookingDTO{
	
	Integer bookingId;
	Integer serviceId;
	String date;
	String source;
	String deptTime;
	String dest;
	String arrivalTime;
	String travelMode;
	Integer noOfPerson;
	Status status;
	Integer totalAmount ;
	public BookingEntity createEntity(BookingDTO dto) {
		BookingEntity entity =new BookingEntity();
		entity.setBookingId(dto.getBookingId());
		entity.setServiceId(dto.getServiceId());
		entity.setArrivalTime(dto.getArrivalTime());
		entity.setDate(dto.getDate());
		entity.setDeptTime(dto.getDeptTime());
		entity.setDest(dto.getDest());
		entity.setSource(dto.getSource());
		System.out.println("inside dto");
		entity.setNoOfPerson(dto.getNoOfPerson());
		System.out.println("inside dto1");
		entity.setStatus(dto.getStatus());
		entity.setTotalAmount(dto.getTotalAmount());
		entity.setTravelMode(dto.getTravelMode());
		return entity;
		
	}
	public static BookingDTO valueof(BookingEntity entity) {
		BookingDTO dto=new BookingDTO();
		dto.setArrivalTime(entity.getArrivalTime());
		dto.setBookingId(entity.getBookingId());
		dto.setServiceId(entity.getServiceId());
		dto.setDate(entity.getDate());
		dto.setDeptTime(entity.getDeptTime());
		dto.setDest(entity.getDest());
		dto.setSource(entity.getSource());
		dto.setStatus(entity.getStatus());
		dto.setNoOfPerson(entity.getNoOfPerson());
		dto.setTotalAmount(entity.getTotalAmount());
		dto.setTravelMode(entity.getTravelMode());
		return dto;
	}
	
	public Integer getNoOfPerson() {
		return noOfPerson;
	}
	public void setNoOfPerson(Integer noOfPerson) {
		this.noOfPerson = noOfPerson;
	}
	public Integer getBookingId() {
		return bookingId;
	}
	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}
	public Integer getServiceId() {
		return serviceId;
	}
	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDeptTime() {
		return deptTime;
	}
	public void setDeptTime(String deptTime) {
		this.deptTime = deptTime;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getTravelMode() {
		return travelMode;
	}
	public void setTravelMode(String travelMode) {
		this.travelMode = travelMode;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Integer getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}
}
