package ru.vsu.cs.gasstation.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class GasStationWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{GasStationConfiguration.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
