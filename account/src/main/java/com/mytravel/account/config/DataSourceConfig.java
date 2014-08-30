package com.mytravel.account.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * Created by qilei on 2014/8/29.
 */
@Configuration
@PropertySource("classpath:jdbc.properties")
public class DataSourceConfig {
    @Resource
    Environment env;

    @Bean
    public DataSource setupDataSource() {
        String driverClassName = env.getProperty("jdbc.driverClassName");
        String url = env.getProperty("jdbc.url");
        String username = env.getProperty("jdbc.username");
        String password = env.getProperty("jdbc.password");
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName(driverClassName);
        ds.setUsername(username);
        ds.setPassword(password);
        ds.setUrl(url);
        return ds;
    }
}
