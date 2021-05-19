package DataBase.Abstracts;

import java.util.List;

import Entities.Concretes.User;

public interface UserDao {
	void addUser(User user);
	void deleteUser(User user);
	void addFriend(User user);
	void updateUser(User user);
	void changePassword(User user);
	void addBlockedFriend(User user);
	void removeBlockedFriend(User user);
	void removeFriend(User user);
	List<User> getAllFriend();
	List<User> getAllBlockedFriend();
	List<User> getAllUser();
	

}
