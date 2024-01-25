package com.blog.blogApp.payloads;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class PostDto {

    private String title;
    private String content;
    private String imageUrl;
    private Date addedDate;
    private CategoryDto category;
    private UserDto user;
}
