package com.iuri.active_bck.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "test_table")
public class TestEntity {

	@Id
	@GeneratedValue
	@Column(name = "test_id")
	private int testId;
	@Column(name = "test_string")
	private String testString;

	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public String getTestString() {
		return testString;
	}

	public void setTestString(String testString) {
		this.testString = testString;
	}

}
