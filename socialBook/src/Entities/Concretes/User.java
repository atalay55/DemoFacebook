package Entities.Concretes;

import java.util.Date;

import Entities.Abstracts.Entity;

public class User implements Entity{
	private int userId;
	private String name;
	private String surName;
	private String userName;
	private String password;
	private Date dateOfBirth;
	private String descriptionAboutSchool;
	
	
	public User(int userId, String name, String surName, String userName, String password, Date dateOfBirth,
			String descriptionAboutSchool) {
		super();
		this.userId = userId;
		this.name = name;
		this.surName = surName;
		this.userName = userName;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.descriptionAboutSchool = descriptionAboutSchool;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getDescriptionAboutSchool() {
		return descriptionAboutSchool;
	}
	public void setDescriptionAboutSchool(String descriptionAboutSchool) {
		this.descriptionAboutSchool = descriptionAboutSchool;
	}
	

}
