package com.irctc.booking.request;

import java.time.LocalDate;

public class BookingRequest {
	
	private String userId;
	private String fromStation;
	private String toStation;
	private LocalDate date;
	private String name;
	private String age;
	private String gender;
	private String coachClass;
	private long pnrNumber;
	
	public String getFromStation() {
		return fromStation;
	}
	public void setFromStation(String fromStation) {
		this.fromStation = fromStation;
	}
	public String getToStation() {
		return toStation;
	}
	public void setToStation(String toStation) {
		this.toStation = toStation;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCoachClass() {
		return coachClass;
	}
	public void setCoachClass(String coachClass) {
		this.coachClass = coachClass;
	}
	public long getPnrNumber() {
		return pnrNumber;
	}
	public void setPnrNumber(long pnrNumber) {
		this.pnrNumber = pnrNumber;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}
