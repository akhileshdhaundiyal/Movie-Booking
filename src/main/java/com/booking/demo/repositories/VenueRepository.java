package com.booking.demo.repositories;

import java.util.Calendar;
import java.util.List;

import com.booking.demo.entities.Venue;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VenueRepository extends JpaRepository<Venue, Integer> {

    @Query ("select v from Venue v where v.id in "
    + "(select e.venue.id from Event e where :date >= e.startDateTime and :date <= e.endDateTime and e.showId in "
    + "(select m.id from Movie m where m.title = :movieName))")
    public List<Venue> findVenues(String movieName, Calendar date);

}
