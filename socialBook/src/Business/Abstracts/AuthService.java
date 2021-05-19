package Business.Abstracts;

import Entities.Concretes.User;

public interface AuthService {

	User register(User user);
	boolean singIn(User user);
	void singOut(User user);
}
