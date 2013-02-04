package com.sfeir.octopus.back.server.rpc;

import org.apache.log4j.Logger;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.googlecode.objectify.ObjectifyService;
import com.sfeir.octopus.back.client.rpc.InitializationService;
import com.sfeir.octopus.back.server.dao.impl.ObjectifyArticleDAO;
import com.sfeir.octopus.back.shared.model.Article;

import javax.inject.Inject;

@SuppressWarnings("serial")
public class InitializationServiceImpl  extends RemoteServiceServlet implements InitializationService {

    private final static Logger LOGGER = Logger.getLogger(InitializationServiceImpl.class.getSimpleName());

    private ObjectifyArticleDAO articleDAO = new ObjectifyArticleDAO();

    @Inject
    public InitializationServiceImpl() {
    }

	@Override
	public void initParagraphes() {
	}

	@Override
	public void initTest() {
		ObjectifyService.register(Article.class);
		LOGGER.info("Register");
		
		Article article = new Article();
		article.setTitle("Test");
		LOGGER.info("Article instanciation");
		
		articleDAO.addOrUpdate(article);
		LOGGER.info("Sauoctopusrde");
		
	}

}
