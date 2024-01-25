package com.blog.blogApp.services;

import java.util.List;

import com.blog.blogApp.models.Post;
import com.blog.blogApp.payloads.PostDto;

public interface PostService {
    
    //Create
    PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

    //Update
    PostDto updatepost(PostDto postDto, Integer postId);

    //Delete
    void deletePost(Integer postId);
    
    // Get All Posts
    List<PostDto> getAllPosts();

    //Get Single Post
    PostDto getPostById(Integer postId);

    //Get all post by category
    List<PostDto> getPostByCategory(Integer categoryId);

    //Get all posts by user
    List<PostDto> getPostsByUser(Integer userId);

    // Search posts
    List<PostDto> searchPost(String keyword);

}
