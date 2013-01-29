package com.sfeir.octopus.back.server.dao;

import com.sfeir.octopus.back.shared.model.Income;

import java.util.List;

public interface IncomeDAO extends GenericDAO<Income> {

	public void addOrUpdate(Income income) throws RuntimeException, Error;
	public void delete(Income income) throws RuntimeException, Error;
	public List<Income> listAll() throws RuntimeException, Error;
}
