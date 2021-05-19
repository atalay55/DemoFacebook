package DataBase.Abstracts;

import java.util.ArrayList;

import Entities.Concretes.Post;


public interface PostDao {
	void addPost(Post post);
	void deletePost(Post post);
	ArrayList<Post> getAllPost();

}
