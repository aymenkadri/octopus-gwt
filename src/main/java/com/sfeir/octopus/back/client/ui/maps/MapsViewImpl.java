package com.sfeir.octopus.back.client.ui.maps;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.maps.gwt.client.*;

public class MapsViewImpl extends Composite implements MapsView {

    private static ViewImplUiBinder uiBinder = GWT.create(ViewImplUiBinder.class);

    interface ViewImplUiBinder extends UiBinder<Widget, MapsViewImpl> {
    }

    private Presenter presenter;
    GoogleMap theMap = (GoogleMap) GoogleMap.create();

    @UiField(provided=true)
    SimplePanel simplePanelWidget ;


    public MapsViewImpl() {
        MapOptions options  = MapOptions.create() ;

        options.setCenter(LatLng.create(48.8863702, 2.2571804));
        options.setZoom( 6 ) ;
        options.setMapTypeId(MapTypeId.ROADMAP );
        options.setDraggable(true);
        options.setMapTypeControl(true);
        options.setScaleControl(true) ;
        options.setScrollwheel(true) ;

        simplePanelWidget = new SimplePanel();
        simplePanelWidget.setSize("100%","100%");

        theMap = GoogleMap.create(simplePanelWidget.getElement(), options) ;


        Marker marker = Marker.create();
        marker.setMap(theMap);
        marker.setPosition(LatLng.create(48.8863702, 2.2571804));

        InfoWindow infoWindow = InfoWindow.create();
        infoWindow.setPosition(LatLng.create(48.8863702, 2.2571804));
        infoWindow.setContent("Test Info Window");
        infoWindow.open(theMap);

        initWidget(uiBinder.createAndBindUi(this));
        setSize("100%", "600px");
    }

    @Override
    public void setPresenter(final Presenter listener) {
        presenter = listener;
    }

}
