package com.iuri.active_bck.constants;

public enum EventType {

	INACTIVE(0),
	ACTIVE(1);
	
	private final Integer eventType;

	EventType(Integer eventType) {
		this.eventType = eventType;
	}

	public Integer getEventType() {
		return this.eventType;
	}
	
}
