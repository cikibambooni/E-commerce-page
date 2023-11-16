package com.example.Ecommerce.Model;

public class BackingTracks {

	private String title;
	private String metaDescription;
	private String content;
	private String author;
	private double price;
	private String currency;
	private String category;
	
	
	
	public BackingTracks(String title, String metaDescription, String content, String author, double price,
			String currency, String category) {
		super();
		this.title = title;
		this.metaDescription = metaDescription;
		this.content = content;
		this.author = author;
		this.price = price;
		this.currency = currency;
		this.category = category;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getMetaDescription() {
		return metaDescription;
	}



	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public String getCurrency() {
		return currency;
	}



	public void setCurrency(String currency) {
		this.currency = currency;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	@Override
	public String toString() {
		return "BackingTracks [title=" + title + ", metaDescription=" + metaDescription + ", content=" + content
				+ ", author=" + author + ", price=" + price + ", currency=" + currency + ", category=" + category + "]";
	}
	
	
	
	
	
}
