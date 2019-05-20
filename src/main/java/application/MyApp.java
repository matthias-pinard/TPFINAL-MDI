package application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;


import rest.Rest;

public class MyApp extends Application{
	@Override
    public Set<Class<?>> getClasses() {
		Set<Class<?>> set = new HashSet<Class<?>>();
		set.add(Rest.class);
		return set;
	}}
