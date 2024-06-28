package com.example.ShapeBuddyBackend.Repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ShapeBuddyBackend.Entity.Comments;


@Repository
public interface CommentRepo extends CrudRepository<Comments, Integer> {
	
	Comments save(Comments comment);
	ArrayList<Comments> findAll();
	//ArrayList<Comments> findAllByPostId(String postId);

}
