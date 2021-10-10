package com.booking.demo.entities;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.booking.demo.enums.EventType;

import lombok.Data;

@Data
@Entity
@Table(name = "event")
public class Event {

    @Id
    private Integer id;
    private String showId; //FK?
    
    @OneToMany
    @JoinColumn(name = "venue_id")
    private List<Venue> venue;
    
    @Enumerated(EnumType.STRING)
    private EventType eventType;

    private Calendar startDateTime;
    private Calendar endDateTime;
    
}
