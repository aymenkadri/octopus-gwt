package com.sfeir.octopus.back.server.rpc;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.googlecode.objectify.ObjectifyService;
import com.sfeir.octopus.back.client.rpc.IncomeService;
import com.sfeir.octopus.back.server.dao.impl.ObjectifyArticleDAO;
import com.sfeir.octopus.back.server.dao.impl.ObjectifyIncomeDAO;
import com.sfeir.octopus.back.shared.model.Article;
import com.sfeir.octopus.back.shared.model.Income;
import org.apache.log4j.Logger;

import javax.inject.Inject;
import java.util.List;

@SuppressWarnings("serial")
public class IncomeServiceImpl extends RemoteServiceServlet implements IncomeService {


    @Inject
    public IncomeServiceImpl() {
    }

    @Override
    public void addOrUpdate(Income income) {
        LOGGER.info("IncomeServiceImpl.addOrUpdate");
        incomeDAO.addOrUpdate(income);
    }

    @Override
    public void delete(Income income) {
        incomeDAO.delete(income);
    }

    @Override
    public List<Income> listAll() {
        return incomeDAO.listAll();
    }

    private final static Logger LOGGER = Logger.getLogger(IncomeServiceImpl.class.getSimpleName());
	
	private ObjectifyIncomeDAO incomeDAO = new ObjectifyIncomeDAO();
	


}
