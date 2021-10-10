package com.booking.demo.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class MovieId implements Serializable {

    private Integer id;
    private String title;
    
}
