/*package com.example.ShapeBuddyBackend.Repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ShapeBuddyBackend.Entity.Post;

@Repository
public interface PostRepo extends CrudRepository<Post, Integer>{

	Post save(Post post);
	ArrayList<Post> findAll();
	
}*/

package com.example.ShapeBuddyBackend.Repository;

import com.example.ShapeBuddyBackend.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepo extends JpaRepository<Post, Integer> {
    // Additional custom query methods can be defined here if needed
}

