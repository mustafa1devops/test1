package com.cs.stockholm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cs.stockholm.domain.Attendee;

public interface AttendeeRepository extends JpaRepository<Attendee, Long> {

}
