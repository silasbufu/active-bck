package com.iuri.active_bck.entity.event;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.iuri.active_bck.entity.json.EventAttendanceId;

@Entity
@Table(name = "event_attendance")
public class EventAttendance {

	private EventAttendanceId pk = new EventAttendanceId();
	private Integer userAttendanceStatus;

	@EmbeddedId
	@AttributeOverrides({
		@AttributeOverride(name = "userId", column = @Column(name = "user_id", nullable = false)),
		@AttributeOverride(name = "eventId", column = @Column(name = "event_id", nullable = false)),
	})
	public EventAttendanceId getPk(){
		return pk;
	}
	
	public void setPk(EventAttendanceId pk){
		this.pk = pk;
	}

	public Integer getUserAttendanceStatus() {
		return userAttendanceStatus;
	}

	public void setUserAttendanceStatus(Integer userAttendanceStatus) {
		this.userAttendanceStatus = userAttendanceStatus;
	}
	
	
	
}
