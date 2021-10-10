package com.booking.demo.service;

import java.util.List;

import com.booking.demo.dto.BookingFilter;
import com.booking.demo.entities.Venue;
import com.booking.demo.repositories.VenueRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VenueService {

    private final VenueRepository venueRepository;
    
    public List<Venue> getTheatres(BookingFilter filter) {

        if(filter == null || filter.getEventName().isEmpty() || filter.getDate() == null)
            return null;
        
        List<Venue> theatres = venueRepository.findVenues(filter.getEventName(), filter.getDate());
        return theatres;
    }
    
}
