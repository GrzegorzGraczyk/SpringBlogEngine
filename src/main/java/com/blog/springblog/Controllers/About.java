package com.blog.springblog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class About {
	@GetMapping("/about")
	public String about(Model modelMap) {
		modelMap.addAttribute("title", "About");
		return "about";
	}
}
