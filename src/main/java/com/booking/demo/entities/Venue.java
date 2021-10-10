package com.booking.demo.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.booking.demo.enums.VenueType;

import lombok.Data;

@Data
@Entity
@Table(name = "venue")
public class Venue {

    @Id
    private Integer id;    
    
    @Enumerated(EnumType.STRING)
    private VenueType venueType;

    private String name;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    private String town;
    private int noOfSeats;
    
}
