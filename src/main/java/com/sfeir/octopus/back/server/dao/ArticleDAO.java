package com.sfeir.octopus.back.server.dao;

import java.util.List;

import com.sfeir.octopus.back.shared.model.Article;

public interface ArticleDAO extends GenericDAO<Article> {

	public void addOrUpdate(Article article) throws RuntimeException, Error;
	public void delete(Article article) throws RuntimeException, Error;
	public List<Article> listAll() throws RuntimeException, Error;
}
