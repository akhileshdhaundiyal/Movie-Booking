package com.booking.demo.repositories;

import java.util.Set;

import com.booking.demo.entities.Event;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Integer> {

    
}
