package DataBase.Concretes;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import DataBase.Abstracts.UserDao;

import Entities.Concretes.User;

public class MemoryUserDao implements UserDao{

	private ArrayList<User> users;
	private ArrayList<User> friends;
	private ArrayList<User> blockedFriends;


	public MemoryUserDao() {
		users =  new ArrayList<User>() ;
		blockedFriends = new ArrayList<User>();
		friends = new ArrayList<User>();
		User user1 = new User(1,"gokhan","kaya","kaya","55gok55sdasdas",new Date(1999,1,4), "tbal mezunu");
		User user2 = new User(2,"huseyin","akca","akcahuseyin","123546",new Date(2005,5,25), "atatürk mezunu");
		User user3 = new User( 3,"hasan","kara","huseyinkara","karahasan",new Date(2000,4,25), "açýk öðretim mezunu");
		User user4 = new User(4,"ahmet","cakýr","cakýrahmet","cakýrcakýr",new Date(2006,3,25), "msü mezunu");
		User user5 = new User(5,"zeynep","atalay","zeynepatalay ","atalayatalay",new Date(2010,6,25), "tbal mezunu");
		users.add(user1);users.add(user2);users.add(user3);users.add(user4);users.add(user5);
		
	}
	
	
	@Override
	public void addFriend(User user) {
		System.out.println("calýstý");
		friends.add(user);
	

	}

	@Override
	public void removeFriend(User user) {
		friends.remove(user.getUserId());
		
	}

	@Override
	public List<User> getAllFriend() {
		return friends;
	}


	@Override
	public void addBlockedFriend(User user) {
		blockedFriends.add(user);
		friends.remove(user.getUserId());
		
	}


	@Override
	public void removeBlockedFriend(User user) {
		friends.add(user);
		blockedFriends.remove(user.getUserId());
		
		
	}


	@Override
	public List<User> getAllBlockedFriend() {
		return blockedFriends;
	}
	@Override
	public List<User> getAllUser() {
		return users;
	}


	@Override
	public void updateUser(User user) {
		 for(User use : getAllUser()) {
			   if(use.getUserId()==user.getUserId()) {
				   use.setName(user.getName());
				   use.setDateOfBirth(user.getDateOfBirth());
				   use.setDescriptionAboutSchool(user.getDescriptionAboutSchool());
				   use.setSurName(user.getSurName());
				   use.setUserName(user.getUserName());
			   }
		   }
		
	}


	@Override
	public void changePassword(User user) {
		 for(User use : getAllUser()) {
			   if(use.getUserId()==user.getUserId()) {
				   use.setPassword(user.getPassword());
			   }
		 }
		
	}


	@Override
	public void addUser(User user) {
		ArrayList<User> list=users;
		for(User u : list) {
			System.out.println(u.getName());
			
		}
		System.out.println("************************************************");
		list.add(user);
		users=list;
		for(User u : users) {
			System.out.println(u.getName());
			
		}

	}


	@Override
	public void deleteUser(User user) {
		for(User u : users) {
			if(u.getUserId()== user.getUserId()) {
				users.remove(user.getUserId()-1);
				System.out.println("User has been successfully removed.");
				break;
			}else {
				System.out.println("No such user!");
				break;
			}
	
		
	}

	}
	
}
