package com.iuri.active_bck.entity.event;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "test_event")
public class TestEvent {

	private Integer eventId;
	private Integer eventType;
	private String eventDate;
	private Integer eventStatus;

	private Set<TestEventAttendance> attendance = new HashSet<TestEventAttendance>(
			0);

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "test_event_gen")
	@SequenceGenerator(name = "test_event_gen", sequenceName = "test_event_event_id_seq")
	@Column(name = "event_id")
	public Integer getEventId() {
		return eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	public Integer getEventType() {
		return eventType;
	}

	public void setEventType(Integer eventType) {
		this.eventType = eventType;
	}

	public String getEventDate() {
		return eventDate;
	}

	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	public Integer getEventStatus() {
		return eventStatus;
	}

	public void setEventStatus(Integer eventStatus) {
		this.eventStatus = eventStatus;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "pk.eventId", cascade = CascadeType.ALL)
	public Set<TestEventAttendance> getAttendance() {
		return this.attendance;
	}

	public void setAttendance(Set<TestEventAttendance> attendance) {
		this.attendance = attendance;
	}

}
