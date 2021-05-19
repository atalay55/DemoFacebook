package Business.Concretes;

import java.util.ArrayList;

import Business.Abstracts.AuthService;
import DataBase.Abstracts.PostDao;
import Entities.Concretes.Image;
import Entities.Concretes.Post;

public class ImagePostManager extends BasePostManager<Image> {

	public ImagePostManager(PostDao postDao, AuthService authService) {
		super(postDao, authService);
		

	

	}	

}
