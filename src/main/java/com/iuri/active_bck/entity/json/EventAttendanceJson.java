package com.iuri.active_bck.entity.json;

public class EventAttendanceJson {

	private Integer userId;
	private Integer eventId;
	private Integer userAttendanceStatus;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getEventId() {
		return eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	public Integer getUserAttendanceStatus() {
		return userAttendanceStatus;
	}

	public void setUserAttendanceStatus(Integer userAttendanceStatus) {
		this.userAttendanceStatus = userAttendanceStatus;
	}

}
