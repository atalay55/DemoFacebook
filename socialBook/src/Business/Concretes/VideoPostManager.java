package Business.Concretes;

import java.util.ArrayList;

import Business.Abstracts.AuthService;
import DataBase.Abstracts.PostDao;
import Entities.Concretes.Post;
import Entities.Concretes.Video;

public class VideoPostManager extends BasePostManager<Video> {

	public VideoPostManager(PostDao postDao, AuthService authService) {
		super(postDao, authService);
		// TODO Auto-generated constructor stub
	}

	


}
