package com.sfeir.octopus.back.client;

import com.google.gwt.ajaxloader.client.ClientLocation;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A javascript overlay class for the google.loader.ClientLocation
 javascript
 * object
 *
 * @author Eric B <d...@ebessette.com>
 */
public class ClientLocalizer extends JavaScriptObject {

    /**
     * Overlay types always have protected, zero argument constructors
     */
    protected ClientLocalizer() {}

    /**
     * Get the client's geographic location
     *
     * @return The client's geographic location
     */
    public static native ClientLocation getInstance() /*-{
        alert($wnd.google.loader);
        return $wnd.google.loader.ClientLocation;
     }-*/;

    /**
     * Supplies the low resolution latitude associated with the client's
     IP
     * address
     *
     * @return
     */
    public final native double getLatitude() /*-{
                if ( this.latitude ) {
                        return this.latitude;
                }
                else {
                        return 0;
                }
        }-*/;

    /**
     * Supplies the low resolution longitude associated with the client's
     IP
     * address
     *
     * @return
     */
    public final native double getLongitude() /*-{
                if ( this.longitude ) {
                        return this.longitude;
                }
                else {
                        return 0;
                }
        }-*/;

    /**
     * Supplies the name of the city associated with the client's IP
     address
     *
     * @return
     */
    public final native String getCity() /*-{
                if ( this.address.city ) {
                        return this.address.city;
                }
                else {
                        return null;
                }
        }-*/;

    /**
     * Supplies the name of the country associated with the client's IP
     address
     *
     * @return
     */
    public final native String getCountryName() /*-{
                if ( this.address.country ) {
                        return this.address.country;
                }
                else {
                        return null;
                }
        }-*/;

    /**
     * Supplies the name of the ISO 3166-1 country code associated with
     the
     * client's IP address
     *
     * @return
     */
    public final native String getCountryCode() /*-{
                if ( this.address.country_code ) {
                        return this.address.country_code;
                }
                else {
                        return null;
                }
        }-*/;

    /**
     * Supplies the country specific region name associated with the
     client's IP
     * address
     *
     * @return
     */
    public final native String getRegion() /*-{
                if ( this.address.region ) {
                        return this.address.region;
                }
                else {
                        return null;
                }
        }-*/;
}