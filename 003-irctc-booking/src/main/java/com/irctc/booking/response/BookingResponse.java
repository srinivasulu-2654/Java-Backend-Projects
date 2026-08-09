package com.irctc.booking.response;

import java.time.LocalDate;

public class BookingResponse {
	
	private long pnrNumber;
	private long bookingId;
	private LocalDate localDate;
	private int seatNum;
	private String coach;
	private String message;
	public long getPnrNumber() {
		return pnrNumber;
	}
	public void setPnrNumber(long pnrNumber) {
		this.pnrNumber = pnrNumber;
	}
	public LocalDate getLocalDate() {
		return localDate;
	}
	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}
	public int getSeatNum() {
		return seatNum;
	}
	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public long getBookingId() {
		return bookingId;
	}
	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}
	
	
}
