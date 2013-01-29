package com.sfeir.octopus.back.client.rpc;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.sfeir.octopus.back.shared.model.Income;

import java.util.List;

public interface IncomeServiceAsync {

    public void addOrUpdate(Income income, AsyncCallback<Void> callback);
    public void delete(Income income, AsyncCallback<Void> callback);
    public void listAll( AsyncCallback<List<Income>> callback);
}
