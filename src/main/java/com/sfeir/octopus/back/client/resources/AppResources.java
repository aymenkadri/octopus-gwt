package com.sfeir.octopus.back.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.ImageResource;

public interface AppResources extends ClientBundle {
	
	@Source("OctopusStyle.css")
	OctopusStyle octopusStyle();

	public interface AppImageResources extends AppResources {
		
		@Source("images/logo_vega_65p.png")
		ImageResource logoOctopus();
		
	}

	

	public interface OctopusStyle extends CssResource {

	}
}
