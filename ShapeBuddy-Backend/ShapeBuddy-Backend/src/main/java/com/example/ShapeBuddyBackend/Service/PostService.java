/*package com.example.ShapeBuddyBackend.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ShapeBuddyBackend.Entity.Post;
import com.example.ShapeBuddyBackend.Repository.PostRepo;

@Service
public class PostService {
	
	@Autowired
	PostRepo postRepo;

	public Post submitPostToDataBase(Post post) {
		return postRepo.save(post);
	}
	
	public ArrayList<Post> retrivePostFromDB(){
		return postRepo.findAll();
	}
	
	
}*/

package com.example.ShapeBuddyBackend.Service;

import com.example.ShapeBuddyBackend.Entity.Post;
import com.example.ShapeBuddyBackend.Repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepo postRepo;

    public List<Post> getAllPosts() {
        return postRepo.findAll();
    }

    public Optional<Post> getPostById(int id) {
        return postRepo.findById(id);
    }

    public Post createPost(Post post) {
        return postRepo.save(post);
    }

    public Post updatePost(int id, Post updatedPost) {
        // Check if the post exists
        if (postRepo.existsById(id)) {
            updatedPost.setId(id); // Ensure the updated post has the correct ID
            return postRepo.save(updatedPost);
        }
        return null; // Or throw an exception if desired
    }

    public void deletePost(int id) {
        postRepo.deleteById(id);
    }
}

