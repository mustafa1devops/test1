package com.cs.stockholm.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs.stockholm.domain.Attendee;
import com.cs.stockholm.repository.AttendeeRepository;

@Service
@Transactional
public class AttendeeService {

	@Autowired
	private AttendeeRepository repo;

	public List<Attendee> listall() {
		return repo.findAll();

	}

	public void save(Attendee attendee) {
		repo.save(attendee);
	}

	public Attendee get(Long id) {
		return repo.findById(id).get();
	}

	public void delete(Long id) {
		repo.deleteById(id);
	}

}
