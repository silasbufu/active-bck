package com.iuri.active_bck.entity.event;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "event_location")
public class EventLocation {

	private Integer locationId;
	private String name;
	private String address;
	private String phone;
	private String email;
	private String coordinates;
	private Integer defaultLocation;
	private Integer eventType;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "event_location_gen")
	@SequenceGenerator(name = "event_location_gen", sequenceName = "event_location_location_id_seq")
	@Column(name = "location_id")
	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}

	public Integer getDefaultLocation() {
		return defaultLocation;
	}

	public void setDefaultLocation(Integer defaultLocation) {
		this.defaultLocation = defaultLocation;
	}

	public Integer getEventType() {
		return eventType;
	}

	public void setEventType(Integer eventType) {
		this.eventType = eventType;
	}

}
