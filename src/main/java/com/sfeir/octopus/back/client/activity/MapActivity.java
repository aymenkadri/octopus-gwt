package com.sfeir.macabe2012.client.maps;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;
import com.sfeir.macabe2012.client.maps.rpc.RadarService;
import com.sfeir.macabe2012.client.maps.rpc.RadarServiceAsync;
import com.sfeir.macabe2012.shared.entity.Radar;

import java.util.ArrayList;
import java.util.List;

public class MapActivity extends AbstractActivity {

    public interface MapView extends IsWidget {

        public void setRadars(List<Radar> result);
        public void refresh();
    }

    private MapView view = new MapViewImpl();
    private final RadarServiceAsync radarService = GWT
            .create(RadarService.class);

    public MapActivity() {

    }


    public void start(AcceptsOneWidget display, EventBus eventBus) {

        radarService.getAllRadars(new AsyncCallback<ArrayList<Radar>>() {

            @Override
            public void onFailure(Throwable caught) {
                GWT.log("Erreur de récupération RPC des radars");
            }

            @Override
            public void onSuccess(ArrayList<Radar> result) {
                view.setRadars(result);
                view.refresh();
            }
        });

        display.setWidget(view);
    }

}