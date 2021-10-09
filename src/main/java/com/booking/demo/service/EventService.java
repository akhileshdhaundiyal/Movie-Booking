package com.booking.demo.service;

import java.util.Set;

import com.booking.demo.entities.Event;
import com.booking.demo.repositories.EventRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EventService {

    private final EventRepository eventRepository;
    
    public Set<Event> getMoviesByCity(String city) {

        if (city.isEmpty())
            return null;
        
        Set<Event> movies = eventRepository.findByVenuesCity(city);
        return movies;
    }
}