package com.iuri.active_bck.entity.guest;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.iuri.active_bck.entity.event.Event;

@Entity
@Table(name = "guest_user")
public class Guest {

	private Integer guestId;
	private String fullName;
	private String role;
	private Integer eventId;

	// private TestEvent event;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "guest_user_gen")
	@SequenceGenerator(name = "guest_user_gen", sequenceName = "guest_user_guest_id_seq")
	@Column(name = "guest_id")
	public Integer getGuestId() {
		return guestId;
	}

	public void setGuestId(Integer guestId) {
		this.guestId = guestId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Integer getEventId() {
		return eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

}
