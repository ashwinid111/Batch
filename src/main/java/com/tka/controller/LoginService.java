package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
	@Autowired
	LoginDao dao;

	public boolean loginCheck(User user) {
		System.err.println("in service");
		return dao.loginCheck(user);
	}
	
	public List<Player> playerList(){
		return dao.playerList();
	}

}
