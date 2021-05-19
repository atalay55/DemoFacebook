package Entities.Concretes;

import java.util.ArrayList;
import java.util.Date;

import Entities.Abstracts.Entity;


public class Video extends  Post implements Entity  {
	private int postId;
	private String videoPath;
	private Date videoDate;
	private int duration;
//	private long location;
	private ArrayList<String> taggedFriend;

	
	
	public Video(int postId, String videoPath, Date videoDate, ArrayList<String> taggedFriend,int duration) {
//		this.setLocation(location);
		this.taggedFriend=taggedFriend;
		this.postId = postId;
		this.duration=duration;
		this.videoPath = videoPath;
		this.setVideoDate(videoDate);
	}
	
	

	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public String getVideoPath() {
		return videoPath;
	}
	public void setVideoPath(String videoPath) {
		this.videoPath = videoPath;
	}
	public Date getVideoDate() {
		return videoDate;
	}
	public void setVideoDate(Date videoDate) {
		this.videoDate = videoDate;
	}



//	public long getLocation() {
//		return location;
//	}
//
//
//
//	public void setLocation(long location) {
//		this.location = location;
//	}





	public int getDuration() {
		return duration ;
		
	}



	public void setDuration(int duration) {
		this.duration = duration;
	}



	public ArrayList<String> taggedFriend() {
		return taggedFriend;
	}



	public void setTaggedFriend(ArrayList<String> taggedFriend) {
		this.taggedFriend = taggedFriend;
	}










}
