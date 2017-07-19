package com.mattfirtion.calendar.repository;

import com.mattfirtion.calendar.domain.Event;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the Event entity.
 */
@SuppressWarnings("unused")
@Repository
public interface EventRepository extends JpaRepository<Event,Long> {
    
}
