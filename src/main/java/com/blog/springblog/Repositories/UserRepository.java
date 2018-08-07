package com.blog.springblog.Repositories;

import com.blog.springblog.Models.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}