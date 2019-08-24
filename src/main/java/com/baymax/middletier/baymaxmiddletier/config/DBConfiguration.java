package com.baymax.middletier.baymaxmiddletier.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DBConfiguration {

    @Autowired
    AppProperties appProperties;

    @Bean
    public JdbcTemplate postgresqlJDBCTemplate(){

        DriverManagerDataSource ds = new DriverManagerDataSource();

        ds.setDriverClassName(appProperties.getDbDriver());
        ds.setUrl(appProperties.getDbUrl());
        ds.setUsername(appProperties.getDbUsername());
        ds.setPassword(appProperties.getDbPassword());

        return new JdbcTemplate(ds);
    }

}
