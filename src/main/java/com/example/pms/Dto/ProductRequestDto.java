package com.example.pms.Dto;

public class ProductRequestDto {

	String name;
	int price;
	String description;
	String photoUrl;
	public ProductRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductRequestDto(String name, int price, String description, String photoUrl) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
		this.photoUrl = photoUrl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	@Override
	public String toString() {
		return "ProductRequestDto [name=" + name + ", price=" + price + ", description=" + description + ", photoUrl="
				+ photoUrl + "]";
	}
	
}
