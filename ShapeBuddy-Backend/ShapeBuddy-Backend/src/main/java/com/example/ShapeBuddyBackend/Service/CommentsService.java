package com.example.ShapeBuddyBackend.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ShapeBuddyBackend.Entity.Comments;
import com.example.ShapeBuddyBackend.Repository.CommentRepo;

@Service
public class CommentsService {
	
	@Autowired
	CommentRepo commentRepo;
	
	public Comments submitCommentToDB(Comments comment) {
		return commentRepo.save(comment);
	}

	public ArrayList<Comments> getAllCommentsForDB(String postId){
		return commentRepo.findAll();
	}
}


	
