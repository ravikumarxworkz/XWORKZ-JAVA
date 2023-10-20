package com.things;

public class EncapsulationKsrtc {

	 
	private String busName;
	private int busNumber;
	private int numberOfSeats;
	private String to;
	private String from;
	public EncapsulationKsrtc(String busName, int busNumber, int numberOfSeats, String to, String from) {
		this.busName = busName;
		this.busNumber = busNumber;
		this.numberOfSeats = numberOfSeats;
		this.to = to;
		this.from = from;
	}
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public int getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	
	

}
