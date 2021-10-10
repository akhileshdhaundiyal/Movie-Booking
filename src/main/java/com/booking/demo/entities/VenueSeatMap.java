package com.booking.demo.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.booking.demo.enums.SeatClass;

import lombok.Data;

@Data
@Entity
@Table(name = "venue_seat_map")
public class VenueSeatMap {

    @Id
    private String seatId;
    private String venueId;
    private int seatNo;

    @Enumerated(EnumType.STRING)
    private SeatClass seatClass;
    
}
