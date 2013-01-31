package com.sfeir.octopus.back.server.dao.impl;

import java.util.List;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;
import com.sfeir.octopus.back.server.dao.GenericDAO;
import com.sfeir.octopus.back.shared.model.HasId;

public class ObjectifyGenericDAO<E extends HasId> implements GenericDAO<E> {
	
	private final static Objectify INSTANCE = ObjectifyService.factory().begin();

	@Override
	public void addOrUpdate(E entity) {

		INSTANCE.save().entity(entity).now();
	}

	@Override
	public void delete(E entity) {
		INSTANCE.delete().entity(entity);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<E> listAll(Class<? extends E> clazz) {
		return (List<E>) INSTANCE.load().type(clazz).list();
	}

}
