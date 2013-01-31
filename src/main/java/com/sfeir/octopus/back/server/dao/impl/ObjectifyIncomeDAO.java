package com.sfeir.octopus.back.server.dao.impl;

import com.googlecode.objectify.ObjectifyService;
import com.sfeir.octopus.back.server.dao.IncomeDAO;
import com.sfeir.octopus.back.shared.model.Income;

import java.util.List;

public class ObjectifyIncomeDAO extends ObjectifyGenericDAO<Income> implements IncomeDAO {

    static {
        ObjectifyService.register(Income.class);
    }
	@Override
	public List<Income> listAll() throws RuntimeException, Error {
		return super.listAll(Income.class);
	}

}
