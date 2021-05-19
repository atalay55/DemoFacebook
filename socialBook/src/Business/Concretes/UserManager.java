package Business.Concretes;

import java.util.List;
import Business.Abstracts.AuthService;
import Business.Abstracts.UserService;
import DataBase.Abstracts.UserDao;


import Entities.Concretes.User;

public class UserManager implements UserService{

	private UserDao userDao;
	private AuthService authService;

	public UserManager(UserDao userDao, AuthService authService) {
		
		this.authService = authService;
		this.userDao = userDao;
	}


	@Override
	public void addFriend(User user) {
		if (authService.singIn(user)) {
			System.out.println("calýstý");

			userDao.addFriend(user);

		}
	}

	@Override
	public void removeFriend(User user) {
		if(authService.singIn(user)) {
		userDao.removeFriend(user);
		
	}
	}
	
	@Override
	public void blockUser(User user) {
		if(authService.singIn(user)) {
		for(User use :userDao.getAllFriend()) {
			if(use.getUserId()==user.getUserId()) {
				userDao.addBlockedFriend(user);
			}else {
				System.out.println("Error not founded user");
			}
			
		}
		
	}
	}
	@Override
	public void unBlockUser(User user) {
		if (authService.singIn(user)) {
			for (User use : userDao.getAllBlockedFriend()) {
				if (use.getUserId() == user.getUserId()) {
					userDao.removeBlockedFriend(user);
				} else {
					System.out.println("Error not founded user");
				}

			}

		} else {
			System.out.println("please login!");
		}

	}

	@Override
	public List<User> getAllFriend() {
		
		return userDao.getAllFriend();
	
	}
	@Override
	public List<User> getAllBlockedFriend() {
		
		return userDao.getAllBlockedFriend();
	}
	
	
	@Override
	public void updateUser(User user) {
	   userDao.updateUser(user);
		
	}

	@Override
	public void changePassword(User user) {
		userDao.changePassword(user);
		
	}


	@Override
	public void addUser(User user) {
		userDao.addUser(authService.register(user));
		
	}


	@Override
	public void deleteUser(User user) {
		userDao.deleteUser(user);
		
		
	}

	
	

}