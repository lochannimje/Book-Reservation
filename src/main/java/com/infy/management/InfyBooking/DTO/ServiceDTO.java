package com.infy.management.InfyBooking.DTO;






public class ServiceDTO {

	


	private Integer serviceId;
	private String date;
	private Integer noOfPersons;
	private String source;
	private String deptTime;
	private String dest;
	private String arrivalTime;
	private String travelMode;
	private Integer seatsAvailable;
	private String shareMode;
	private Integer price;


	public Integer getServiceId() {
		return serviceId;
	}

	public String getDate() {
		return date;
	}

	public Integer getNoOfPersons() {
		return noOfPersons;
	}

	public String getSource() {
		return source;
	}

	public String getDeptTime() {
		return deptTime;
	}

	public String getDest() {
		return dest;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public String getTravelMode() {
		return travelMode;
	}

	public Integer getSeatsAvailable() {
		return seatsAvailable;
	}

	public String getShareMode() {
		return shareMode;
	}

	public Integer getPrice() {
		return price;
	}

	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setNoOfPersons(Integer noOfPersons) {
		this.noOfPersons = noOfPersons;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public void setDeptTime(String deptTime) {
		this.deptTime = deptTime;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public void setTravelMode(String travelMode) {
		this.travelMode = travelMode;
	}

	public void setSeatsAvailable(Integer seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}

	public void setShareMode(String shareMode) {
		this.shareMode = shareMode;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	


}
