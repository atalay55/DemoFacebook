package Business.Concretes;

import Business.Abstracts.AuthService;
import DataBase.Abstracts.UserDao;
import Entities.Concretes.User;

public class AuthManager implements AuthService {

	UserDao userDao;
	
	public AuthManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public boolean singIn(User user) {
		for (User u :userDao.getAllUser()) {
//			System.out.println(user.getUserName());
//			System.out.println(u.getUserName());
		if ( u.getPassword() == user.getPassword() && u.getUserName()==user.getUserName() ){
//				System.out.println(user.getUserName() + " " +" giris basarili");
				return true;
		}
		
		}return false;
	}

	@Override
	public void singOut(User user) {
		if (singIn(user)) {
			System.out.println("logout successful");
		}else {
			System.out.println("something went wrong");
		}
		
	}

	@Override
	public User register(User user) {
		
		return user ;
	}

}
