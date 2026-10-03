package com.irctc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="irctc_paymentPrac")
public class PaymentEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long payment_id;
	private Long bookingId;
	private Double amount;
	private String transactionId;
	private String paymentStatus;
	public Long getPayment_id() {
		return payment_id;
	}
	public void setPayment_id(Long payment_id) {
		this.payment_id = payment_id;
	}
	public Long getBookingId() {
		return bookingId;
	}
	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
	
	
}