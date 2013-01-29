package com.sfeir.macabe2012.client.maps;

import com.github.gwtbootstrap.client.ui.Label;
import com.google.gwt.core.client.GWT;
/*import com.google.gwt.maps.client.InfoWindowContent;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.control.LargeMapControl;
import com.google.gwt.maps.client.geom.LatLng;
import com.google.gwt.maps.client.overlay.Marker;*/
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.maps.gwt.client.*;
import com.sfeir.macabe2012.shared.entity.Radar;

import java.util.ArrayList;
import java.util.List;

public class MapViewImpl extends Composite implements MapActivity.MapView
{
    interface MapViewImplUiBinder extends UiBinder<Widget, MapViewImpl> {
    }

    private static MapViewImplUiBinder uiBinder = GWT
            .create(MapViewImplUiBinder.class);

    private List<Radar> listeRadars;

    GoogleMap theMap = (GoogleMap) GoogleMap.create();
    @UiField(provided=true)
    SimplePanel simplePanelWidget ;

    public MapViewImpl()
    {
        listeRadars = new ArrayList<Radar>();

        /* LatLng sfeirCoord = LatLng.newInstance(48.8863702, 2.2571804);

map = new MapWidget(sfeirCoord, 2);
//map.setSize("90%", "600px");
// Add some controls for the zoom level
map.addControl(new LargeMapControl());
map.setZoomLevel(15);
// Add a marker
map.addOverlay(new Marker(sfeirCoord));

// Add an info window to highlight a point of interest
Label lbl1 = new Label("SFEIR");
InfoWindowContent sfeirInfoWindowContent = new InfoWindowContent(lbl1);
map.getInfoWindow().open(map.getCenter(),
        sfeirInfoWindowContent);*/

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

        theMap = GoogleMap.create( simplePanelWidget.getElement(), options ) ;


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

    /*public MapWidget getMap() {
        return map;
    }

    public void setMap(MapWidget map) {
        this.map = map;
    }*/

    public void setRadars(List listRadars) {
        this.listeRadars = listRadars;
    }

    public void refresh() {
        for (Radar radar : this.listeRadars) {
            Marker marker = Marker.create();
            marker.setMap(theMap);
            marker.setPosition(LatLng.create(radar.getLat(), radar.getLng()));
            /*theMap.addOverlay(new Marker(LatLng.newInstance(radar.getLat(), radar.getLng())));*/
        }
    }
}