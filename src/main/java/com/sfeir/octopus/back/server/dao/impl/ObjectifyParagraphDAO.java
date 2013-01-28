package com.sfeir.octopus.back.server.dao.impl;

import java.util.List;

import com.googlecode.objectify.ObjectifyService;
import com.sfeir.octopus.back.server.dao.ParagraphDAO;
import com.sfeir.octopus.back.shared.model.Paragraph;

public class ObjectifyParagraphDAO extends ObjectifyGenericDAO<Paragraph> implements ParagraphDAO {

	static {
		ObjectifyService.register(Paragraph.class);
	}
	
	@Override
	public List<Paragraph> listAll() throws RuntimeException, Error {
		return super.listAll(Paragraph.class);
	}

}
