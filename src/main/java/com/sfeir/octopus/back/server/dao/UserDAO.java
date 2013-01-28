package com.sfeir.octopus.back.server.dao;

import java.util.List;

import com.sfeir.octopus.back.shared.model.User;

public interface UserDAO extends GenericDAO<User> {

	public void addOrUpdate(User user) throws RuntimeException, Error;
	public void delete(User user) throws RuntimeException, Error;
	public List<User> listAll() throws RuntimeException, Error;
}
