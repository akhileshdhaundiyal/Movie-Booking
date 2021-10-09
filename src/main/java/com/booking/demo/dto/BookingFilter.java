package com.booking.demo.dto;

import java.util.Calendar;
import java.util.List;

import lombok.Data;

@Data
public class BookingFilter {

    private Calendar date;
    private String cityName;
    private String eventName;
    private String venueName;
    private List<Seat> seats;

}
