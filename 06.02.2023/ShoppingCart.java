package com.cart;

public class ShoppingCart {
	
	private int cartId;
	private String name;
	private Item item ;
	private double totalBill;
	
	public ShoppingCart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ShoppingCart(int cartId, String name) {
		super();
		this.cartId = cartId;
		this.name = name;
		totalBill=0.0;
		
	}
	
	public ShoppingCart(int cartId, String name, Item item) {
		this(cartId,name);
		this.item = item;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
		this.totalBill= totalBill+item.getUnitPrice();
	}
	
	
	public double getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}
	@Override
	public String toString() {
		return "ShoppingCart [cartId=" + cartId + ", name=" + name + ", Total Bill=" + totalBill + "]";
	}
	
	

}
