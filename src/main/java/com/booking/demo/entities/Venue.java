package com.booking.demo.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.booking.demo.enums.VenueType;

import lombok.Data;

@Data
@Entity
@Table(name = "theatre")
public class Venue {

    @Id
    private Integer id;
    private String name;
    private VenueType venueType;
    private String city;

    @OneToMany
    @JoinColumn(name="event")
    private List<Event> events;
    
}
