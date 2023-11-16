package com.example.Ecommerce.Model;

public class Video {

	private String title;
	private String metaDescription;
	private String content;
	private String author;
	private String category;
	
	
	
	public Video(String title, String metaDescription, String content, String author, String category) {
		super();
		this.title = title;
		this.metaDescription = metaDescription;
		this.content = content;
		this.author = author;
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



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	@Override
	public String toString() {
		return "Video [title=" + title + ", metaDescription=" + metaDescription + ", content=" + content + ", author="
				+ author + ", category=" + category + "]";
	}
	
	
	
	
}
