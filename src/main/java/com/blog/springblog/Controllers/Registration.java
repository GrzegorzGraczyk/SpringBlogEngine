package com.blog.springblog.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blog.springblog.Models.User;
import com.blog.springblog.Repositories.UserRepository;

@Controller
public class Registration {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@RequestMapping(path = "/registration")
	public String showForm(Model model) {
		model.addAttribute("user", new User());
		return "registration";
	}

	@RequestMapping(path = "/add")
	public String create(String login, String password) {
		User user = new User(login, passwordEncoder.encode(password));
		userRepository.save(user);
		return "redirect:/";
	}

}
