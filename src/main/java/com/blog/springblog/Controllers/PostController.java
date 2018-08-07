package com.blog.springblog.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blog.springblog.Models.Post;
import com.blog.springblog.Repositories.PostRepository;
import com.blog.springblog.Services.PostService;

@Controller
public class PostController {
	@Autowired
	private PostRepository postRepository;

	@Autowired
	private PostService postService;

	@RequestMapping(path = "/addpost")
	public String showForm(Model model) {
		model.addAttribute("post", new Post());
		return "addpost";
	}

	@RequestMapping(path = "/sendpost")
	public String create(String title, String article) {
		Post post = new Post(title, article);
		postRepository.save(post);
		return "redirect:/";
	}

	@RequestMapping("/post/{id}")
	public String viewPost(@PathVariable("id") int id, Model model) {
		Post post = postService.findById(id);
		model.addAttribute("post", post);
		return "singlepost";
	}

}
