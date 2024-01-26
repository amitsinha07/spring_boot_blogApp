package com.blog.blogApp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.blogApp.models.Category;
import com.blog.blogApp.models.Post;
import com.blog.blogApp.models.User;

public interface PostRepo extends JpaRepository<Post, Integer> {
    
    List<Post> findByUser(User user);
    List<Post> findByCategory(Category category);
    List<Post> findByTitleContaining(String title);
}
