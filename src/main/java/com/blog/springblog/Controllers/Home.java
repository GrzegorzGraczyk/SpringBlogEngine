package com.blog.springblog.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blog.springblog.Models.Post;
import com.blog.springblog.Repositories.PostRepository;

@Controller
public class Home {
	@Autowired
	PostRepository postRepository;

	@GetMapping("/home")
	public String home(Model modelMap) {
		modelMap.addAttribute("title", "Home");
		return "home";
	}

	@GetMapping("/")
	public String homeDefault(Model modelMap) {
		List<Post> allPosts = (List<Post>) postRepository.findAll();
		modelMap.addAttribute("allposts", allPosts);
		modelMap.addAttribute("title", "Home");
		return "home";
	}

}
