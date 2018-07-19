package org.lightjune.closewiki.prototype.helloworld.dataservice;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class HelloRowMapper implements RowMapper<HelloVO> {

    @Override
    public HelloVO mapRow(ResultSet rs, int rowNum) throws SQLException {
        HelloVO helloVO = new HelloVO();

        helloVO.setString(rs.getString("string"));

        return helloVO;
    }

}
