package com.cart;

public class Item {
	
	private String itemId;
	private String itemName;
	private float unitPrice;
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(String itemId, String itemName, float unitPrice) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
	}
	
	

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", unitPrice=" + unitPrice + "]";
	}
	
	
	
	

}
