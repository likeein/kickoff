package com.teamcommit.kickoff.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/main")
	public String main() {
		String view = "/main";
		
		return view;
	}
}
