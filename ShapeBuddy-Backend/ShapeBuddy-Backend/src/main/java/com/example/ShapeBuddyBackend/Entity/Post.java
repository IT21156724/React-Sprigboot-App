package com.example.ShapeBuddyBackend.Entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Post {
	
	@Id
	@GeneratedValue
	private int Id;
	
	private String userID;
	private String userName;
	private String imageURL;
	
	private String description;
	private String postImgURL;
	
	private int likes;
	private Timestamp dateTime;
	
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Post(int id, String userID, String userName, String imageURL, String description, String postImgURL,
			int likes, Timestamp dateTime) {
		super();
		Id = id;
		this.userID = userID;
		this.userName = userName;
		this.imageURL = imageURL;
		this.description = description;
		this.postImgURL = postImgURL;
		this.likes = likes;
		this.dateTime = dateTime;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPostImgURL() {
		return postImgURL;
	}

	public void setPostImgURL(String postImgURL) {
		this.postImgURL = postImgURL;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public Timestamp getDateTime() {
		return dateTime;
	}

	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}
	
	

	
}
