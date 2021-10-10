package com.booking.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "city")
public class City {

    @Id
    private Integer id;
    private String name;
    private String countryId;
    private String state;
    private Integer zipCode;
    
}
