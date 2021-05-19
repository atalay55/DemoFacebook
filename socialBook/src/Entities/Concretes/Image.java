package Entities.Concretes;

import java.util.ArrayList;
import java.util.Date;

import Entities.Abstracts.Entity;



public class Image extends Post implements Entity {
	private int postId;
	private String imagePath;
	private Date imageDate;
	private String resolution;
//	private long location;
	private ArrayList<String> taggedFriend;



	
	
	public Image(int postId, String imagePath, Date imageDate,ArrayList<String> taggedFriend ,String resolution) {
		this.postId = postId;
		this.imagePath = imagePath;
		this.imageDate = imageDate;
		this.resolution=resolution;
//		this.setLocation(location);
		this.setTaggedFriend(taggedFriend);
	}

	
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public Date getImageDate() {
		return imageDate;
	}
	public void setImageDate(Date imageDate) {
		this.imageDate = imageDate;
	}

//
//	public long getLocation() {
//		return location;
//	}
//
//
//	public void setLocation(long location) {
//		this.location = location;
//	}





	public String getResolution() {
		return resolution;
	}


	public void setResolution(String resolution) {
		this.resolution = resolution;
	}


	public ArrayList<String> taggedFriend() {
		return taggedFriend;
	}


	public void setTaggedFriend(ArrayList<String> taggedFriend) {
		this.taggedFriend = taggedFriend;
	}




	

}
