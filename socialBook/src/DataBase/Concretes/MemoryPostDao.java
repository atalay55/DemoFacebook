package DataBase.Concretes;

import java.util.ArrayList;

import DataBase.Abstracts.PostDao;
import Entities.Concretes.Image;
import Entities.Concretes.Post;
import Entities.Concretes.PostText;
import Entities.Concretes.Video;



public class MemoryPostDao implements PostDao {

	ArrayList<String> taggedFriend;
	ArrayList<Post> allPosts;

	public MemoryPostDao() {
		allPosts = new ArrayList<Post>();
		taggedFriend = new ArrayList<String>();
		taggedFriend .add("fatih");
		PostText post1= new PostText(1,1,"sddsdasadsad", null,taggedFriend);
		PostText post2= new PostText(2,1, "sdasdsdassad",null,taggedFriend);
		PostText post3= new PostText(3,2, "sdasdasadsad" ,null,taggedFriend);
		PostText post4= new PostText(4,3,"sdasdsdasad" ,null,taggedFriend );
		Video videoPost = new Video(5, "videos", null,taggedFriend,5);
		Image imagePost = new Image(6,"resim.png",null,taggedFriend,"sad");
		allPosts.add(post1);allPosts.add(post2);allPosts.add(post3);allPosts.add(post4);allPosts.add(videoPost);allPosts.add(imagePost);
	}

	@Override

	public void addPost(Post post) {
	
		allPosts.add(post);
		}
		


	@Override
	public void deletePost(Post post) {
	allPosts.remove(post.getId());
		
	}



	@Override
	public ArrayList<Post> getAllPost() {
		return allPosts;
	}




	
}
