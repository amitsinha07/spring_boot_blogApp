package com.blog.blogApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.blogApp.models.User;

public interface UserRepo extends JpaRepository<User, Integer> {
    
}
