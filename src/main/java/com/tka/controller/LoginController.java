package com.tka.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class LoginController {
	@Autowired
	LoginService loginService;

	@GetMapping("/")
	public String openLoginPage() {
		return "login";
	}

	@GetMapping("logincheck")
	public String loginCheck(@ModelAttribute User user,Model model) {
		System.err.println("USER: "+user);
		boolean correct=loginService.loginCheck(user);
		System.err.println("correct: "+correct);
		if(correct) {
		/*	ArrayList<User> list = new ArrayList<User>();
			list.add(new User("abc"," 20"));
			list.add(new User("jjj", "24"));
			list.add(new User("kkk", "23"));
			list.add(new User("lll", "21"));
			model.addAttribute("userList",list);*/
			List<Player> list= loginService.playerList();
			model.addAttribute("playerlist",list);
		return "players";
		}else {
			model.addAttribute("msg", "Wrong Creadentials");
			return "login";
		}
	}
}
