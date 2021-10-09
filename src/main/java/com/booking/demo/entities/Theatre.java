package com.booking.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "theatre")
public class Theatre {

    @Id
    private Integer id;
    private String name;
    private String city;
    
}
