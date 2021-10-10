package com.booking.demo.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.booking.demo.enums.SeatStatus;

import lombok.Data;

@Data
@Entity
@Table(name = "event_venue_map")
public class EventVenueMap {

    @Id
    private String eventSeatId;
    private String eventId;

    @Enumerated(EnumType.STRING)
    private SeatStatus status;
    
    private String canUpdateNextAfter;
    
    @OneToOne
    @JoinColumn(name = "seat_id")
    private VenueSeatMap venueSeatMap;
}
