package com.mvc;

public class Product {
    private int proId;
    private String prodName;
    private int quantity;
    private double price;
	public Product() {
		super();
	}
	public Product(int proId, String prodName, int quantity, double price) {
		super();
		this.proId = proId;
		this.prodName = prodName;
		this.quantity = quantity;
		this.price = price;
	}
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [proId=" + proId + ", prodName=" + prodName + ", quantity=" + quantity + ", price=" + price
				+ "]";
	}
    
    
}
