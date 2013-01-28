package com.sfeir.octopus.back.server.dao.impl;

import java.util.List;

import com.googlecode.objectify.ObjectifyService;
import com.sfeir.octopus.back.server.dao.UserDAO;
import com.sfeir.octopus.back.shared.model.User;

public class ObjectifyUserDAO extends ObjectifyGenericDAO<User> implements UserDAO {

	static {
		ObjectifyService.register(User.class);
	}
	
	@Override
	public List<User> listAll() throws RuntimeException, Error {
		return super.listAll(User.class);
	}

}
