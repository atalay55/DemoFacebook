
import java.util.Date;

import Business.Concretes.AuthManager;
import Business.Concretes.BasePostManager;
import Business.Concretes.ImagePostManager;
import Business.Concretes.PostTextManager;
import Business.Concretes.UserManager;
import Business.Concretes.VideoPostManager;
import DataBase.Abstracts.PostDao;
import DataBase.Concretes.MemoryPostDao;
import DataBase.Concretes.MemoryUserDao;
import Entities.Concretes.Image;
import Entities.Concretes.Post;
import Entities.Concretes.PostText;
import Entities.Concretes.User;
import Entities.Concretes.Video;
public class Main {

	public static void main(String[] args) {
		
		MemoryPostDao memoryPostDao= new MemoryPostDao();
		BasePostManager<PostText> postTextManager = new PostTextManager(new MemoryPostDao(), new AuthManager(new MemoryUserDao()));
		BasePostManager<Video> videoPostManager = new VideoPostManager(new MemoryPostDao(), new AuthManager(new MemoryUserDao()));
		BasePostManager<Image> imagePostManager = new ImagePostManager(new MemoryPostDao(), new AuthManager(new MemoryUserDao()));
		MemoryUserDao memoryUserDao = new MemoryUserDao();
		UserManager userManager = new  UserManager(new MemoryUserDao(),new AuthManager(new MemoryUserDao()));
		AuthManager authManager= new AuthManager(new MemoryUserDao());
	
		PostText post10= new PostText(1,1,"sddsdasadsad", null,null);
//		for(Post post:memoryPostDao.getAllPost()) {
//			System.out.println(post.getUserId());
//		}
		memoryPostDao.addPost(post10);
		
		for(Post post:memoryPostDao.getAllPost()) {
			System.out.println(post.getUserId());
		}
		
	
		
		
	
	}
}
	
