package Business.Concretes;

import java.util.ArrayList;

import Business.Abstracts.AuthService;
import DataBase.Abstracts.PostDao;
import DataBase.Abstracts.UserDao;
import Entities.Concretes.Post;
import Entities.Concretes.User;

public abstract class BasePostManager<T extends Post> {
	PostDao postDao;
	AuthService authService;
	UserDao userDao;
	
	public BasePostManager(PostDao postDao, AuthService authService) {
		this.authService = authService;
		this.postDao = postDao;

	}

	public void addPost(User user, T post) {
		if (authService.singIn(user)) {
			System.out.println("geldim3");
			postDao.addPost(post);
		} else {
			System.out.println("giris yapmanýz gerekir");
		}
	}

	public void deletePost(User user, T post) {
		if (authService.singIn(user)) {

			postDao.deletePost(post);

		} else {
			System.out.println("giris yapmanýz gerekir");
		}

	}

	public ArrayList<Post> getAllpost(){
		
		return postDao.getAllPost();
	
}


}
		

