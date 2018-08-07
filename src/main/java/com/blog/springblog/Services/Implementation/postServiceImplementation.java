package com.blog.springblog.Services.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.springblog.Models.Post;
import com.blog.springblog.Repositories.PostRepository;
import com.blog.springblog.Services.PostService;

@Service
public class postServiceImplementation implements PostService {

	private PostRepository postRepository;

	@Autowired
	public postServiceImplementation(PostRepository postRepository) {
		this.postRepository = postRepository;
	}

	@Override
	public Post findById(int id) {
		return postRepository.findById(id);
	}
}
