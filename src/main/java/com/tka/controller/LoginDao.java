package com.tka.controller;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDao {
	@Autowired
	SessionFactory factory;

	public boolean loginCheck(User user) {
		System.err.println("Im in DAO: ");
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.eq("uname", user.getUname()));
		criteria.add(Restrictions.eq("password", user.getPassword()));
		List<User> listUsers = criteria.list();
		if (listUsers != null && listUsers.size() == 1) {
			return true;
		} else {
			return false;
		}
	}

	public List<Player> playerList() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		List<Player> playerList = criteria.list();
		for (Player list : playerList) {
			System.out.println(list);
		}
		return playerList;
	}
}
