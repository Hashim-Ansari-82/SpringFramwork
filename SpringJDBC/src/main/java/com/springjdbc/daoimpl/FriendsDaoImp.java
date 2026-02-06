package com.springjdbc.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.springjdbc.dao.FriendsDao;
import com.springjdbc.entites.Friends;

@Component("friends")
public class FriendsDaoImp implements FriendsDao{

	@Autowired
	private JdbcTemplate template;
	
	@Override
	public int insert(Friends friends) {
		String query="insert into Friends Values(?,?,?,?)";
		int insert = template.update(query,friends.getName(),friends.getAge(),friends.getAddress(),friends.getState());
		return insert;
	}

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

}
