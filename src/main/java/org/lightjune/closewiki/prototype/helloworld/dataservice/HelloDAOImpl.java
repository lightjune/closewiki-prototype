package org.lightjune.closewiki.prototype.helloworld.dataservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("helloDAO")
public class HelloDAOImpl implements HelloDAO {

    private JdbcTemplate jdbcTemplate;

    private static final String HELLO_GET = "SELECT * FROM hello_world";

    @Autowired
    public HelloDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public HelloVO getHello() {
        return jdbcTemplate.queryForObject(HELLO_GET, new HelloRowMapper());
    }

}
