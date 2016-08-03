package com.iuri.active_bck.entity.event;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.iuri.active_bck.entity.user.User;

@Entity
@Table(name = "test_event")
public class TestEvent {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "test_event_gen")
	@SequenceGenerator(name = "test_event_gen", sequenceName = "test_event_event_id_seq")
	@Column(name = "event_id")
	private Integer eventId;

	@ManyToMany
	private Collection<User> users;

	public Integer getEventId() {
		return eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	public Collection<User> getUsers() {
		return users;
	}

	public void setUsers(Collection<User> users) {
		this.users = users;
	}

}
