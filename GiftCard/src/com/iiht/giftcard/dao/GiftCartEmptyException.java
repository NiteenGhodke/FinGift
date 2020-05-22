package com.iiht.giftcard.dao;
@SuppressWarnings("serial")
public class GiftCartEmptyException extends Exception {

	public GiftCartEmptyException()
	{
		super("cart is empty");
		System.out.println("cart is empty");
	}
}
