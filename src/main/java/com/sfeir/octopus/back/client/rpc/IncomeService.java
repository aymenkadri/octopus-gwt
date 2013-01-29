package com.sfeir.octopus.back.client.rpc;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.sfeir.octopus.back.shared.model.Income;

import java.util.List;

@RemoteServiceRelativePath("incomeService")
public interface IncomeService extends RemoteService {
    public void addOrUpdate(Income income);
    public void delete(Income income);
    public List<Income> listAll();
}
