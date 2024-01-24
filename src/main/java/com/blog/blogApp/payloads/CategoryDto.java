package com.blog.blogApp.payloads;

import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Validated
public class CategoryDto {

    private Integer categoryId;

    @NotEmpty
    @Size (min = 4)
    private String title;

    @NotEmpty
    @Size (min = 10)
    private String description;
    
}
