package com.sfeir.octopus.back.server.dao;

import java.util.List;

import com.sfeir.octopus.back.shared.model.HasId;

public interface GenericDAO<E extends HasId> {

	public void addOrUpdate(final E entity);

	public void delete(final E entity);

	public List<E> listAll(final Class<? extends E> clazz);
}
