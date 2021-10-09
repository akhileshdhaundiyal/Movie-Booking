package com.booking.demo.dto;

import java.util.Calendar;
import java.util.List;

import lombok.Data;

@Data
public class BookingFilter {

    private Calendar date;
    private String cityName;
    private String theatreName;
    private List<Integer> seats;

}
