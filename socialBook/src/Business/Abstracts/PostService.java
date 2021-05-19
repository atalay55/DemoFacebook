package Business.Abstracts;

import Entities.Concretes.Post;
import Entities.Concretes.User;

public interface PostService {

	void addPostWithText(User user,Post post);
	void deletePost(User user,Post post);
	void addPostVideo(User user,Post post);
	void addPostImage(User user,Post post);
	void addPostWithTextWithTaggedFriend(User user, Post post,int id);
	void deletePostWithTextWithTaggedFriend(User user, Post post,int id);
	
}
