package com.ugur.jdbcV2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private Integer id;
    private String first_name;
    private String last_name;
    private String email;
    private String street;
    private String street_number;
    private String cip_code;
    private String city;
    private String country;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", street='" + street + '\'' +
                ", street_number='" + street_number + '\'' +
                ", cip_code='" + cip_code + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
