package com.sfeir.octopus.back.server.dao;

import java.util.List;

import com.sfeir.octopus.back.shared.model.Paragraph;
import com.sfeir.octopus.back.shared.model.User;

public interface ParagraphDAO extends GenericDAO<Paragraph> {

	public void addOrUpdate(Paragraph paragraph) throws RuntimeException, Error;
	public void delete(Paragraph paragraph) throws RuntimeException, Error;
	public List<Paragraph> listAll() throws RuntimeException, Error;
}
