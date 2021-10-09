package com.booking.demo.dto;

import com.booking.demo.enums.SeatClass;
import com.booking.demo.enums.SeatStatus;

import lombok.Data;

@Data
public class Seat {

    private String id;
    private SeatClass seatClass;
    private SeatStatus status;
    
}
