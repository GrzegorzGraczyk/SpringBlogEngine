package com.blog.springblog.Services;

import com.blog.springblog.Models.Post;

public interface PostService {
	Post findById(int id);
}
