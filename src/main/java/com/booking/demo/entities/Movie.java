package com.booking.demo.entities;

import java.util.Calendar;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "movie")
public class Movie {

    @EmbeddedId
    private MovieId movieId;

    private String description;
    private int durationInMins;
    private Calendar releaseDate;
    
    @OneToOne
    @JoinColumn(name = "country_id")
    private City city;

    private String genre;
    private String languages;
    
}
