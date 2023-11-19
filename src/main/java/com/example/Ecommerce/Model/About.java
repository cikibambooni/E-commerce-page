package com.example.Ecommerce.Model;

import java.util.List;

public class About {
	
		private String title;
	private String metaDescription;
	private String content;
	private String author;
	private List<String> imageUrl;
	private List<String> tags;
	
	
	
	public About(String title, String metaDescription, String content, String author, List<String> imageUrl,
			List<String> tags) {
		super();
		this.title = title;
		this.metaDescription = metaDescription;
		this.content = content;
		this.author = author;
		this.imageUrl = imageUrl;
		this.tags = tags;
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



	public List<String> getImageUrl() {
		return imageUrl;
	}



	public void setImageUrl(List<String> imageUrl) {
		this.imageUrl = imageUrl;
	}



	public List<String> getTags() {
		return tags;
	}



	public void setTags(List<String> tags) {
		this.tags = tags;
	}



	@Override
	public String toString() {
		return "About [title=" + title + ", metaDescription=" + metaDescription + ", content=" + content + ", author="
				+ author + ", imageUrl=" + imageUrl + ", tags=" + tags + "]";
	}
	
	
	
	
}


