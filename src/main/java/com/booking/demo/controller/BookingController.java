package com.booking.demo.controller;

import java.util.List;
import java.util.Set;

import com.booking.demo.dto.BookingFilter;
import com.booking.demo.entities.Event;
import com.booking.demo.entities.Venue;
import com.booking.demo.service.EventService;
import com.booking.demo.service.VenueService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class BookingController {

    private final EventService eventService;
    private final VenueService venueService;
    
    //testing if service is up
    @GetMapping("/")
    public String home() {
        return "Working ...";
    }

    @GetMapping("/movies/{city}")
    public Set<Event> getMoviesByCity(@PathVariable("city") String city) {
        return eventService.getMoviesByCity(city);        
    }

    @PostMapping("/theatre")
    public List<Venue> getTheatres(@RequestBody BookingFilter filter) {
        return venueService.getTheatres(filter);
    }

    @PostMapping("/book")
    public void bookTickets(@RequestBody BookingFilter filter) {

    }
    
}

// Browse movie catalogues by city
// Browse theatres currently running the show (movie selected) in the town, including show timing by a chosen date
// Book movie tickets by selecting a theatre, timing, and preferred seats for the day