package com.sfeir.octopus.back.server.dao.impl;

import java.util.List;

import com.googlecode.objectify.ObjectifyService;
import com.sfeir.octopus.back.server.dao.ArticleDAO;
import com.sfeir.octopus.back.shared.model.Article;

public class ObjectifyArticleDAO extends ObjectifyGenericDAO<Article> implements ArticleDAO {

	static {
		ObjectifyService.register(Article.class);
	}
	
	@Override
	public List<Article> listAll() throws RuntimeException, Error {
		return super.listAll(Article.class);
	}

}
