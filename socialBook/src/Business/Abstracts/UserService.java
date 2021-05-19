package Business.Abstracts;

import java.util.List;
import Entities.Concretes.User;

public interface UserService {
	void addUser(User user);
	void deleteUser(User user);
	void updateUser(User user);
	void changePassword(User user);
	void addFriend(User user);
	void removeFriend(User user);
	void blockUser(User user);
	void unBlockUser(User user);
	List<User> getAllFriend();
	List<User> getAllBlockedFriend();
}
