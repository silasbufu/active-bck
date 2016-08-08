package com.iuri.active_bck.repository.guest;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iuri.active_bck.entity.guest.Guest;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Integer>{
	public List<Guest> findByEventId(Integer eventId);
}
