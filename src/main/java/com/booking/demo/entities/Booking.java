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
@Table(name = "booking")
public class Booking {

    @Id
    private String bookingId;
    private Integer userId;
    private long price; 

    @OneToMany
    @JoinColumn(name = "event_seat_id")
    private List<EventVenueMap> eventVenueMap;
    
}
