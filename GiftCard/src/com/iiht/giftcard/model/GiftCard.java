package com.iiht.giftcard.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbgiftcard",schema="giftcard")
public class GiftCard {
	@Id
	private int giftCardId;
	private String receipantName;
	private String orderDate;
	private double value;
	private double commission;
	private String status;
	public int getGiftCardId() {
		return giftCardId;
	}
	public void setGiftCardId(int giftCardId) {
		this.giftCardId = giftCardId;
	}
	public String getReceipantName() {
		return receipantName;
	}
	public void setReceipantName(String receipantName) {
		this.receipantName = receipantName;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
