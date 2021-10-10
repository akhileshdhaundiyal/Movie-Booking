package com.booking.demo.controller;

import java.util.List;
import java.util.Set;

import com.booking.demo.dto.BookingFilter;
import com.booking.demo.entities.Event;
import com.booking.demo.entities.Movie;
import com.booking.demo.entities.Venue;
import com.booking.demo.service.EventService;
import com.booking.demo.service.MovieService;
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
    private final MovieService movieService;
    private final VenueService venueService;
    
    //testing if service is up
    @GetMapping("/")
    public String home() {
        return "Working ...";
    }

    // Browse movie catalogues by city
    @GetMapping("/movies/{city}")
    public Set<Movie> getMoviesByCity( @PathVariable("city") String city) {
        return movieService.getMoviesByCity(city);
    }

    // Browse theatres currently running the show (movie selected) in the town, including show timing by a chosen date
    @PostMapping("/theatre")
    public List<Venue> getTheatres( @RequestBody BookingFilter filter) {
        return venueService.getTheatres(filter);
    }

    // Book movie tickets by selecting a theatre, timing, and preferred seats for the day
    @PostMapping("/book")
    public void bookTickets( @RequestBody BookingFilter filter) {

    }
    
}