package com.baymax.middletier.baymaxmiddletier.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TestDaoImpl implements ITestDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void testConnection(){

        System.out.println(jdbcTemplate.queryForMap("select 1"));

    }

}
