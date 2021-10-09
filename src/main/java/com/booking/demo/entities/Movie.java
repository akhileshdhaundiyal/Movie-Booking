package com.booking.demo.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "movie")
public class Movie {

    @Id
    private Integer id;
    private String name;
    
    @OneToMany
    @JoinColumn(name="city")
    private List<Theatre> theatres;
    
}
