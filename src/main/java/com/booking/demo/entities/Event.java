package com.booking.demo.entities;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.booking.demo.enums.EventType;

import lombok.Data;

@Data
@Entity
@Table(name = "movie")
public class Event {

    @Id
    private Integer id;
    private String name;
    private EventType eventType;
    private Calendar date;
    
    @OneToMany
    @JoinColumn(name="city")
    private List<Venue> venues;
    
}
