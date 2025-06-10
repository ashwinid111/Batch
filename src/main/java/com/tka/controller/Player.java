package com.tka.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int pid;
	String playerName;
	int playerAge;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerAge() {
		return playerAge;
	}

	public void setPlayerAge(int playerAge) {
		this.playerAge = playerAge;
	}

	public Player(int pid, String playerName, int playerAge) {
		super();
		this.pid = pid;
		this.playerName = playerName;
		this.playerAge = playerAge;
	}

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(String playerName, int playerAge) {
		super();
		this.playerName = playerName;
		this.playerAge = playerAge;
	}

	@Override
	public String toString() {
		return "Player [pid=" + pid + ", playerName=" + playerName + ", playerAge=" + playerAge + "]";
	}

}
