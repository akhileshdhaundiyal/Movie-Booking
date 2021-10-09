package com.booking.demo.repositories;

import java.util.Calendar;
import java.util.List;

import com.booking.demo.entities.Venue;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VenueRepository extends JpaRepository<Venue, Integer> {

    public List<Venue> findByEventsNameAndEventsDate(String name, Calendar date);

}
