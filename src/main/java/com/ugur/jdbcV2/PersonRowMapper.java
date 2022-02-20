package com.ugur.jdbcV2;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonRowMapper implements RowMapper<Person> {
    @Override
    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {

        Person result = new Person();
        result.setId(rs.getInt("id"));
        result.setFirst_name(rs.getString("first_name"));
        result.setLast_name(rs.getString("last_name"));
        result.setEmail(rs.getString("email"));
        result.setStreet(rs.getString("street"));
        result.setStreet_number(rs.getString("street_number"));
        result.setCip_code(rs.getString("cip_code"));
        result.setCity(rs.getString("city"));
        result.setCountry(rs.getString("country"));

        return result;
    }
}
