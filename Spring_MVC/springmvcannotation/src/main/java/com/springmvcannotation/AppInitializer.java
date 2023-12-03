package com.springmvcannotation;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//this is equal to web.xm in java based configuration
//this is used to register DispatcherServlet
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[] { WebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}	
}
