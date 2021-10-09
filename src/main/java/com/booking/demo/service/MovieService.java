package com.booking.demo.service;

import java.util.HashSet;
import java.util.Set;

import com.booking.demo.entities.Movie;
import com.booking.demo.repositories.MovieRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;
    
    public Set<Movie> getMoviesByCity(String city) {

        Set<Movie> movies = movieRepository.findByThreatresCity(city);

        if (city.isEmpty() || movies.isEmpty())
            return new HashSet<>();
        
        return movies;
    }
}