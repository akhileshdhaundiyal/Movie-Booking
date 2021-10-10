package com.booking.demo.repositories;

import java.util.Set;

import com.booking.demo.entities.Movie;
import com.booking.demo.entities.MovieId;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, MovieId> {

    public Set<Movie> findByCityName(String city);
    
}
