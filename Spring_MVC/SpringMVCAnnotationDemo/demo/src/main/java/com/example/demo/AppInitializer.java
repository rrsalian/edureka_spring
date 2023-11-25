package com.example.demo;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// this is equivalent to web.xml in java based configuration
// this is used to register or configure DispatcherServet
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { WebConfig.class };        
    }

    // this will map the url pattern to DispatcherServlet
    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }    
}