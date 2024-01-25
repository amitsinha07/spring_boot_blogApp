package com.blog.blogApp.payloads;

import java.util.Date;

import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Validated
public class PostDto {

    private Integer postId;

    @NotEmpty 
    @Size (min = 10)
    private String title;

    @NotEmpty 
    @Size (min = 15)
    private String content;
    private String imageUrl;
    private Date addedDate;
    private CategoryDto category;
    private UserDto user;
}
