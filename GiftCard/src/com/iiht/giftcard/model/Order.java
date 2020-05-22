package com.iiht.giftcard.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tborder",schema="giftcard")
public class Order {
	@Id
	private int orderId;
	private long orderDate;
	private String receipantFirstName;
	private String receipantLastName;
	private double giftCardValue;
	private double amountPay;
	private long receipantMobile;
	private String address;
	private String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public long getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(long orderDate) {
		this.orderDate = orderDate;
	}
	public String getReceipantFirstName() {
		return receipantFirstName;
	}
	public void setReceipantFirstName(String receipantFirstName) {
		this.receipantFirstName = receipantFirstName;
	}
	public String getReceipantLastName() {
		return receipantLastName;
	}
	public void setReceipantLastName(String receipantLastName) {
		this.receipantLastName = receipantLastName;
	}
	public double getGiftCardValue() {
		return giftCardValue;
	}
	public void setGiftCardValue(double giftCardValue) {
		this.giftCardValue = giftCardValue;
	}
	public double getAmountPay() {
		return amountPay;
	}
	public void setAmountPay(double amountPay) {
		this.amountPay = amountPay;
	}
	public long getReceipantMobile() {
		return receipantMobile;
	}
	public void setReceipantMobile(long receipantMobile) {
		this.receipantMobile = receipantMobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Order() {
		
	}
	
}
