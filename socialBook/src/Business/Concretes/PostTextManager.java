package Business.Concretes;


import java.util.ArrayList;

import Business.Abstracts.AuthService;
import DataBase.Abstracts.PostDao;
import Entities.Concretes.Post;
import Entities.Concretes.PostText;
import Entities.Concretes.User;

public class PostTextManager extends BasePostManager<PostText> {

	public PostTextManager(PostDao postDao, AuthService authService) {
		super(postDao, authService);
		// TODO Auto-generated constructor stub
	}
	
	
	public ArrayList<Post> getUserPost(User user) {

			ArrayList<Post> a = new ArrayList<Post>();
			for(Post postDemo : postDao.getAllPost()) {
				if(user.getUserId()==postDemo.getUserId()) {
					a.add(postDemo);
					return a;
				}
				
			}return a;
			
		
		
	}


		

}
