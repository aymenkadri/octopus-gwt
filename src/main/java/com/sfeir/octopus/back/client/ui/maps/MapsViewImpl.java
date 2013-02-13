package com.sfeir.octopus.back.client.ui.maps;

import com.google.gwt.ajaxloader.client.ClientLocation;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.maps.gwt.client.*;
import com.google.maps.gwt.client.places.PlaceDetailsRequest;
import com.google.maps.gwt.client.places.PlacesService;
import com.sfeir.octopus.back.client.ClientLocalizer;
import com.sfeir.octopus.back.client.Position;

public class MapsViewImpl extends Composite implements MapsView {

    private static ViewImplUiBinder uiBinder = GWT.create(ViewImplUiBinder.class);

    interface ViewImplUiBinder extends UiBinder<Widget, MapsViewImpl> {
    }

    private Presenter presenter;

    GoogleMap theMap = (GoogleMap) GoogleMap.create();

    @UiField(provided=true)
    SimplePanel simplePanelWidget ;

    private static LatLng latLng = LatLng.create(0,0) ;

    private native void getGeoLocation() /*-{

     if(null == $wnd.navigator.geolocation) {
       return;
     }

    $wnd.navigator.geolocation.getCurrentPosition(
     @com.sfeir.octopus.back.client.ui.maps.MapsViewImpl::geoLocationCallback(Lcom/sfeir/octopus/back/client/Position;),
     @com.sfeir.octopus.back.client.ui.maps.MapsViewImpl::geoLocationCallbackError(Lcom/google/gwt/core/client/JavaScriptObject;),
     {enableHighAccuracy:true, maximumAge:60000});
    }-*/;
    public static void geoLocationCallback(Position position) {
        latLng = LatLng.create(position.getLatitude(),
                position.getLongitude());
        //MapsViewImpl.position = position;
    }
    public static void geoLocationCallbackError(JavaScriptObject jso) {
    }

    public MapsViewImpl() {
        MapOptions options  = MapOptions.create() ;
        getGeoLocation();

        /*Window.alert("getLatitude: "+latLng.lat());*/

        options.setCenter(latLng);
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
