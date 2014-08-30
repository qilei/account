package com.mytravel.account.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

public class WebAppInitializer extends
        AbstractAnnotationConfigDispatcherServletInitializer {

    //{!begin addToRootContext}
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{CoreConfig.class, DataSourceConfig.class, MyBatisConfig.class};
    }
    //{!end addToRootContext}

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected Filter[] getServletFilters() {

        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        return new Filter[]{characterEncodingFilter};
    }

}
