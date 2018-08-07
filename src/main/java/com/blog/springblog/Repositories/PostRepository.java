package com.blog.springblog.Repositories;

import com.blog.springblog.Models.Post;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
	Post findById(int id);
}