package com.booking.demo.repositories;

import java.util.Set;

import com.booking.demo.entities.Movie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

    Set<Movie> findByThreatresCity(String city);
    
}
