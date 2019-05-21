package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.ws.rs.core.Application;


import org.jboss.resteasy.plugins.interceptors.CorsFilter;
import rest.Rest;

public class MyApp extends Application{
	Set<Object> singletons;

	@Override
    public Set<Class<?>> getClasses() {
		Set<Class<?>> set = new HashSet<Class<?>>();
		set.add(Rest.class);
		return set;
	}

	@Override
	public Set<Object> getSingletons() {
		if (singletons == null) {
			CorsFilter corsFilter = new CorsFilter();
			corsFilter.getAllowedOrigins().add("*");

			singletons = new LinkedHashSet<Object>();
			singletons.add(corsFilter);
		}
		return singletons;
	}
}
