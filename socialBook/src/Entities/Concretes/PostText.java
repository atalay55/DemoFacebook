package Entities.Concretes;

import java.util.ArrayList;
import java.util.Date;

import Entities.Abstracts.Entity;

public class PostText  extends Post implements Entity{

	private Date postAddedDate;
	private String aboutPost;
//	private long location;
	private ArrayList<String> taggedFriend;
	
	public PostText() {};
	
	public PostText(int id, int userId, String aboutPost,Date postAddedDate, ArrayList<String> taggedFriend) {
	
		this.postAddedDate = postAddedDate;
		this.aboutPost = aboutPost;
		this.taggedFriend=taggedFriend;
//		this.location=location;
	}
	
	
	
	public Date getPostAddedDate() {
		return postAddedDate;
	}
	public void setPostAddedDate(Date postAddedDate) {
		this.postAddedDate = postAddedDate;
	}

	public String getAboutPost() {
		return aboutPost;
	}
	public void setAboutPost(String aboutPost) {
		this.aboutPost = aboutPost;
	}


	public ArrayList<String> taggedFriend() {
		return taggedFriend;
	}

	public void setTaggedFriend(ArrayList<String> taggedFriend) {
		this.taggedFriend = taggedFriend;
	}



//	public long getLocation() {
//		return location;
//	}
//
//	public void setLocation(long location) {
//		this.location = location;
//	}

	
}
